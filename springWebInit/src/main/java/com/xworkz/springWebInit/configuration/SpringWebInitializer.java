package com.xworkz.springWebInit.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
		implements WebMvcConfigurer {

	public SpringWebInitializer() {
		System.out.println("created spring web init");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {

		System.out.println("running in getRootConfigClasses ");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("running in getServletConfigClasses ");

		return new Class[] {BeanConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("running in getServletMappings ");
		return new String[] {"/"};
	}
@Override
public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	// TODO Auto-generated method stub
	WebMvcConfigurer.super.configureDefaultServletHandling(configurer);
}


}
