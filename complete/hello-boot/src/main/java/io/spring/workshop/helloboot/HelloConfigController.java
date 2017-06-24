package io.spring.workshop.helloboot;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloConfigController {
	private String commonMessage="com";
	private String helloMessage="hello";

	@RequestMapping("/config")
	public Map<String, String> echoValues(){
		HashMap<String,String> hm = new HashMap<String, String>();
		
		hm.put("common-message",commonMessage);
		hm.put("hello-message",helloMessage);
		return hm;
	}
}