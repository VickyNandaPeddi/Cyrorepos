package com.iocl.cyro.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

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
		trnOrder.setCreatedOn(new Timestamp(System.currentTimeMillis()));
		return trnOrderDetailsDao.save(trnOrder);
	}

	public ArrayList<TrnOrderDetails> fetchAllOrders() {
		return trnOrderDetailsDao.findAllOrder();
	}
}
