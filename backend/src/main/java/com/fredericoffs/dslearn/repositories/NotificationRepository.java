package com.fredericoffs.dslearn.repositories;

import com.fredericoffs.dslearn.entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

}
