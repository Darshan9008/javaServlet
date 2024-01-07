package com.xworkz.fileupload.configuration;

import java.io.File;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebInitializer  extends AbstractAnnotationConfigDispatcherServletInitializer {
	
	 private int maxUploadSizeInMb = 5 * 1024 * 1024; // 5 MB

	    @Override
	    protected Class<?>[] getServletConfigClasses() {
	        return new Class[]{SpringWebMvcConfig.class};
	    }

	    @Override
	    protected String[] getServletMappings() {
	        return new String[]{"/"};
	    }

	    @Override
	    protected Class<?>[] getRootConfigClasses() {
	        return null;
	    }

	    @Override
	    protected void customizeRegistration(ServletRegistration.Dynamic registration) {

	        // upload temp file will put here
	        File uploadDirectory = new File("C:\\Users\\admin\\Documents\\darshan doc");

	        // register a MultipartConfigElement
	        MultipartConfigElement multipartConfigElement =
	                new MultipartConfigElement(uploadDirectory.getAbsolutePath(),
	                        maxUploadSizeInMb, maxUploadSizeInMb * 2, maxUploadSizeInMb / 2);

	        registration.setMultipartConfig(multipartConfigElement);
	
	
	
	    }
	    
	    
	    

}
