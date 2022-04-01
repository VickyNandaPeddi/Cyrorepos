package com.iocl.cyro.dao;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.iocl.cyro.model.MstModel;
import com.iocl.cyro.model.MstProduct;;

public interface MstModelDAO extends CrudRepository<MstModel, Integer> {
	public ArrayList<MstModel> findAll();
}
