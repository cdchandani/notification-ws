package com.bits.ss.notification.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bits.ss.notification.dto.NotificationResponse;
import com.bits.ss.notification.model.Notification;
import com.bits.ss.notification.service.NotificationService;

@RestController
public class NotificationController {

	@Autowired
	private NotificationService service;
	
	@PostMapping("/notifications")
	public NotificationResponse notify(@RequestBody Notification request) {
		return service.notify(request);
	}
	
}
