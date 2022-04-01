package com.iocl.cyro.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iocl.cyro.dao.MstModelDAO;
import com.iocl.cyro.dao.MstProductDAO;
import com.iocl.cyro.model.MstModel;

@Service
public class MstModelService {
	@Autowired
	private MstModelDAO mstModelDao;
	
	public ArrayList<MstModel> fetchAllModels() {
		
		return mstModelDao.findAll();
//		return mstStateDistrictDao.findAll();
	}
}
