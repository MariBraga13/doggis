package com.puc.doggis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = { "com.puc.doggis.entity" })
@EnableJpaRepositories(basePackages = { "com.puc.doggis.repository" })
@ComponentScan(basePackages = {"com.puc.doggis.controller"})
public class DoggisApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoggisApplication.class, args);
	}

}
