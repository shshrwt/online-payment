package com.online.payment.hystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class OnlinePaymentHystrixdashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlinePaymentHystrixdashboardApplication.class, args);
	}

}
