package com.bag.kingkong_ios.rest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "Kingkong-android")
public interface FeignTestClient {

    @GetMapping(value = "api/feignTest")
    String feignTest();

}
