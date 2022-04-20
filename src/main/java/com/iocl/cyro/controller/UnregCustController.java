package com.iocl.cyro.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.iocl.cyro.model.ApiResponse;
import com.iocl.cyro.model.MstProduct;

import javax.servlet.http.HttpServletResponse;

import com.iocl.cyro.model.TrnOrderDetails;
import com.iocl.cyro.service.MstModelService;
import com.iocl.cyro.service.TrnOrderDetailsService;

import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

@RestController
@CrossOrigin(origins = { "http://localhost:4200", "https://uat.indianoil.co.in", "https://spandan.indianoil.co.in" })
@RequestMapping("/UnregCust")
@Slf4j
public class UnregCustController {

	@Autowired
	private TrnOrderDetailsService trnOrderDetailsService;

	@PostMapping("/createOrder")
	public ResponseEntity<ApiResponse> createOrder(@RequestBody TrnOrderDetails trnOrderDet) {
		TrnOrderDetails createOrder = trnOrderDetailsService.createOrder(trnOrderDet);
		System.out.print("inside controller 123 " + trnOrderDet.getCustName());
//		log.error("created order" + createOrder.toString());
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(new ApiResponse(true, "Details saved successfully"));
//		return trnOrderDet.getCity();

	}

	@GetMapping("/order-list")
	public ArrayList<TrnOrderDetails> fetchOrderDetails() {
		System.out.println("ORDER LIST");
		return trnOrderDetailsService.fetchAllOrders();
	}

	@GetMapping("/order-list/{reqno}")
	public TrnOrderDetails fetchOrderDetails(@PathVariable("reqno") int reqno) {
		System.out.println("ORDER LIST");
		return trnOrderDetailsService.fetchOneOrders(reqno);
	}

	@PutMapping("/update/{reqno}")
	public ResponseEntity<ApiResponse> updateTrnorderdetails(@PathVariable("reqno") int id,
			@RequestBody TrnOrderDetails trnOrderDetails) {
		
		TrnOrderDetails orderDetails = trnOrderDetailsService.updateTrnOrderdetails(id, trnOrderDetails);

		return ResponseEntity.status(HttpStatus.ACCEPTED).body(new ApiResponse(true, "Details Updated successfully"));
	}
}
