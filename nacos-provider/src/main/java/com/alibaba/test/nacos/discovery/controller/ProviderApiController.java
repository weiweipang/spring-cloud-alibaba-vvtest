package com.alibaba.test.nacos.discovery.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderApiController {

    @RequestMapping(value = "/echo", method = RequestMethod.GET)
    public String echo() {
        return "Hello Nacos Discovery" ;
    }
}
