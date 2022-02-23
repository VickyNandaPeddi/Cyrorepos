package com.iocl.cyro.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iocl.cyro.model.Customer;

@Repository
public interface Customerdao extends JpaRepository<Customer, Integer> {

}
