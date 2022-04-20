package com.iocl.cyro.service;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iocl.cyro.dao.MstProductDAO;
import com.iocl.cyro.model.MstProduct;
import com.iocl.cyro.model.MstStateDistrict;;

@Service
public class MstProductService {
	@Autowired
	private MstProductDAO mstProductDao;

	public ArrayList<MstProduct> fetchAllProducts() {

		return mstProductDao.findAll();
//		return mstStateDistrictDao.findAll();
	}

	@PostConstruct
	public void saveMstStateDistrict() {
		mstProductDao.save(new MstProduct(1,"firstproductcode", "this is first product code"));
		mstProductDao.save(new MstProduct(2,"secoundproductcode", "this is secound product code"));
	}
}
