package com.xrl.cryptoexchange.trade.user.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trade")
@Slf4j
public class TradeController {

    @RequestMapping("/query")
    public String query(){
        return "trade";
    }
}
