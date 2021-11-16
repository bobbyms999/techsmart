package com.techsmart.learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/tech-smart")
public class TechSmartController {

	@GetMapping(value = "/getdata")
	public String get() {
		System.out.println("tech smart request came");
		return "techsmart-response";
	}

}
