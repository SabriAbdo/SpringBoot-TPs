package ma.emsi.hopital;

import ma.emsi.hopital.entities.Patient;
import ma.emsi.hopital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HopitalApplication implements CommandLineRunner {
	@Autowired
	private PatientRepository patientRepository;
	public static void main(String[] args) {
		SpringApplication.run(HopitalApplication.class, args);
	}
	@Override
	public void run (String... args) throws Exception{

	/* Insertion Des Données en DB */
	patientRepository.save(new Patient(null , "Ethan" , new Date() , true, 22) );
	patientRepository.save(new Patient(null , "Ava" , new Date() , false, 28) );
	patientRepository.save(new Patient(null , "Mia" , new Date() , true, 39) );
	patientRepository.save(new Patient(null , "James" , new Date() , false, 31) );
	patientRepository.save(new Patient(null , "Charlotte" , new Date() , true, 19) );
	patientRepository.save(new Patient(null , "Benjamin" , new Date() , false, 37) );
	patientRepository.save(new Patient(null , "Amelia" , new Date() , true, 26) );
	patientRepository.save(new Patient(null , "Lucas" , new Date() , false, 42) );

	}

}
