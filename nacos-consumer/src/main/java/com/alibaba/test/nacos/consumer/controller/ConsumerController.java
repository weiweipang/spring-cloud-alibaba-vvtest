package com.alibaba.test.nacos.consumer.controller;

import com.alibaba.test.nacos.consumer.api.ConsumerApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    ConsumerApi consumerApi;

    @RequestMapping(value = "/echo1", method = RequestMethod.GET)
    public String echo1() {
        String echo = consumerApi.echo();
        System.out.println(echo);
        return echo;
    }
}
