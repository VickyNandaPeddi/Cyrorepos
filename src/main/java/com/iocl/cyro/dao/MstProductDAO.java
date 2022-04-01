package com.iocl.cyro.dao;

import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;
import java.util.ArrayList;
import org.springframework.data.jpa.repository.Query;
import com.iocl.cyro.model.MstProduct;


public interface MstProductDAO  extends CrudRepository<MstProduct, Integer> {
	public ArrayList<MstProduct> findAll();
}
