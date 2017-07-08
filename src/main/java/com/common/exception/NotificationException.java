package com.common.exception;

/**
 * @author laxman
 *
 */
public class NotificationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String errorMessage;

	/**
	 * @param errorMessage
	 */
	public NotificationException(String errorMessage) {
		super(errorMessage);
	}

	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * @param errorMessage the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	
}
