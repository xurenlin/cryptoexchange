package com.xrl.cryptoexchange.account.user.controller;

import com.xrl.cryptoexchange.account.user.feignClient.TradeFeignClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
@Slf4j
@RefreshScope
public class UserController {


    @Autowired
    TradeFeignClient tradeFeignClient;

    @Value("${account}")
    private String account;

    @Value("${id1}")
    private String id;

    @Value("${log1}")
    private String logs;

    @RequestMapping("/query")
    public String query(){
        System.out.println("query");
        return tradeFeignClient.query();
    }

    @RequestMapping("/account")
    public String account(){
        return account;
    }

    @RequestMapping("/id")
    public String id(){
        return id;
    }

    @RequestMapping("/log")
    public String log(){
        return logs;
    }


}
