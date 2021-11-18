package com.techsmart.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techsmart.learn.entity.Student;
import com.techsmart.learn.repo.StudentRepo;

@RestController
@RequestMapping(value = "/tech-smart")
public class TechSmartController {

	@Autowired
	StudentRepo studentRepo;

	@GetMapping(value = "/getdata")
	public String get() {
		System.out.println("tech get request came");
		return studentRepo.findAll().toString();
	}

	@PostMapping(value = "/postdata")
	public void post(@RequestBody Student student) {
		System.out.println("tech post request came");
		studentRepo.save(student);
		System.out.println("saved");
	}
}
