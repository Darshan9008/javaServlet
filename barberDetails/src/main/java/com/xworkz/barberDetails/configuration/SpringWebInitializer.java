package com.xworkz.barberDetails.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebInitializer  extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("invoking getServletConfigClasses");
		// TODO Auto-generated method stub
		return new Class[] {BeanConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {


		System.out.println("invoking getServletMappings() ");
		return new String[] {"/"};
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {


		configurer.enable();
		WebMvcConfigurer.super.configureDefaultServletHandling(configurer);
	}

}
