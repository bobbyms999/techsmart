package com.techsmart.learn.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

	@GetMapping(value = "/healthcheck", produces = MediaType.APPLICATION_JSON_VALUE)
	public String get() {
		System.out.println("healthcheck request came");
		Map<String, String> resposneMap = new HashMap<String, String>();
		resposneMap.put("Instance", "Up");
		System.out.println("healthcheck returning response " + resposneMap);
		return resposneMap.toString();
	}

}
