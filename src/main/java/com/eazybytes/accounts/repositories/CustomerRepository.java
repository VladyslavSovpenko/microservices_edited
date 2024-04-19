package com.eazybytes.accounts.repositories;

import com.eazybytes.accounts.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findCustomerByMobileNumber(String mobileNumber);
    Optional<Customer> findByMobileNumber(String mobileNumber);
}
