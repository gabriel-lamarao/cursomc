package com.gabriel.cursomc.services.exceptions;

public class DataIntegrityException extends RuntimeException{
	private static final long serrialVersionUID = 1L;
	
	public DataIntegrityException(String msg) {
		super(msg);
	}
	
	public DataIntegrityException(String msg, Throwable cause) {
		super (msg, cause);
	}
}
