package org_sid1.bank_account_service1.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org_sid1.bank_account_service1.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {


}
