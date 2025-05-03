package com.recruitment.main.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.recruitment.main.model.JobRequest;

public interface JobRequestRepository extends JpaRepository<JobRequest, Long> {
}

