package ma.fs.hospital.repositories;

import ma.fs.hospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {

    Patient findByNom(String name);
}
