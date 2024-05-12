package ma.fs.hospital;

import ma.fs.hospital.entities.Patient;
import ma.fs.hospital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HospitalApplication implements CommandLineRunner {

	@Autowired
	private PatientRepository patientRepository;

	public static void main(String[] args) {
		SpringApplication.run(HospitalApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		patientRepository.save(new Patient(null,"kinane",new Date(),false,136));
		patientRepository.save(new Patient(null,"loubna",new Date(),false,5130));
		patientRepository.save(new Patient(null,"zayne",new Date(),true,147));


	}
}

