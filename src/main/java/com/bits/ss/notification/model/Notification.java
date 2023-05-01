package com.bits.ss.notification.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_notifications")
public class Notification {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long notificationId;
	@Column(name = "to_email")
	private String toEmail;
	@Column(name = "from_email")
	private String fromEmail;
	@Column(name = "receiver_number")
	private String receiverNumber;
	@Column(name = "email_body")
	private String emailBody;
	@Column(name = "email_subject")
	private String emailSubject;
	@Column(name = "phone_msg_body")
	private String phoneMsgBody;

	public Long getNotificationId() {
		return notificationId;
	}

	public void setNotificationId(Long notificationId) {
		this.notificationId = notificationId;
	}

	public String getToEmail() {
		return toEmail;
	}

	public void setToEmail(String toEmail) {
		this.toEmail = toEmail;
	}

	public String getFromEmail() {
		return fromEmail;
	}

	public void setFromEmail(String fromEmail) {
		this.fromEmail = fromEmail;
	}

	public String getReceiverNumber() {
		return receiverNumber;
	}

	public void setReceiverNumber(String receiverNumber) {
		this.receiverNumber = receiverNumber;
	}

	public String getEmailBody() {
		return emailBody;
	}

	public void setEmailBody(String emailBody) {
		this.emailBody = emailBody;
	}

	public String getEmailSubject() {
		return emailSubject;
	}

	public void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
	}

	public String getPhoneMsgBody() {
		return phoneMsgBody;
	}

	public void setPhoneMsgBody(String phoneMsgBody) {
		this.phoneMsgBody = phoneMsgBody;
	}

}
