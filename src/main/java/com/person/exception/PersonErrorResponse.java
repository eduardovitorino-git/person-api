package com.person.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonErrorResponse {
	private int status;
	private String message;
	private Long timestamp;
	
	public PersonErrorResponse() {	}
	
	public PersonErrorResponse(int status, String message, Long timestamp) {
		this.status = status;
		this.message = message;
		this.timestamp = timestamp;
	}
}
