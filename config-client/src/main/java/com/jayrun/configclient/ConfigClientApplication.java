package com.jayrun.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

	@Value("${name}")
	private String name;

	@Value("${democonfigclient.message}")
	private String message;

	@GetMapping("/getName")
	public String getOneConfig()throws Exception{
		return name;
	}

	@GetMapping("/getMessage")
	public String getMessage()throws Exception{
		return message;
	}
}
