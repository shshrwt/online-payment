package com.online.payment.customer.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.online.payment.customer.exception.AccountNotFoundException;
import com.online.payment.customer.model.Account;
import com.online.payment.customer.repository.AccountRepository;

@RestController
@RequestMapping("/account")
@CrossOrigin
public class AccountController {
	
	@Autowired
	AccountRepository accountRepository;
	
    @PostMapping
    public Account save(@RequestBody Account account) {
        
        return accountRepository.save(account);
    }
    
    @PutMapping
    public ResponseEntity<Account> update(@RequestBody Account account) {
        
    	Optional<Account> acObj = accountRepository.findById(account.getId());
    	if (!acObj.isPresent())
    		throw new AccountNotFoundException(" Account id " + account.getId());

    	return new ResponseEntity<Account>(accountRepository.save(account), HttpStatus.OK);
    }
    
    @GetMapping
    public List<Account> getAll() {
        
        return accountRepository.findAll();
    }

}
