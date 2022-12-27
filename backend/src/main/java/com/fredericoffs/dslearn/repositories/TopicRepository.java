package com.fredericoffs.dslearn.repositories;

import com.fredericoffs.dslearn.entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {

}
