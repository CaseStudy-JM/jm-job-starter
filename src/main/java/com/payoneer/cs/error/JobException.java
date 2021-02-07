package com.payoneer.cs.error;

import lombok.Getter;

@Getter
public class JobException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8629432377771492706L;

	public JobException(String message) {
		super(message);
	}
}
