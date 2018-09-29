package com.jayrun.serviceribbon.controller;

import com.jayrun.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    private HelloService helloService;


    @GetMapping("/hi")
    public String sayHi(@RequestParam String name) {
        return helloService.sayHi(name) + " from ribbon";
    }
}
