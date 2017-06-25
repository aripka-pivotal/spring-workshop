package io.spring.workshop.clientlb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RibbonClient(name="messenger", configuration=MessengerConfig.class)
public class MessageClientController {

	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/message")
	public String message(){
		
		String message = restTemplate.getForObject("http://messenger/message", String.class);
		
		System.out.println(message);
		
		return message;
	}
	
}