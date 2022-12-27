package com.fredericoffs.dslearn.repositories;

import com.fredericoffs.dslearn.entities.Section;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SectionRepository extends JpaRepository<Section, Long> {

}
