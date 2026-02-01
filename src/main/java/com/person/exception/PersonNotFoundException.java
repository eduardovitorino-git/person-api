package com.person.exception;

import java.io.Serial;

public class PersonNotFoundException extends RuntimeException {
	@Serial
    private static final long serialVersionUID = 1L;

	public PersonNotFoundException(String message, Throwable cause, boolean enableSuppression,
								   boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public PersonNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public PersonNotFoundException(String message) {
		super(message);
	}
}