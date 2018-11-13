package com.jayrun.serviceribbon.service.impl;

import com.jayrun.serviceribbon.service.HelloService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private RestTemplate restTemplate;

    //指定熔断时走的方法
    @HystrixCommand(fallbackMethod = "sayHiError")
    @Override
    public String sayHi(String name) {
        return restTemplate.getForObject("http://eureka-client/hello?name=" + name, String.class);
    }

    public String sayHiError(String name) {
        return "sorry " + name + ", exit error";
    }
}
