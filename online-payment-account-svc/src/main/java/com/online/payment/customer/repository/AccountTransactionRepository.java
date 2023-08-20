package com.online.payment.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.payment.customer.model.AccountTransaction;


public interface AccountTransactionRepository extends JpaRepository<AccountTransaction, Integer> {

}
