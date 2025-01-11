package com.gabriel.cursomc.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer ststus;
	private String msg;
	private Long timeStamp;

	public StandardError(Integer ststus, String msg, Long timeStamp) {
		super();
		this.ststus = ststus;
		this.msg = msg;
		this.timeStamp = timeStamp;
	}

	public Integer getStstus() {
		return ststus;
	}

	public void setStstus(Integer ststus) {
		this.ststus = ststus;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}

}
