package com.techie.jenkinscicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class JenkinsCicdActionsApplication {

    @GetMapping("/welcome")
    public String welcome(){
        return "welcome";
    }

    public static void main(String[] args) {
        SpringApplication.run(JenkinsCicdActionsApplication.class, args);
    }

}
