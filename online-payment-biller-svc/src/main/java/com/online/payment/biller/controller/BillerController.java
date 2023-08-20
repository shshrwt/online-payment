package com.online.payment.biller.controller;

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

import com.online.payment.biller.exception.BillerNotFoundException;
import com.online.payment.biller.model.Biller;
import com.online.payment.biller.repository.BillerRepository;


@RestController
@RequestMapping("/biller")
@CrossOrigin
public class BillerController {
	@Autowired
	BillerRepository billerRepository;
	
    @PostMapping
    public Biller save(@RequestBody Biller biller) {
        
        return billerRepository.save(biller);
    }
    
    @PutMapping
    public ResponseEntity<Biller> update(@RequestBody Biller biller) {
        
    	Optional<Biller> billerObj = billerRepository.findById(biller.getId());
    	if (!billerObj.isPresent())
    		throw new BillerNotFoundException(" Account id " + biller.getId());

    	return new ResponseEntity<Biller>(billerRepository.save(biller), HttpStatus.OK);
    }
    
    @GetMapping
    public List<Biller> getAll() {
        
        return billerRepository.findAll();
    }
}
