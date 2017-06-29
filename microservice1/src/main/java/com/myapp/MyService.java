package com.myapp;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MyService {

	//http://localhost:8001/ibm/say
	@RequestMapping(value="/say", method=RequestMethod.GET)
	public String say() {
		return "Hello " + new Date();
	}
}
