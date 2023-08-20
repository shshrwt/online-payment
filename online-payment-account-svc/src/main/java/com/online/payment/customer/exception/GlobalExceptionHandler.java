package com.online.payment.customer.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
    @ExceptionHandler(value = AccountNotFoundException.class)
    public ResponseEntity<String> accountNotFoundException(AccountNotFoundException accountNotFoundException) {
        return new ResponseEntity<>("Account not found", HttpStatus.NOT_FOUND);
    }
   @ExceptionHandler(value = Exception.class)
    public ResponseEntity<String> databaseConnectionFailsException(Exception exception) {
        return new ResponseEntity<>("Internal server error", HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
