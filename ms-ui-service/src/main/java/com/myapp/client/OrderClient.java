package com.myapp.client;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myapp.model.Order;

@FeignClient("ms-order")
public interface OrderClient {
	
	@RequestMapping("/orders")
	List<Order> findAll();
	
	@RequestMapping(value="/orders", method=RequestMethod.POST)
	ResponseEntity<String> saveOrder(@RequestBody Order order);

}
