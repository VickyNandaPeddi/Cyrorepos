package com.iocl.cyro.mail;


import com.iocl.cyro.mail.MailToCC;
import java.util.List;

/**
 * AttachmentMailRequest
 */
public class AttachmentMailRequest {

	private String from;
	private List<MailToCC> to;
	private List<MailToCC> cc;
	private List<MailToCC> bcc;
	private String subject;
	private String body;
	private List<AttachmentRequest> attachments;
	private String applicationName;

	/**
	 * 
	 */
	public AttachmentMailRequest() {
	}

	/**
	 * @param from
	 * @param to
	 * @param cc
	 * @param bcc
	 * @param subject
	 * @param body
	 * @param attachments
	 * @param applicationName
	 */
	public AttachmentMailRequest(String from, List<MailToCC> to, List<MailToCC> cc,
			List<MailToCC> bcc, String subject, String body, List<AttachmentRequest> attachments,
			String applicationName) {
		this.from = from;
		this.to = to;
		this.cc = cc;
		this.bcc = bcc;
		this.subject = subject;
		this.body = body;
		this.attachments = attachments;
		this.applicationName = applicationName;
	}

	/**
	 * @return the from
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * @param from the from to set
	 */
	public void setFrom(String from) {
		this.from = from;
	}

	/**
	 * @return the to
	 */
	public List<MailToCC> getTo() {
		return to;
	}

	/**
	 * @param to the to to set
	 */
	public void setTo(List<MailToCC> to) {
		this.to = to;
	}

	/**
	 * @return the cc
	 */
	public List<MailToCC> getCc() {
		return cc;
	}

	/**
	 * @param cc the cc to set
	 */
	public void setCc(List<MailToCC> cc) {
		this.cc = cc;
	}

	/**
	 * @return the bcc
	 */
	public List<MailToCC> getBcc() {
		return bcc;
	}

	/**
	 * @param bcc the bcc to set
	 */
	public void setBcc(List<MailToCC> bcc) {
		this.bcc = bcc;
	}

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * @return the body
	 */
	public String getBody() {
		return body;
	}

	/**
	 * @param body the body to set
	 */
	public void setBody(String body) {
		this.body = body;
	}

	/**
	 * @return the attachments
	 */
	public List<AttachmentRequest> getAttachments() {
		return attachments;
	}

	/**
	 * @param attachments the attachments to set
	 */
	public void setAttachments(List<AttachmentRequest> attachments) {
		this.attachments = attachments;
	}

	/**
	 * @return the applicationName
	 */
	public String getApplicationName() {
		return applicationName;
	}

	/**
	 * @param applicationName the applicationName to set
	 */
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

	@Override
	public String toString() {
		return "AttachmentMailRequest [applicationName=" + applicationName + ", attachments=" + attachments + ", bcc="
				+ bcc + ", body=" + body + ", cc=" + cc + ", from=" + from + ", subject=" + subject + ", to=" + to
				+ "]";
	}

}