package com.online.payment.customer.exception;

public class AccountNotFoundException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public AccountNotFoundException() {
        super();
    }
    public AccountNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
    public AccountNotFoundException(String message) {
        super(message);
    }
    public AccountNotFoundException(Throwable cause) {
        super(cause);
    }
}