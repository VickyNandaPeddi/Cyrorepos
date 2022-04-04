package com.iocl.cyro.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import com.iocl.cyro.model.*;
import java.util.ArrayList;
import com.iocl.cyro.model.TrnOrderDetails;

@Repository
public interface TrnOrderDetailsDAO extends CrudRepository<TrnOrderDetails, Integer> {
//	@Query(value = " insert into TRN_NONREG_ORDER (REQ_NO) values()", nativeQuery = true)
//	int createOrderDetails();
	@Query(value = " select * from  TRN_NONREG_ORDER ", nativeQuery = true)
	ArrayList<TrnOrderDetails> findAllOrder();
}
