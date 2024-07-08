package org_sid1.bank_account_service1.mappers;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import org_sid1.bank_account_service1.dto.BankAccountResponseDTO;
import org_sid1.bank_account_service1.entities.BankAccount;

@Component
public class AccountMapper {
    public BankAccountResponseDTO fromBankAccount(BankAccount bankAccount){
        BankAccountResponseDTO bankAccountResponseDTO=new BankAccountResponseDTO();
        BeanUtils.copyProperties(bankAccount,bankAccountResponseDTO);
        return bankAccountResponseDTO;
    }
}
