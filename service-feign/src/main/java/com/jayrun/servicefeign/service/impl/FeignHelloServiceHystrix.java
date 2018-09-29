package com.jayrun.servicefeign.service.impl;

import com.jayrun.servicefeign.service.FeignHelloService;
import org.springframework.stereotype.Component;

@Component
public class FeignHelloServiceHystrix implements FeignHelloService {
    @Override
    public String sayHiWithFeign(String name) {
        return "sorry " + name + ", exit error";
    }
}
