package com.recruitment.main.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.recruitment.main.model.Candidate;
import com.recruitment.main.services.CandidateService;

import java.util.List;

@RestController
@RequestMapping("/api/candidates")
public class CandidateController {

    @Autowired
    private CandidateService candidateService;

    @PostMapping
    public Candidate addCandidate(@RequestBody Candidate candidate) {
        return candidateService.addCandidate(candidate);
    }

    @GetMapping
    public List<Candidate> getAllCandidates() {
        return candidateService.getAllCandidates();
    }

    @GetMapping("/job/{jobRequestId}")
    public List<Candidate> getCandidatesByJobRequest(@PathVariable Long jobRequestId) {
        return candidateService.getCandidatesByJobRequestId(jobRequestId);
    }
}

