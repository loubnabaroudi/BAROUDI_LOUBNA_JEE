package org_sid1.bank_account_service1.service;

import org_sid1.bank_account_service1.dto.BankAccountRequestDTO;
import org_sid1.bank_account_service1.dto.BankAccountResponseDTO;
import org_sid1.bank_account_service1.entities.BankAccount;

public interface AccountService {
     BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO );

    BankAccountResponseDTO updateAccount(String id, BankAccountRequestDTO bankAccountDTO);
}
