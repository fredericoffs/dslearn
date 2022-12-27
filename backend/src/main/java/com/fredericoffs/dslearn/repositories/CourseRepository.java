package com.fredericoffs.dslearn.repositories;

import com.fredericoffs.dslearn.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
