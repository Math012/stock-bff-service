package com.math012.stock_bff_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class StockBffServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockBffServiceApplication.class, args);
	}

}
