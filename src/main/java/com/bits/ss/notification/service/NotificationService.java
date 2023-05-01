package com.bits.ss.notification.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bits.ss.notification.dto.NotificationResponse;
import com.bits.ss.notification.model.Notification;
import com.bits.ss.notification.repository.NotificationRepository;

@Service
public class NotificationService {

	@Autowired
	private NotificationRepository repo;

	public NotificationResponse notify(Notification request) {
		return new NotificationResponse(repo.save(request).getNotificationId());
	}
}
