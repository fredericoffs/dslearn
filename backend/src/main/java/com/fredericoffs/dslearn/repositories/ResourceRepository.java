package com.fredericoffs.dslearn.repositories;

import com.fredericoffs.dslearn.entities.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resource, Long> {

}
