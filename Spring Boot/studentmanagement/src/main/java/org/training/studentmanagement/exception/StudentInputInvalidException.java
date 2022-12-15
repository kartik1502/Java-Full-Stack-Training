package org.training.studentmanagement.exception;

public class StudentInputInvalidException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public StudentInputInvalidException(String message) {
		super(message);
		this.message = message;
	}

	public StudentInputInvalidException() {
		super();
	}
	
	
}
