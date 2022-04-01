package com.iocl.cyro.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iocl.cyro.dao.MstProductDAO;
import com.iocl.cyro.model.MstProduct;;

@Service
public class MstProductService {
	@Autowired
	private MstProductDAO mstProductDao;
	
	public ArrayList<MstProduct> fetchAllProducts() {
		
		return mstProductDao.findAll();
//		return mstStateDistrictDao.findAll();
	}
}
