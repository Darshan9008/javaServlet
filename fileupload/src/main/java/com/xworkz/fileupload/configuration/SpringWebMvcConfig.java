package com.xworkz.fileupload.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc
@Configuration
@ComponentScan("com.xworkz.fileupload")
public class SpringWebMvcConfig extends WebMvcConfigurerAdapter {
	
	
	  @Bean
	    public MultipartResolver multipartResolver() {
	        return new StandardServletMultipartResolver();
	    }

		/*
		// if the method name is different, you must define the bean name manually like this :
		@Bean(name = "multipartResolver")
	    public MultipartResolver createMultipartResolver() {
	        return new StandardServletMultipartResolver();
	    }*/

	    @Bean
	    public InternalResourceViewResolver viewResolver() {
	        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	        viewResolver.setViewClass(JstlView.class);
	        viewResolver.setPrefix("/");
	        viewResolver.setSuffix(".jsp");
	        return viewResolver;
	    }

	

}
