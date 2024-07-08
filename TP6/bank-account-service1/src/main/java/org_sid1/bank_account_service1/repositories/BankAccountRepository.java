package org_sid1.bank_account_service1.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.PathVariable;
import org_sid1.bank_account_service1.entities.BankAccount;
import org_sid1.bank_account_service1.enums.AccountType;

import java.util.List;

@RepositoryRestResource
public interface BankAccountRepository extends JpaRepository<BankAccount, String> {

    @RestResource(path ="/byType")
    List<BankAccount> findByType(@Param("t") AccountType type);
}
