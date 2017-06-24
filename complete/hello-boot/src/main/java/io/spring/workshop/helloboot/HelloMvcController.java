package io.spring.workshop.helloboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloMvcController {
	@RequestMapping("hello")
	public String hello(Model model){
		model.addAttribute("message", "hello UI");
		return "hello";
	}
}
