package com.alibaba.test.nacos.consumer.api;

import com.alibaba.test.nacos.discovery.api.ProviderApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "nacos-provider")
public interface ConsumerApi extends ProviderApi {
}
