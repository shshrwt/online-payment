package com.online.payment.biller.exception;

public class BillerNotFoundException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public BillerNotFoundException() {
        super();
    }
    public BillerNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
    public BillerNotFoundException(String message) {
        super(message);
    }
    public BillerNotFoundException(Throwable cause) {
        super(cause);
    }
}