package com.iocl.cyro.mail;


import java.util.List;

public class Mail {

    String from;
    List<MailToCC> to;
    List<MailToCC> cc;
    List<MailToCC> bcc;
    String subject;
    String body;
    String applicationName;
    boolean bodyToBeSaved;

    // to be used only in case of attachment
    String attachmentFileName;
    String attachmentFileMIMEType;
    String attachmentBase64;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public List<MailToCC> getTo() {
        return to;
    }

    public void setTo(List<MailToCC> to) {
        this.to = to;
    }

    public List<MailToCC> getCc() {
        return cc;
    }

    public void setCc(List<MailToCC> cc) {
        this.cc = cc;
    }

    public List<MailToCC> getBcc() {
        return bcc;
    }

    public void setBcc(List<MailToCC> bcc) {
        this.bcc = bcc;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public boolean isBodyToBeSaved() {
        return bodyToBeSaved;
    }

    public void setBodyToBeSaved(boolean bodyToBeSaved) {
        this.bodyToBeSaved = bodyToBeSaved;
    }

    public String getAttachmentFileName() {
        return attachmentFileName;
    }

    public void setAttachmentFileName(String attachmentFileName) {
        this.attachmentFileName = attachmentFileName;
    }

    public String getAttachmentFileMIMEType() {
        return attachmentFileMIMEType;
    }

    public void setAttachmentFileMIMEType(String attachmentFileMIMEType) {
        this.attachmentFileMIMEType = attachmentFileMIMEType;
    }

    public String getAttachmentBase64() {
        return attachmentBase64;
    }

    public void setAttachmentBase64(String attachmentBase64) {
        this.attachmentBase64 = attachmentBase64;
    }

}

