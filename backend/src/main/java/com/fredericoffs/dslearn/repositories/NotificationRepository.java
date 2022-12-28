package com.fredericoffs.dslearn.repositories;

import com.fredericoffs.dslearn.entities.Notification;
import com.fredericoffs.dslearn.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

  Page<Notification> findByUser(User user, Pageable pageable);
}
