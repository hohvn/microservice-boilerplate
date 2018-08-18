package com.thaitran.pingservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping")
public class PingController {
    @Autowired
    MessageClient messageClient;
    @GetMapping("/hit")
    public String ping() {
        return messageClient.getMessage();
    }
}
