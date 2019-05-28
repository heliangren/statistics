package com.helr.csgateway.filter;

import com.google.common.util.concurrent.RateLimiter;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

@Component
public class RateLimiterFilter extends ZuulFilter {

    private static final RateLimiter  RATE_LIMITER = RateLimiter.create(1000);

    @Override
    public String filterType() {
        return null;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() throws ZuulException {
        RATE_LIMITER.tryAcquire();
        return null;
    }
}
