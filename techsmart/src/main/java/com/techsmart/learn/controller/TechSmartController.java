package com.techsmart.learn.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TechSmartController {

	/*
	 * @Autowired StudentRepo studentRepo;
	 */

	@GetMapping(value = "/getdata", produces = MediaType.APPLICATION_JSON_VALUE)
	public String get() {
		System.out.println("tech get request came");
		String respone = "";
		Map<String, String> resposneMap = new HashMap<String, String>();
		try {
			respone = InetAddress.getLocalHost().getHostName();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		resposneMap.put("Instance", respone);
		System.out.println("returning response " + resposneMap);
		return resposneMap.toString();
	}

	/*
	 * @PostMapping(value = "/postdata") public void post(@RequestBody Student
	 * student) { System.out.println("tech post request came");
	 * studentRepo.save(student); System.out.println("saved"); }
	 */
}
