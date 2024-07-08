package org_sid1.bank_account_service1;



import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org_sid1.bank_account_service1.entities.BankAccount;
import org_sid1.bank_account_service1.entities.Customer;
import org_sid1.bank_account_service1.enums.AccountType;
import org_sid1.bank_account_service1.repositories.BankAccountRepository;
import org_sid1.bank_account_service1.repositories.CustomerRepository;

import java.util.Date;
import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class BankAccountService1Application {

	public static void main(String[] args) {

		SpringApplication.run(BankAccountService1Application.class, args);
	}

	@Bean
	CommandLineRunner start(BankAccountRepository bankAccountRepository, CustomerRepository customerRepository){
		return args-> {
			Stream.of("Mohamed", "Yassine" , "Hanae","Imane").forEach(c->{
				Customer customer=Customer.builder()
						.name(c)
						.build();
				customerRepository.save(customer);

			});
			customerRepository.findAll().forEach(customer -> {

				for (int i=0 ; i<10 ;i++){
					BankAccount bankAccount= BankAccount.builder()
							.id(UUID.randomUUID().toString())
							.type(Math.random()>0.5? AccountType.CURRENT_ACCOUNT: AccountType.SAVING_ACCOUNT)
							.balance(10000+Math.random()*90000)
							.createdAt(new Date())
							.currency("MAD")
							.customer(customer)
							.build();

					bankAccountRepository.save(bankAccount);
				}
			});




		};

	}

}

