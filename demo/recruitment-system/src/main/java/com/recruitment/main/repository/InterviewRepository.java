package com.recruitment.main.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.recruitment.main.model.Interview;

public interface InterviewRepository extends JpaRepository<Interview, Long> {
}

