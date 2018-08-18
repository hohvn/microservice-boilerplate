package com.thaitran.pingservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "message-service")
public interface MessageClient {
    @GetMapping("/message/get")
    String getMessage();
}
