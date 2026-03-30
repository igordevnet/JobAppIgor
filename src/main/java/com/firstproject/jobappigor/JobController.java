package com.firstproject.jobappigor;

import com.firstproject.jobappigor.model.JobPost;
import com.firstproject.jobappigor.service.JobService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class JobController {

    private final JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping({"/", "home"})
    public String Home() {
        return "home";
    }

    @GetMapping("addjob")
    public String AddJob() {
        return "addjob";
    }

    @PostMapping("handleForm")
    public String HandleForm(JobPost jobPost) {
        jobService.addJob(jobPost);
        return "success";
    }

    @RequestMapping("viewalljobs")
    public String ViewAllJobs(Model model) {
        var jobPosts = jobService.getJobs();
        model.addAttribute("jobPosts", jobPosts);
        return "viewalljobs";
    }
}

