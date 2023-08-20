package com.online.payment.biller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.online.payment.biller.model.BillerDetails;
import com.online.payment.biller.repository.BillerDetailsRepository;

@RestController
@RequestMapping("/biller-details")
@CrossOrigin
public class BillerDetailsController {
	@Autowired
	BillerDetailsRepository billerRepository;
	
    @PostMapping
    public BillerDetails save(@RequestBody BillerDetails billerDetails) {
        
        return billerRepository.save(billerDetails);
    }
    
    @GetMapping
    public List<BillerDetails> getAll() {
        
        return billerRepository.findAll();
    }
}
