package com.alibaba.test.nacos.discovery.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ProviderApiController {

    @Value("${nacos.test.name}")
    String userName;

    @Value("${nacos.test.age}")
    int age;

    @RequestMapping(value = "/echo", method = RequestMethod.GET)
    public String echo() {
        return "Hello Nacos Discovery"+userName+age ;
    }
}
