package com.example.springbootdemo.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "demoFilter", urlPatterns = "/demoServlet")
public class DemoFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        System.out.println("Executing doFilter() method");
        chain.doFilter(request, response);
        System.out.println("Done doFilter() method");
    }
}
