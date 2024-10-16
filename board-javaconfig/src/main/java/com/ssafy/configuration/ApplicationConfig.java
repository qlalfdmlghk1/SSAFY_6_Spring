package com.ssafy.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

@Configuration
@ComponentScan(basePackages = "com.ssafy")
public class ApplicationConfig {
	
	@Bean
	public DataSource getDataSource() {
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		dataSource.setDriverClass(com.mysql.cj.jdbc.Driver.class);
		dataSource.setUrl("jdbc:mysql://localhost:3306/ssafyweb?serverTimezone=UTC");
		dataSource.setUsername("ssafy");
		dataSource.setPassword("ssafy");
		return dataSource;
		
		
	}
}
