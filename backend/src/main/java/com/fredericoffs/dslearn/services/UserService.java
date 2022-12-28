package com.fredericoffs.dslearn.services;

import com.fredericoffs.dslearn.dto.UserDTO;
import com.fredericoffs.dslearn.entities.User;
import com.fredericoffs.dslearn.repositories.UserRepository;
import com.fredericoffs.dslearn.services.exceptions.ResourceNotFoundException;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService implements UserDetailsService {

  private static final Logger logger = LoggerFactory.getLogger(UserService.class);

  @Autowired
  private UserRepository repository;

  @Autowired
  private AuthService authservice;

  @Transactional(readOnly = true)
  public UserDTO findById(Long id) {
    authservice.validateSelfOrAdmin(id);
    Optional<User> obj = repository.findById(id);
    User entity = obj.orElseThrow(() -> new ResourceNotFoundException("User not found."));
    return new UserDTO(entity);
  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    User user = repository.findByEmail(username);

    if (user == null) {
      logger.error("User not found: {}", username);
      throw new UsernameNotFoundException("Email not found.");
    }
    logger.info("User found: {}", username);
    return user;
  }
}
