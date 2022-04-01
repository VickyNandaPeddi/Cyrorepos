package com.iocl.cyro.dao;
import org.springframework.data.repository.CrudRepository;
import com.iocl.cyro.model.MstStateDistrict;
import java.util.ArrayList;
import org.springframework.data.jpa.repository.Query;

public interface MstStateDistrictDAO extends CrudRepository<MstStateDistrict, Integer>{

	
	public ArrayList<MstStateDistrict> findAll();
	
//	@Query("select distinct new MstStateDistrict(a.state_code,a.state_name)  from MstStateDistrict a")	
	@Query(value = " select STATE_CODE,STATE_NAME from MST_STATE_DISTRICT", nativeQuery = true)
	Object[][] findAllStateDetails();
}
