package com.jayrun.servicezuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
public class PostFilter extends ZuulFilter {

    private static Logger log = LoggerFactory.getLogger(ZuulFilter.class);

    @Override
    public String filterType() {
        return "post";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        log.info("请求返回 %s >>> %s", request.getMethod(), request.getRequestURL().toString());
        Object token = request.getParameter("token");
        if (token != null) {
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(401);
            try {
                context.getResponse().getWriter().append(" token = " + token.toString());
            } catch (IOException e) {
                log.error("io error", e);
            }
            return null;
        }
        return null;
    }
}
