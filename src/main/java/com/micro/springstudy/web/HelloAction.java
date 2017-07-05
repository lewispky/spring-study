package com.micro.springstudy.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloAction {

	@RequestMapping("/hellos")
	public String hellos() {
		return "Hello World! This is wdxtub.";
	}
}