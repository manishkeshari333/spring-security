package com.explore.spring.security.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

	@GetMapping("/hello")
	public String printHello() {
		return "Hi User";
	}
}
