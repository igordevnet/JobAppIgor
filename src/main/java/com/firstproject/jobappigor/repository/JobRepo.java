package com.firstproject.jobappigor.repository;

import com.firstproject.jobappigor.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobPosts = new ArrayList<>(Arrays.asList(
            new JobPost(1,"frontend developer", "Experience in Angular", 1, List.of("Testing", "JUnit", "Selenium", "TestNG")),
            new JobPost(1,"frontend developer", "Experience in Angular", 1, List.of("Testing", "JUnit", "Selenium", "TestNG")),
            new JobPost(1,"frontend developer", "Experience in Angular", 1, List.of("Testing", "JUnit", "Selenium", "TestNG")),
            new JobPost(1,"frontend developer", "Experience in Angular", 1, List.of("Testing", "JUnit", "Selenium", "TestNG"))
    ));

    public List<JobPost> getJobs() {
        return jobPosts;
    }

    public void addJobPost(JobPost jobPost) {
        jobPosts.add(jobPost);
    }
}

