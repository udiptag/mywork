package com.myapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myapp.client.OrderClient;
import com.myapp.client.PaymentClient;
import com.myapp.model.Order;
import com.myapp.model.Payment;

@Controller
public class OrderpaymentService {

	@Autowired
	private OrderClient orderClient;
	
	@Autowired
	private PaymentClient paymentClient;
	
	@RequestMapping("/findOrders")
	public String findAll(Model model) {
		List <Order> orders = orderClient.findAll();
		model.addAttribute("orders", orders);
		return "list";
	}
	
	@RequestMapping("/findPayments/{amount}")
	public String findAllPayments(@PathVariable("amount")long amount, Model model) {
		List<Payment> payment = paymentClient.matchByAmount(amount);
		model.addAttribute("payment", payment);
		return "pay";
	}
	// Need changes in OrderClient.java as well and if needed in ms-order service
	/*
	@RequestMapping("/findOrders/{amount}")
	public String findAll(@PathVariable("amount")long amount, Model model) {
		List<Order> orders=orderClient.findAll();
		model.addAttribute("orders", orders);
		
		return "list";
	}
	*/
	
}
