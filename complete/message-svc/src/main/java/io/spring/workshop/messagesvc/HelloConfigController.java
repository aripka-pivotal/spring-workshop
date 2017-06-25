package io.spring.workshop.messagesvc;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class HelloConfigController {
	
	@Value("${common.message:no common config found}")
	private String commonMessage;
	
	
	@Value("${hello.message:no hello message found}")
	private String helloMessage;
	
	@Value("${server.port:undefined}")
	private String serverPort;

	@RequestMapping("/config")
	public Map<String, String> echoValues(){
		HashMap<String,String> hm = new HashMap<String, String>();
		
		hm.put("common-message",commonMessage);
		hm.put("hello-message",helloMessage);
		hm.put("server-port", serverPort);
		
		return hm;
	}
}