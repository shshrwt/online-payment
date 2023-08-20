package com.online.payment.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.online.payment.customer.model.AccountTransaction;
import com.online.payment.customer.repository.AccountTransactionRepository;

@RestController
@RequestMapping("/account-transaction")
@CrossOrigin
public class AccountTransactionController {
	
	@Autowired
	AccountTransactionRepository accountTransactionRepository;
	
    @PostMapping
    public AccountTransaction save(@RequestBody AccountTransaction account) {
        
        return accountTransactionRepository.save(account);
    }
    
    @GetMapping
    public List<AccountTransaction> getAll() {
        
        return accountTransactionRepository.findAll();
    }

}
