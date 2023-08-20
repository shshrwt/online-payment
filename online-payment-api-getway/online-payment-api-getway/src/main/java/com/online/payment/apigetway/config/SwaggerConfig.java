package com.online.payment.apigetway.config;

import java.util.Objects;

import org.springdoc.core.SwaggerUiConfigParameters;
import org.springframework.boot.CommandLineRunner;
import org.springframework.cloud.gateway.route.RouteDefinition;
import org.springframework.cloud.gateway.route.RouteDefinitionLocator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

	//https://github.com/oguztopal/springcloud-gateway/tree/master
	
    @Bean
    public CommandLineRunner openApiGroups(
            RouteDefinitionLocator locator,
            SwaggerUiConfigParameters swaggerUiParameters) {
        return args -> Objects.requireNonNull(locator
                        .getRouteDefinitions().collectList().block())
                .stream()
                .map(RouteDefinition::getId).peek(e -> System.out.println("map value: " + e))
                .filter(id -> id.matches(".*-service"))
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(id -> id.replace("-service", ""))
                .forEach(swaggerUiParameters::addGroup);
    }
}
