package com.iocl.cyro.service;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iocl.cyro.dao.MstModelDAO;
import com.iocl.cyro.dao.MstProductDAO;
import com.iocl.cyro.model.MstModel;
import com.iocl.cyro.model.MstProduct;

@Service
public class MstModelService {
	@Autowired
	private MstModelDAO mstModelDao;

	public ArrayList<MstModel> fetchAllModels() {

		return mstModelDao.findAll();
//		return mstStateDistrictDao.findAll();
	}

	@PostConstruct
	public void saveMstStateDistrict() {
		mstModelDao.save(new MstModel(1,"firstModelcode", "this is first Model code"));
		mstModelDao.save(new MstModel(2,"secoundModelcode", "this is secound Model code"));
	}
}
