package com.myapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyService {

	@Value("${rate}")
	String rate;
	
	@Value("${lanecount}")
	String lanecount;
	
	@RequestMapping("/")
	public String getDataFromProps()
	{
		return rate + " " + lanecount;
	}
}
