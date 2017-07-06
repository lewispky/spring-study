package com.micro.springstudy.web;

import com.micro.springstudy.utils.MicroLogFactory;
import com.micro.springstudy.utils.MicroLogUtil;
import com.micro.springstudy.utils.PropertiesUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloAction {

	private static final MicroLogUtil log = MicroLogFactory.getLogger();

	@RequestMapping("/hellos")
	public String hellos() {
		String times = PropertiesUtils.getCommonInfoPropertiesValue("claims.unread.mag.time");
		log.info("111111111111111111111");
		return "Hello World! This is wdxtub." + ",time=" + times;
	}
}