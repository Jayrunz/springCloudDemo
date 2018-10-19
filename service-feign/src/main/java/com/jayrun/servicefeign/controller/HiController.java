package com.jayrun.servicefeign.controller;

import com.jayrun.servicefeign.service.FeignHelloService;
import com.jayrun.servicefeign.service.ServerHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    private FeignHelloService feignHelloService;

    @Autowired
    private ServerHelloService serverHelloService;

    @GetMapping("/hi")
    public String sayHiWithFeign(@RequestParam String name) {
        return feignHelloService.sayHiWithFeign(name) + " from feign";
    }

    @GetMapping("/server/{name}")
    public String helloServer(@PathVariable("name") String name) {
        return serverHelloService.helloServer(name);
    }
}
