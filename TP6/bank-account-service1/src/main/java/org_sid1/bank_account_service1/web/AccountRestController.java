package org_sid1.bank_account_service1.web;


import org.springframework.web.bind.annotation.*;
import org_sid1.bank_account_service1.dto.BankAccountRequestDTO;
import org_sid1.bank_account_service1.dto.BankAccountResponseDTO;
import org_sid1.bank_account_service1.entities.BankAccount;
import org_sid1.bank_account_service1.mappers.AccountMapper;
import org_sid1.bank_account_service1.repositories.BankAccountRepository;
import org_sid1.bank_account_service1.service.AccountService;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class AccountRestController {
    private BankAccountRepository bankAccountRepository;
    private AccountService accountService;
    private AccountMapper accountMapper;

    public AccountRestController(BankAccountRepository bankAccountRepository, AccountService accountService, AccountMapper accountMapper){
        this.bankAccountRepository=bankAccountRepository;
        this.accountService = accountService;
        this.accountMapper = accountMapper;
    }
    @GetMapping("/bankAccounts")
    public List<BankAccount> bankAccounts(){
        return bankAccountRepository.findAll();
    }

    @GetMapping("/bankAccounts/{id}")
    public BankAccount bankAccount(@PathVariable String id){
        return bankAccountRepository.findById(id)
                .orElseThrow(()-> new RuntimeException(String.format("Account %s not found",id)));
    }

    @PostMapping("/bankAccounts")
    public BankAccountResponseDTO save(@RequestBody BankAccountRequestDTO requestDTO){
        return accountService.addAccount(requestDTO);
    }

    @PutMapping("/bankAccounts/{id}")
    public BankAccount update(@PathVariable String id, @RequestBody BankAccount bankAccount){
        BankAccount account=bankAccountRepository.findById(id).orElseThrow();
        if(bankAccount.getBalance() != null) account.setBalance(bankAccount.getBalance());
        if(bankAccount.getCreatedAt() != null) account.setCreatedAt(new Date());
        if(bankAccount.getType() != null) account.setType(bankAccount.getType());
        if(bankAccount.getCurrency() != null) account.setCurrency(bankAccount.getCurrency());
        return bankAccountRepository.save(account);
    }


    @DeleteMapping("/bankAccounts/{id}")
    public void delete(@PathVariable String id){
           bankAccountRepository.deleteById(id);
    }
}
