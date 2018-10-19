package com.jayrun.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "mgmtserver")
public interface ServerHelloService {

    @RequestMapping(value = "/getMsg", method = RequestMethod.GET)
    public String helloServer(@RequestParam("name") String name);
}
