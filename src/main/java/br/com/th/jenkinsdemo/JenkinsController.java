package br.com.th.jenkinsdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/status")
    public String getStatus() {
        return "The project is running on port " + port;
    }

}