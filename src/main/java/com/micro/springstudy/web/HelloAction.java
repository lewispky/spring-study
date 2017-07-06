package com.micro.springstudy.web;

import com.micro.springstudy.utils.PropertiesUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloAction {

	@RequestMapping("/hellos")
	public String hellos() {
		String times = PropertiesUtils.getCommonInfoPropertiesValue("claims.unread.mag.time");
		return "Hello World! This is wdxtub." + ",time=" + times;
	}
}