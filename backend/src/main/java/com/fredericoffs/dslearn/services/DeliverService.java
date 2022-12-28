package com.fredericoffs.dslearn.services;

import com.fredericoffs.dslearn.dto.DeliverRevisionDTO;
import com.fredericoffs.dslearn.entities.Deliver;
import com.fredericoffs.dslearn.repositories.DeliverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DeliverService {

  @Autowired
  private DeliverRepository repository;

  @Transactional
  public void saveRevision(Long id, DeliverRevisionDTO dto) {
    Deliver deliver = repository.getReferenceById(id);
    deliver.setStatus(dto.getStatus());
    deliver.setFeedback(dto.getFeedback());
    deliver.setCorrectCount(dto.getCorrectCount());
    repository.save(deliver);
  }
}
