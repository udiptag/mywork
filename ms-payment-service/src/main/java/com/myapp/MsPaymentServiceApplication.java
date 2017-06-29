package com.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// Exclude added as plain json is also containing links. 
// As in ms-payments we have implemented db call itself as API.
//@SpringBootApplication(exclude=RepositoryRestMvcAutoConfiguration.class)
@SpringBootApplication
@EnableEurekaClient
@EnableJpaRepositories
public class MsPaymentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsPaymentServiceApplication.class, args);
	}
}
