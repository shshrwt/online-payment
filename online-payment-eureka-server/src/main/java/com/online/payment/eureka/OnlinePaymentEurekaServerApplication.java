package com.online.payment.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OnlinePaymentEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlinePaymentEurekaServerApplication.class, args);
	}

}
