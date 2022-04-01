package com.iocl.cyro.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iocl.cyro.dao.MstGeneralDropdownsDAO;
import com.iocl.cyro.dao.MstModelDAO;
import com.iocl.cyro.model.MstGeneralDropdowns;
import com.iocl.cyro.model.MstModel;

@Service
public class MstGeneralDropdownsService {
	@Autowired
	private MstGeneralDropdownsDAO mstGeneralDAO;
	
	public ArrayList<MstGeneralDropdowns> fetchGeneralDrops(String type_slno) {
		
		return mstGeneralDAO.getMstGeneralDropdownsBytypeSlno(type_slno);
//		return mstStateDistrictDao.findAll();
	}
}
