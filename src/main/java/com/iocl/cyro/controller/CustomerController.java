package com.iocl.cyro.controller;

import com.iocl.cyro.model.Customer;
import com.iocl.cyro.response.Response;
import com.iocl.cyro.service.Customerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	public Customerservice customerservice;

	@GetMapping("/customers")
	public ResponseEntity<?> findallCustomers() {
		return new ResponseEntity<>(HttpStatus.ACCEPTED).ok(customerservice.findAllCustomers());
	}

	@PostMapping("/customer")
	public ResponseEntity<?> saveCustomer(@Valid @RequestBody Customer customer) {
//		return new ResponseEntity<>(HttpStatus.ACCEPTED).ok(customerservice.saveCustomer(customer));
		return new ResponseEntity<Response>(
				new Response(true, "saved Customer Sucessfully", customerservice.saveCustomer(customer)),
				HttpStatus.CREATED);
	}
}
