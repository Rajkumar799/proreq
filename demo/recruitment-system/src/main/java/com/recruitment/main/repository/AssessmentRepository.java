package com.recruitment.main.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.recruitment.main.model.Assessment;

public interface AssessmentRepository extends JpaRepository<Assessment, Long> {
}

