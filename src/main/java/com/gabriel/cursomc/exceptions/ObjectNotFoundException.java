package com.gabriel.cursomc.exceptions;

public class ObjectNotFoundException extends RuntimeException{
	private static final long serrialVersionUID = 1L;
	
	public ObjectNotFoundException(String msg) {
		super(msg);
	}
	
	public ObjectNotFoundException(String msg, Throwable cause) {
		super (msg, cause);
	}
}
