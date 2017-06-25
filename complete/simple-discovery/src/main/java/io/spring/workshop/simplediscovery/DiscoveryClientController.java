package io.spring.workshop.simplediscovery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiscoveryClientController {

	@Autowired
	private MessageServiceClient messageSvcClient;

	@RequestMapping("/")
	public ClientMessage getMessage() {

		return messageSvcClient.getMessage();
	}

}
