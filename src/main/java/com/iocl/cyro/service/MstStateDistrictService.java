package com.iocl.cyro.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.iocl.cyro.dao.MstStateDistrictDAO;
import java.util.ArrayList;

import javax.annotation.PostConstruct;

import com.iocl.cyro.model.*;

@Service
public class MstStateDistrictService {
	@Autowired
	private MstStateDistrictDAO mstStateDistrictDao;

	public ArrayList<MstStateDistrict> fetchAllStates() {

		Object[][] test = mstStateDistrictDao.findAllStateDetails();
		return mstStateDistrictDao.findAll();
	}

	@PostConstruct
	public void saveMstStateDistrict() {
		mstStateDistrictDao.save(new MstStateDistrict(1, "MP", "Madya Pradesh", "01", "Guntur"));
		mstStateDistrictDao.save(new MstStateDistrict(2, "AP", "Andra Pradesh", "02", "Guntur"));
	}
}
