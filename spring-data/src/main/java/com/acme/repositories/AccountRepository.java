package com.acme.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import entity.Account;
import entity.Customer;

/** https://spring.io/blog/2011/02/10/getting-started-with-spring-data-jpa/ */
@Transactional(readOnly = true)
public interface AccountRepository extends JpaRepository<Account, Long> {

	List<Account> findByCustomer(Customer customer);
}