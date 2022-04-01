package com.iocl.cyro.dao;

import org.springframework.data.repository.CrudRepository;

import com.iocl.cyro.model.MstGeneralDropdowns;
import java.util.ArrayList;

public interface MstGeneralDropdownsDAO extends CrudRepository<MstGeneralDropdowns, Integer>{
ArrayList<MstGeneralDropdowns> getMstGeneralDropdownsBytypeSlno(String type_slno);
}
