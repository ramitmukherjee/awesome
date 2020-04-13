package com.rm.awesome;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class AwesomeConfig implements WebMvcConfigurer{
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static/**")
			.addResourceLocations("/WEB-INF/pdf/");
	}
	
	@Bean
	public ViewResolver viewResolver() {
		
		InternalResourceViewResolver viewResolverBean = new InternalResourceViewResolver();
		viewResolverBean.setPrefix("/WEB-INF/jsp/");
		viewResolverBean.setSuffix(".jsp");
		viewResolverBean.setOrder(0);
		
		return viewResolverBean;
	}
	
}
