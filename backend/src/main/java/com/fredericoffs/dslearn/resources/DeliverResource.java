package com.fredericoffs.dslearn.resources;

import com.fredericoffs.dslearn.dto.DeliverRevisionDTO;
import com.fredericoffs.dslearn.services.DeliverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/deliveries")
public class DeliverResource {

  @Autowired
  private DeliverService service;

  @PutMapping(value = "/{id}")
  @PreAuthorize("hasAnyRole('ADMIN','INSTRUCTOR')")
  public ResponseEntity<Void> saveRevision(@PathVariable Long id,
      @RequestBody DeliverRevisionDTO dto) {
    service.saveRevision(id, dto);
    return ResponseEntity.noContent().build();
  }
}
