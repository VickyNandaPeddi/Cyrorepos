package com.iocl.cyro.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.iocl.cyro.service.MstGeneralDropdownsService;
import com.iocl.cyro.service.MstModelService;
import com.iocl.cyro.service.MstProductService;
import com.iocl.cyro.service.MstStateDistrictService;
import com.iocl.cyro.model.*;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/generic")
public class genericController {
	@Autowired
	private MstStateDistrictService mstStateDistService;
	@Autowired
	private MstProductService mstProdService;

	@Autowired
	private MstModelService mstModelService;

	@Autowired
	private MstGeneralDropdownsService mstGeneralDrops;

	@GetMapping("/Hi")
	public String showmessage() {
		System.out.print("inside controller");
		return "test";
	}

	@GetMapping("/state-list")
	public ArrayList<MstStateDistrict> getStateList() {

		return mstStateDistService.fetchAllStates();
	}

	@GetMapping("/product-list")
	public ArrayList<MstProduct> getProductList() {

		return mstProdService.fetchAllProducts();
	}

	@GetMapping("/model-list")
	public ArrayList<MstModel> getModelList() {

		return mstModelService.fetchAllModels();

		// @formatter:on
	}

	@GetMapping("/drops-list/{type_slno}")
	public ArrayList<MstGeneralDropdowns> getGeneralDrops(@PathVariable String type_slno) {

		return mstGeneralDrops.fetchGeneralDrops(type_slno);

		// @formatter:on
	}
}
