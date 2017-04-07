package com.muselab.project1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@SpringBootApplication
@Configuration
@ComponentScan(basePackages = "com.muselab.project1")
@EntityScan("com.muselab.project1.domain")
@EnableJpaRepositories("com.muselab.project1.repository")

public class SpringbootJpa1Application extends SpringBootServletInitializer{
   	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringbootJpa1Application.class);
    }
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpa1Application.class, args);
	}
}
