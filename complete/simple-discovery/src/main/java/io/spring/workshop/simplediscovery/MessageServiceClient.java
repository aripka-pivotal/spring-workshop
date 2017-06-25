package io.spring.workshop.simplediscovery;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MessageServiceClient {

	@Autowired
	private DiscoveryClient discoveryClient;

	public ClientMessage getMessage() {

		List<ServiceInstance> list = discoveryClient.getInstances("messenger");
		if (list == null || list.size() == 0) {
			throw new RuntimeException("No service instances found!");
		}

		RestTemplate restTemplate = new RestTemplate();
		String remoteMessage = restTemplate.getForObject(list.get(0).getUri()+"/message", String.class);

		return new ClientMessage("simple-discovery", remoteMessage);

	}

	
	
}
