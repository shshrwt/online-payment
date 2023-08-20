package com.online.payment.users.controller;

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

import com.online.payment.users.exception.UserNotFoundException;
import com.online.payment.users.model.User;
import com.online.payment.users.repository.UserRepository;

@RestController
@RequestMapping("user")
@CrossOrigin
public class UserController {
	
	@Autowired
	UserRepository repository;
	
    @PostMapping
    public User save(@RequestBody User user) {
        
        return repository.save(user);
    }
    
    @PutMapping
    public ResponseEntity<User> update(@RequestBody User user) {
        
    	Optional<User> userObj = repository.findByEmail(user.getEmail());
    	if (!userObj.isPresent())
    		throw new UserNotFoundException(" user email" + user.getEmail());

    	return new ResponseEntity<User>(repository.save(user), HttpStatus.OK);
    }

    
    @GetMapping
    public List<User> getAll() {
        
        return repository.findAll();
    }

}
