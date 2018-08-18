package com.thaitran.messageservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {
    @GetMapping("/get")
    public String getMessage() {
        return "I am message service";
    }
}
