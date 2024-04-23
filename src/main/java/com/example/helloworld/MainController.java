package com.example.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/stc")
	public String stc(Model model) {
		
		model.addAttribute("hello", "Hello World !!!");
		
		return "stc";
	}
	
	@GetMapping("/cts")
	public String cts() {
		return "cts";
	}
	
	@PostMapping("/cts")
	public String cts(@RequestParam("id") String id, 
			          @RequestParam("pw") String pw) {
		
		System.out.println("id : " + id);
		System.out.println("pw : " + pw);
		
		return "cts";
	}
	
}
