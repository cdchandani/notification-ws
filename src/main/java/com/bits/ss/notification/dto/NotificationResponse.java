package com.bits.ss.notification.dto;

public class NotificationResponse {

	private Long notificationId;

	public Long getNotificationId() {
		return notificationId;
	}

	public void setNotificationId(Long notificationId) {
		this.notificationId = notificationId;
	}

	public NotificationResponse(Long notificationId) {
		super();
		this.notificationId = notificationId;
	}

}
