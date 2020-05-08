package com.alibaba.test.nacos.consumer.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "nacos-provider")
public interface ConsumerApi {
    @RequestMapping(value = "/echo", method = RequestMethod.GET)
    String echo();
}
