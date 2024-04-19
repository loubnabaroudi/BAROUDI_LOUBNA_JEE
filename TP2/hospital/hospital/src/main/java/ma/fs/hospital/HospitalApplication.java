package ma.fs.hospital;

import ma.fs.hospital.entities.*;
import ma.fs.hospital.repositories.ConsultationRepository;
import ma.fs.hospital.repositories.MedecinRepository;
import ma.fs.hospital.repositories.PatientRepository;
import ma.fs.hospital.repositories.RendezVousRepository;
import ma.fs.hospital.service.IHospitalService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class HospitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalApplication.class, args);
	}

	@Bean
	CommandLineRunner start( IHospitalService hospitalService,
							 PatientRepository patientRepository,
							 RendezVousRepository rendezVousRepository,
							 MedecinRepository medecinRepository
			){

		return  args -> {
			Stream.of("mohamed" , "hassan" , "najat")
					.forEach(name -> {
						Patient patient = new Patient();
						patient.setNom(name);
						patient.setDateNaissance(new Date());
						patient.setMalade(false);
						hospitalService.savePatient(patient);
					});


			Stream.of("aymane" , "hanane" , "yassmine")
					.forEach(name -> {
						Medecin medecin = new Medecin();
						medecin.setNom(name);
						medecin.setEmail(name + "@gmail.com");
						medecin.setSpecialite(Math.random()>0.5?"Cardio":"Dentiste");
						hospitalService.saveMedecin(medecin);

					});

			Patient patient = patientRepository.findById(1L).orElse(null);
			Patient patient1 = patientRepository.findByNom("mohamed");


			Medecin medecin = medecinRepository.findByNom("yassmine");

			RendezVous rendezVous = new RendezVous();
			rendezVous.setDate(new Date());
			rendezVous.setStatus(StatusRDV.PENDING);
			rendezVous.setMedecin(medecin);
			rendezVous.setPatient(patient);
			hospitalService.saveRDV(rendezVous);

			RendezVous rendezVous1 = rendezVousRepository.findAll().get(0);
			Consultation consultation = new Consultation();
			consultation.setDateConsultation(new Date());
			consultation.setRendezVous(rendezVous1);
			consultation.setRapport("rapport de la consultation........");
			hospitalService.saveConsultation(consultation);

		};

	}

}
