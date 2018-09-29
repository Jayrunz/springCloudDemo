package com.jayrun.servicefeign.service;

import com.jayrun.servicefeign.service.impl.FeignHelloServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client", fallback = FeignHelloServiceHystrix.class)
public interface FeignHelloService {

    @GetMapping(value = "/hello")
    public String sayHiWithFeign(@RequestParam(value = "name") String name);
}
