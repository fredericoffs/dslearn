package com.fredericoffs.dslearn.repositories;

import com.fredericoffs.dslearn.entities.Enrollment;
import com.fredericoffs.dslearn.entities.pk.EnrollmentPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPK> {

}
