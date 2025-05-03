package com.recruitment.main.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.recruitment.main.model.JobRequest;
import com.recruitment.main.services.JobRequestService;

import java.util.List;

@RestController
@RequestMapping("/api/job-requests")
public class JobRequestController {

    @Autowired
    private JobRequestService jobRequestService;

    @PostMapping
    public JobRequest createJobRequest(@RequestBody JobRequest jobRequest) {
        return jobRequestService.createJobRequest(jobRequest);
    }

    @GetMapping
    public List<JobRequest> getAllJobRequests() {
        return jobRequestService.getAllJobRequests();
    }

    @GetMapping("/{id}")
    public JobRequest getJobRequestById(@PathVariable Long id) {
        return jobRequestService.getJobRequestById(id);
    }

    @PutMapping("/{id}")
    public JobRequest updateJobRequest(@PathVariable Long id, @RequestBody JobRequest jobRequest) {
        jobRequest.setId(id);
        return jobRequestService.updateJobRequest(jobRequest);
    }
}

