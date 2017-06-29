package com.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.repository.*;
import com.myapp.domain.Order;


@RestController
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	@RequestMapping(value="/orders", method=RequestMethod.POST)
	public ResponseEntity<String> add (@RequestBody Order order) {
		repository.save(order);
		return new ResponseEntity<String>("Order is Inserted", HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/orders", method=RequestMethod.GET)
	public List<Order> findAll () {
		
		return repository.findAll();
	}

	@RequestMapping(value="/orders/{id}", method=RequestMethod.GET)
	public Order findById (@PathVariable("id") String id) {
		
		return repository.findOne(id);
	}
}
