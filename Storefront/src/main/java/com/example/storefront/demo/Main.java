package com.example.storefront.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan("com.example.storefront.demo.customer")
@EnableJpaRepositories("com.example.storefront.demo.customerRepository")
public class Main {
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}
