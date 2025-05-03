package com.recruitment.main.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recruitment.main.model.JobRequest;
import com.recruitment.main.repository.JobRequestRepository;

import java.util.List;

@Service
public class JobRequestService {
    @Autowired
    private JobRequestRepository jobRequestRepository;

    public JobRequest createJobRequest(JobRequest jobRequest) {
    	return jobRequestRepository.save(jobRequest);
    }

    public List<JobRequest> getAllJobRequests() {
        return jobRequestRepository.findAll();
    }

    public JobRequest getJobRequestById(Long id) {
        return jobRequestRepository.findById(id).orElse(null);
    }

    public JobRequest updateJobRequest(JobRequest jobRequest) {
        return jobRequestRepository.save(jobRequest);
    }
}

