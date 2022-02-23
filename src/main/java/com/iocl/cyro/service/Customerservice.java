package com.iocl.cyro.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iocl.cyro.dao.Customerdao;
import com.iocl.cyro.model.Customer;

@Service
@Transactional

public class Customerservice {

	@Autowired
	public Customerdao customerdao;

	public Customer saveCustomer(Customer customer) {

		return customerdao.save(customer);
	}

	public List<Customer> findAllCustomers() {
		return customerdao.findAll();
	}
}