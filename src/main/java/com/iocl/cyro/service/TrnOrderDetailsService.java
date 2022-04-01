package com.iocl.cyro.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.iocl.cyro.dao.TrnOrderDetailsDAO;
import com.iocl.cyro.model.TrnOrderDetails;

@Service
public class TrnOrderDetailsService {
	@Autowired
	private TrnOrderDetailsDAO trnOrderDetailsDao;
public void createOrder(TrnOrderDetails trnOrder) {
		System.out.println("CHECK");
//	trnOrderDetailsDao.save(trnOrder);
		trnOrderDetailsDao.save(trnOrder);
	}

public ArrayList<TrnOrderDetails> fetchAllOrders()
{
	return trnOrderDetailsDao.findAllOrder();
}
}
