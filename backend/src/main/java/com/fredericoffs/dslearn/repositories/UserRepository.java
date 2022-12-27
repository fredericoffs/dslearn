package com.fredericoffs.dslearn.repositories;

import com.fredericoffs.dslearn.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

  User findByEmail(String email);
}
