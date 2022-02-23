package com.iocl.cyro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iocl.cyro.model.Customer;
import com.iocl.cyro.response.Response;
import com.iocl.cyro.service.Customerservice;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	public Customerservice customerservice;

	@GetMapping("/customers")
	public ResponseEntity<?> findallCustomers() {
		return new ResponseEntity<>(HttpStatus.ACCEPTED).ok(customerservice.findAllCustomers());
	}

	@PostMapping("/customer")
	public ResponseEntity<?> saveCustomer(@RequestBody Customer customer) {
//		return new ResponseEntity<>(HttpStatus.ACCEPTED).ok(customerservice.saveCustomer(customer));
		return new ResponseEntity<Response>(
				new Response(true, "saved Customer Sucessfully", customerservice.saveCustomer(customer)),
				HttpStatus.CREATED);
	}
}
