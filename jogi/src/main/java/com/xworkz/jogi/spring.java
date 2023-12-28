package com.xworkz.jogi;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class spring extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
System.out.println("running in getRootConfigClasses()");	
return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

System.out.println("invoking in getServletConfigClasses()");
		return null;
	}

	@Override
	protected String[] getServletMappings() {

System.out.println("invoking in getServletMappings()");
		return null;
	}
	
	
	

}
