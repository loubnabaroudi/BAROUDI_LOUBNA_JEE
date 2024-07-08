package org_sid1.bank_account_service1.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org_sid1.bank_account_service1.dto.BankAccountRequestDTO;
import org_sid1.bank_account_service1.dto.BankAccountResponseDTO;
import org_sid1.bank_account_service1.entities.BankAccount;
import org_sid1.bank_account_service1.entities.Customer;
import org_sid1.bank_account_service1.repositories.BankAccountRepository;
import org_sid1.bank_account_service1.repositories.CustomerRepository;
import org_sid1.bank_account_service1.service.AccountService;

import java.util.List;

@Controller
public class BankAccountGraphQLController {

    @Autowired
    private BankAccountRepository bankAccountRepository;
    @Autowired
    private AccountService accountService;
    @Autowired
    private CustomerRepository customerRepository;

    @QueryMapping
    public List<BankAccount> accountsList(){
        return bankAccountRepository.findAll();
    }

    @QueryMapping
    public BankAccount bankAccountById(@Argument String id){
        return bankAccountRepository.findById( id)
                .orElseThrow(()-> new RuntimeException(String.format("Account %s not found",id)));
    }

    @MutationMapping
    public BankAccountResponseDTO addAccount(@Argument BankAccountRequestDTO bankAccount){
        return accountService.addAccount(bankAccount);
    }


    @MutationMapping
    public BankAccountResponseDTO updateAccount(@Argument String id,@Argument BankAccountRequestDTO bankAccount){
        return accountService.updateAccount(id,bankAccount);
    }

    @MutationMapping
    public void  deleteAccount(@Argument String id){
        bankAccountRepository.deleteById(id);

    }

    @QueryMapping
    public List<Customer> customers(){
        return customerRepository.findAll();

    }

}


