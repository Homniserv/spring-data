package com.acme.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Account;

/** https://spring.io/blog/2011/02/10/getting-started-with-spring-data-jpa/ */
public interface AccountRepository extends JpaRepository<Account, Long> {

}