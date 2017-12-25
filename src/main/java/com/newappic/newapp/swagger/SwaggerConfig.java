package com.newappic.newapp.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	
	@Bean
	public Docket swaggerPersonApi() {
		
		Docket docket=new Docket(DocumentationType.SWAGGER_2)
				.groupName("Person")
				.select()
				.paths(regex("/api.*")).build().apiInfo(getApiInfo());
		
		return docket;
	}
	
	
	@Bean
	public Docket swaggerAccountApi() {
		
		Docket docket=new Docket(DocumentationType.SWAGGER_2)
				.groupName("Account")
				.select()
				.paths(regex("/api.*")).build().apiInfo(getApiInfo());
		
		return docket;
	}
	

	@Bean
	public Docket swaggerExpenseApi() {
		
		Docket docket=new Docket(DocumentationType.SWAGGER_2)
				.groupName("Expense")
				.select()
				.paths(regex("/api.*")).build().apiInfo(getApiInfo());
		
		return docket;
	}

	/**
	 * 
	 * @return
	 */
	public ApiInfo getApiInfo() {
		return new ApiInfo("Android App", "Room Management System", "1.0", "https://www.google.com", "Sudeep", "license", "licenseUrl");
	}
}
