package com.iocl.cyro.mail;



import java.util.Date;

public class WSOutput {

	private String mailCalled;
	private Boolean success;
	private String message;
	private Date timestamp;
	
	//Getters and Setters
	
	
	public Boolean getSuccess() {
		return success;
	}
	public String getMailCalled() {
		return mailCalled;
	}
	public void setMailCalled(String mailCalled) {
		this.mailCalled = mailCalled;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
	
	
		
}
