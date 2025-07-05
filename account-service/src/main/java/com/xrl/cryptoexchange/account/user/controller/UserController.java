package com.xrl.cryptoexchange.account.user.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Resource
    private DiscoveryClient discoveryClient;

    @RequestMapping("/query")
    public String query(){
        discoveryClient.getInstances("trade-service");
        return "user";
    }
}
