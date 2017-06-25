package io.spring.workshop.messagesvc;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloConfigController {
	
	@Value("${common.message:no common config found}")
	private String commonMessage;
	
	
	@Value("${hello.message:no hello message found}")
	private String helloMessage;

	@RequestMapping("/config")
	public Map<String, String> echoValues(){
		HashMap<String,String> hm = new HashMap<String, String>();
		
		hm.put("common-message",commonMessage);
		hm.put("hello-message",helloMessage);
		return hm;
	}
}