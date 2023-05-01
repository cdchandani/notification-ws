package com.bits.ss.notification.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bits.ss.notification.model.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {

}
