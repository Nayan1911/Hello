package com.techie.gitlabcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class GitlabCicdActionsApplication {

    @GetMapping("/welcome")
    public String welcome(){
        return "welcome";
    }

    public static void main(String[] args) {
        SpringApplication.run(GitlabCicdActionsApplication.class, args);
    }

}
