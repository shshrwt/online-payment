package com.online.payment.biller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OnlinePaymentBillerSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlinePaymentBillerSvcApplication.class, args);
	}

}
