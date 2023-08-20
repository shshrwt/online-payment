package com.online.payment.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.payment.customer.model.Account;


public interface AccountRepository extends JpaRepository<Account, Long> {

}
