package ma.fs.hospital.service;

import ma.fs.hospital.entities.Consultation;
import ma.fs.hospital.entities.Medecin;
import ma.fs.hospital.entities.Patient;
import ma.fs.hospital.entities.RendezVous;

public interface IHospitalService {
     Patient savePatient(Patient patient);
     Medecin saveMedecin(Medecin medecin);
     RendezVous saveRDV(RendezVous rendezVous);
     Consultation saveConsultation(Consultation consultation);


}
