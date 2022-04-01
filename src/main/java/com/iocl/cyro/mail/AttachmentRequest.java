package com.iocl.cyro.mail;


/**
 * AttachmentRequest
 */
public class AttachmentRequest {

  private String attachmentFileName;
  private String attachmentFileMIMEType;
  private String attachmentBase64;

  /**
   * 
   */
  public AttachmentRequest() {
  }

  /**
   * @param attachmentFileName
   * @param attachmentFileMIMEType
   * @param attachmentBase64
   */
  public AttachmentRequest(String attachmentFileName, String attachmentFileMIMEType, String attachmentBase64) {
    this.attachmentFileName = attachmentFileName;
    this.attachmentFileMIMEType = attachmentFileMIMEType;
    this.attachmentBase64 = attachmentBase64;
  }

  /**
   * @return the attachmentFileName
   */
  public String getAttachmentFileName() {
    return attachmentFileName;
  }

  /**
   * @param attachmentFileName the attachmentFileName to set
   */
  public void setAttachmentFileName(String attachmentFileName) {
    this.attachmentFileName = attachmentFileName;
  }

  /**
   * @return the attachmentFileMIMEType
   */
  public String getAttachmentFileMIMEType() {
    return attachmentFileMIMEType;
  }

  /**
   * @param attachmentFileMIMEType the attachmentFileMIMEType to set
   */
  public void setAttachmentFileMIMEType(String attachmentFileMIMEType) {
    this.attachmentFileMIMEType = attachmentFileMIMEType;
  }

  /**
   * @return the attachmentBase64
   */
  public String getAttachmentBase64() {
    return attachmentBase64;
  }

  /**
   * @param attachmentBase64 the attachmentBase64 to set
   */
  public void setAttachmentBase64(String attachmentBase64) {
    this.attachmentBase64 = attachmentBase64;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */

  @Override
  public String toString() {
    return "AttachmentRequest [attachmentBase64=" + attachmentBase64 + ", attachmentFileMIMEType="
        + attachmentFileMIMEType + ", attachmentFileName=" + attachmentFileName + "]";
  }

}