package com.jaed.currencyservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.jaed.currencyservice")
@EnableDiscoveryClient
public class CurrencyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyServiceApplication.class, args);
	}
}
