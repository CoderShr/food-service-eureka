package com.order.foodserviceeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableEurekaServer
@SpringBootApplication
public class FoodServiceEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodServiceEurekaApplication.class, args);
	}

}
