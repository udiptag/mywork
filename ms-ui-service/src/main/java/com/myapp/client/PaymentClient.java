package com.myapp.client;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.myapp.model.Payment;

@FeignClient("MS-PAYMENT")
public interface PaymentClient {

	@RequestMapping(value="/payments", method=RequestMethod.POST)
	ResponseEntity<String> addPayment(@RequestBody Payment payment);
	
	@RequestMapping(value="/payments/search/findByAmount", method=RequestMethod.GET)
	List<Payment> matchByAmount(@RequestParam("amount")long amount);
	
}
