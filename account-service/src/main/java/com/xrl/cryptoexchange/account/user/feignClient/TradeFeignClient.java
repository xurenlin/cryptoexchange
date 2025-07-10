package com.xrl.cryptoexchange.account.user.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "trade-service")
public interface TradeFeignClient {

    @RequestMapping("/trade/query")
    public String query();

}
