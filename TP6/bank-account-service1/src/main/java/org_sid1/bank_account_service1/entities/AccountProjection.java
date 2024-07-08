package org_sid1.bank_account_service1.entities;

import org.springframework.data.rest.core.config.Projection;
import org_sid1.bank_account_service1.enums.AccountType;

@Projection(types = BankAccount.class)
public interface AccountProjection {
    public String getId();
    public AccountType getTye();
    public Double getBalance();
}
