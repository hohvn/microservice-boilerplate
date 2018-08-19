package com.thaitran.monitoringserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class MonitoringServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonitoringServerApplication.class, args);
    }
}
