package com.recruitment.main.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recruitment.main.model.Candidate;
import com.recruitment.main.repository.CandidateRepository;

import java.util.List;

@Service
public class CandidateService {
    @Autowired
    private CandidateRepository candidateRepository;

    public Candidate addCandidate(Candidate candidate) {
        return candidateRepository.save(candidate);
    }

    public List<Candidate> getCandidatesByJobRequestId(Long jobRequestId) {
        return candidateRepository.findByJobRequestId(jobRequestId);
    }

    public List<Candidate> getAllCandidates() {
        return candidateRepository.findAll();
    }
}

