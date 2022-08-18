package com.cg.banking.exceptions;

public class InsufficientAmountException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public InsufficientAmountException() {
		super();
		 
	}

	public InsufficientAmountException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		 
	}

	public InsufficientAmountException(String message, Throwable cause) {
		super(message, cause);
		 
	}

	public InsufficientAmountException(String message) {
		super(message);
		 
	}

	public InsufficientAmountException(Throwable cause) {
		super(cause);
		 
	}
	
	
	}


