package com.carWasher.carWasher.web;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebFilter(filterName = "CarWasherFilter")
public class CarWasherFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {

        response.getWriter().write("Before custom filter...");
        chain.doFilter(request, response);
        response.getWriter().write("After custom filter...");
    }
}
