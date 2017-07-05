package com.micro.springstudy.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAction {

	@RequestMapping("/hello")
	public String hello() {
		return "Hello World! This is wdxtub.";
	}
}