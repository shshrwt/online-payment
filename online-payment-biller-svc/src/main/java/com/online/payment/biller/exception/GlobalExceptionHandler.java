package com.online.payment.biller.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
    @ExceptionHandler(value = BillerNotFoundException.class)
    public ResponseEntity<String> billerNotFoundException(BillerNotFoundException billerNotFoundException) {
        return new ResponseEntity<>("Biller not found", HttpStatus.NOT_FOUND);
    }
   @ExceptionHandler(value = Exception.class)
    public ResponseEntity<String> databaseConnectionFailsException(Exception exception) {
        return new ResponseEntity<>("Internal server error", HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
