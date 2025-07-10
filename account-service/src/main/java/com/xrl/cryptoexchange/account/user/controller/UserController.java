package com.xrl.cryptoexchange.account.user.controller;

import com.xrl.cryptoexchange.account.user.feignClient.TradeFeignClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Resource
    private DiscoveryClient discoveryClient;

    @Autowired
    TradeFeignClient tradeFeignClient;

    @RequestMapping("/query")
    public String query(){
        return tradeFeignClient.query();
    }
}
