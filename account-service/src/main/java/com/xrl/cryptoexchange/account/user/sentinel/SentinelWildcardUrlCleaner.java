package com.xrl.cryptoexchange.account.user.sentinel;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.UrlCleaner;
import org.springframework.stereotype.Component;

@Component
public class SentinelWildcardUrlCleaner implements UrlCleaner {
    @Override
    public String clean(String originUrl) {
        if (originUrl.startsWith("/user/")) {
            return "/user/**";  // 统一归为通配符
        }
        return originUrl;
    }
}
