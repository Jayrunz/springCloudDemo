package com.jayrun.configadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConfigAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigAdminApplication.class, args);
    }
}
