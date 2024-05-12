package ma.fs.hospital.web;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ma.fs.hospital.entities.Patient;
import ma.fs.hospital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@AllArgsConstructor
public class PatientController {

    private PatientRepository patientRepository;
    @GetMapping("/index")
    public String index(Model model, @RequestParam(name = "page" , defaultValue = "0") int p,
                        @RequestParam(name="size",defaultValue = "4") int s,
                        @RequestParam(name="keyword",defaultValue = "") String kw
    ){
        Page<Patient> pagePatients=patientRepository.findByNomContains(kw,PageRequest.of(p,s));
        model.addAttribute("listPatients",pagePatients.getContent());
        model.addAttribute("pages",new int [pagePatients.getTotalPages()]);
        model.addAttribute("currentPage",p);
        model.addAttribute("keyword",kw);
        return "patients";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam(name="id") Long id,
                         @RequestParam(name="keyword",defaultValue = "") String keyword,
                         @RequestParam(name="page" , defaultValue = "0") int page){
        patientRepository.deleteById(id);
        return "redirect:/index?page="+page+"&keyword="+keyword;
    }
    @GetMapping("/")
    public String home(){
        return "redirect:/index";
    }
    @GetMapping("/formPatients")
    public String formPatients(Model model){
        model.addAttribute("patient",new Patient());
        return "formPatients";
    }
    @PostMapping(path = "/save")
    public String save(@RequestParam(required = false) Long id,
                       @RequestParam String nom,
                       @RequestParam String dateNaissance,
                       @RequestParam(defaultValue = "false") boolean malade,
                       @RequestParam int score,
                       @RequestParam(defaultValue = "0") int page,
                       @RequestParam(defaultValue = "") String keyword) {

        // Convert the dateNaissance String to a java.util.Date object
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parsedDate;
        try {
            parsedDate = dateFormat.parse(dateNaissance);
        } catch (java.text.ParseException e) {
            // Handle the parse exception, for example, by logging it
            e.printStackTrace();
            // You might want to return an error view or redirect to the form
            return "redirect:/index";
        }

        Patient patient;

        if (id != null) {
            // Editing an existing patient
            patient = patientRepository.findById(id).orElse(null);
            if (patient == null) {
                // Handle case where patient with given ID is not found
                return "redirect:/index";
            }
        } else {
            // Adding a new patient
            patient = new Patient();
        }

        patient.setNom(nom);
        patient.setDataNaissance(parsedDate);
        patient.setMalade(malade);
        patient.setScore(score);

        patientRepository.save(patient);

        return "redirect:/index?page="+page+"&keyword"+keyword;
    }
    /*@PostMapping(path="/save")
    public String save(Model model, @Valid Patient patient, BindingResult bindingResult)
    {
        if(bindingResult.hasErrors()) return "formPatients";
        patientRepository.save(patient);
        return "redirect:/index";
    }*/
    @GetMapping("/editPatient")
    public String editPatient(Model model,Long id ,String keyword,int page){
        Patient patient=patientRepository.findById(id).orElse(null);
        if(patient==null) throw new RuntimeException("Patient Introuvable");
        model.addAttribute("patient",patient);
        model.addAttribute("page",page);
        model.addAttribute("keyword",keyword);
        return "editPatient";
    }

}
