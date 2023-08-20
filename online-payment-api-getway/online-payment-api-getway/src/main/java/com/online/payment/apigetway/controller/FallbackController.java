package com.online.payment.apigetway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {


    @GetMapping("/userServiceFallback")
    public String userServiceFallback() {
        return "User service is down at this time !!";
    }

    @GetMapping("/accountServiceFallback")
    public String accountServiceFallback() {
        return "Account service is down at this time";
    }

    @GetMapping("/billerServiceFallback")
    public String billerServiceFallback() {
        return "Biller service is down at this time";
    }
}
