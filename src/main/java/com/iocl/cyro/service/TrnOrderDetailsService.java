package com.iocl.cyro.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.iocl.cyro.dao.TrnOrderDetailsDAO;
import com.iocl.cyro.model.TrnOrderDetails;

@Service
@Transactional
public class TrnOrderDetailsService {
	@Autowired
	private TrnOrderDetailsDAO trnOrderDetailsDao;

	public TrnOrderDetails createOrder(TrnOrderDetails trnOrder) {
		System.out.println("CHECK");

		return trnOrderDetailsDao.save(trnOrder);
	}

	public ArrayList<TrnOrderDetails> fetchAllOrders() {
		return trnOrderDetailsDao.findAllOrder();
	}
}
