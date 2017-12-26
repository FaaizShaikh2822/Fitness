package com.niit.model;

public class ErrorClazz
{
	private int code;
	private String message;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getmessage() {
		return message;
	}
	public void setmessage(String message) {
		this.message = message;
	}
	public ErrorClazz(int code,String message)
	{
		super();
		this.code=code;
		this.message=message;
	}
}
