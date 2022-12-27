package com.fredericoffs.dslearn.repositories;

import com.fredericoffs.dslearn.entities.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Long> {

}
