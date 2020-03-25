package com.example.springbootdemo;

import com.example.springbootdemo.servlet.DemoFilter;
import com.example.springbootdemo.servlet.DemoListener;
import com.example.springbootdemo.servlet.DemoServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

	@Bean
	public ServletRegistrationBean getServletRegistrationBean() {
		ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new DemoServlet());
		servletRegistrationBean.addUrlMappings("/demoServlet");
		return servletRegistrationBean;
	}

	@Bean
	public FilterRegistrationBean getFilterRegistrationBean() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new DemoFilter());
		filterRegistrationBean.addUrlPatterns("/demoServlet");
		return filterRegistrationBean;
	}

	public ServletListenerRegistrationBean getServletListenerRegistrationBean() {
		ServletListenerRegistrationBean servletListenerRegistrationBean = new
				ServletListenerRegistrationBean(new DemoListener());
		return servletListenerRegistrationBean;
	}
}
