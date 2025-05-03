package com.recruitment.main.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.recruitment.main.model.Candidate;

import java.util.List;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {
    List<Candidate> findByJobRequestId(Long jobRequestId);
}

