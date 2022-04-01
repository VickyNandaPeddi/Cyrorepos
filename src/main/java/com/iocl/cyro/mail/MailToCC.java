package com.iocl.cyro.mail;

public class MailToCC {
String recipientMailId;
String recipientType;
String recipientCode;

public String getRecipientMailId() {
	return recipientMailId;
}
public void setRecipientMailId(String recipientMailId) {
	this.recipientMailId = recipientMailId;
}
public String getRecipientType() {
	return recipientType;
}
public void setRecipientType(String recipientType) {
	this.recipientType = recipientType;
}
public String getRecipientCode() {
	return recipientCode;
}
public void setRecipientCode(String recipientCode) {
	this.recipientCode = recipientCode;
}
public MailToCC(String recipientMailId, String recipientType, String recipientCode) {
	super();
	this.recipientMailId = recipientMailId;
	this.recipientType = recipientType;
	this.recipientCode = recipientCode;
}
public MailToCC() {
	super();
	// TODO Auto-generated constructor stub
}


}
