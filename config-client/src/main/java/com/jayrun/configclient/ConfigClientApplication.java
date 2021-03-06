package com.jayrun.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

	@Value("${name}")
	private String name;

	@Value("${sms.test}")
	private String message;

	@Value("${redis.ip}")
	private String redisIp;

	@GetMapping("/getName")
	public String getOneConfig()throws Exception{
		return name;
	}

	@GetMapping("/getMessage")
	public String getMessage()throws Exception{
		return message;
	}

	@GetMapping("/getRedisIp")
	public String getRedisIp()throws Exception{
		return redisIp;
	}
}
