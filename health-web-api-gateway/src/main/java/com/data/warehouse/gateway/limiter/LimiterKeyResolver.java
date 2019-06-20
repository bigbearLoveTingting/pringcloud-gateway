package com.data.warehouse.gateway.limiter;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

/**
 * @Author: 84644
 * @Date: 2019/6/18 14:15
 * @Description: 根据Hostname进行限流
 **/
@Configuration
public class LimiterKeyResolver {
    /**
     * ip限流
     * @return
     */
    @Bean(name = "hostAddrKeyResolver")
    public KeyResolver  hostAddrKeyResolver() {
        return exchange -> Mono.just(exchange.getRequest().getRemoteAddress().getHostName());
    }

    /**
     * 用户限流
     * @return
     */
    @Bean(name = "userKeyResolver")
    public KeyResolver  userKeyResolver() {
        return exchange -> Mono.just(exchange.getRequest().getQueryParams().getFirst("user"));
    }

    /**
     * 接口限流
     * @return
     */
    @Bean(name = "uriKeyResolver")
    public KeyResolver  uriKeyResolver() {
        return exchange -> Mono.just(exchange.getRequest().getURI().getPath());
    }
}
