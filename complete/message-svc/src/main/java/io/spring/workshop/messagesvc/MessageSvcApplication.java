package io.spring.workshop.messagesvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MessageSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessageSvcApplication.class, args);
	}
}
