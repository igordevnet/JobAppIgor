package com.firstproject.jobappigor.service;

import com.firstproject.jobappigor.model.JobPost;
import com.firstproject.jobappigor.repository.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    private final JobRepo jobRepo;

    @Autowired
    public JobService(JobRepo jobRepo) {
        this.jobRepo = jobRepo;
    }

    public void addJob(JobPost jobPost) {
        jobRepo.addJobPost(jobPost);
    }

    public List<JobPost> getJobs() {
        return jobRepo.getJobs();
    }
}
