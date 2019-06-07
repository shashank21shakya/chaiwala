package com.harsh.util;

public class ApiStatus<T> {

	private String status;
	private String message;
	private T entity;
	public String getStatus() {
		return status;
	}
	public String getMessage() {
		return message;
	}
	public T getEntity() {
		return entity;
	}
	public ApiStatus(String status, String message, T entity) {
		super();
		this.status = status;
		this.message = message;
		this.entity = entity;
	}



}
