package io.spring.workshop.simplediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SimpleDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleDiscoveryApplication.class, args);
	}
}
