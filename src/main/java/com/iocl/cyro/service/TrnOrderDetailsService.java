package com.iocl.cyro.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.iocl.cyro.dao.TrnOrderDetailsDAO;
import com.iocl.cyro.model.TrnOrderDetails;

@Service
@Transactional
public class TrnOrderDetailsService {
    @Autowired
    private TrnOrderDetailsDAO trnOrderDetailsDao;

    public TrnOrderDetails createOrder(TrnOrderDetails trnOrder) {
        System.out.println("CHECK");
        trnOrder.setCreatedOn(new Timestamp(System.currentTimeMillis()));
        return trnOrderDetailsDao.save(trnOrder);
    }

    public ArrayList<TrnOrderDetails> fetchAllOrders() {
        return trnOrderDetailsDao.findAllOrder();
    }

    public TrnOrderDetails fetchOneOrders(int id) {
        return trnOrderDetailsDao.findById(id).get();
    }


    public TrnOrderDetails updateTrnOrderdetails(int id, TrnOrderDetails trnOrderDetails) {
        TrnOrderDetails _orderDetails = trnOrderDetailsDao.findById(id).get();


        _orderDetails.setCreatedOn(trnOrderDetails.getCreatedOn());
        _orderDetails.setAccountnumber(trnOrderDetails.getAccountnumber());
        _orderDetails.setBilltoaddr(trnOrderDetails.getBilltoaddr());
        _orderDetails.setBranchcode(trnOrderDetails.getBranchcode());
        _orderDetails.setCancelledcheque(trnOrderDetails.getCancelledcheque());
        _orderDetails.setCity(trnOrderDetails.getCity());
        _orderDetails.setCustName(trnOrderDetails.getCustName());
        _orderDetails.setEmail(trnOrderDetails.getEmail());
        _orderDetails.setGstcertificate(trnOrderDetails.getGstcertificate());
        _orderDetails.setGstno(trnOrderDetails.getGstno());
        _orderDetails.setDeliverytype(trnOrderDetails.getDeliverytype());
        _orderDetails.setPanno(trnOrderDetails.getPanno());
        _orderDetails.setTcsdeclarationform(trnOrderDetails.getTcsdeclarationform());
        _orderDetails.setTcsapplicable(trnOrderDetails.getTcsapplicable());
        _orderDetails.setTanno(trnOrderDetails.getTanno());
        _orderDetails.setState(trnOrderDetails.getState());
        _orderDetails.setShiptoaddr(trnOrderDetails.getShiptoaddr());
        _orderDetails.setRemarks(trnOrderDetails.getRemarks());
        _orderDetails.setQuantity(trnOrderDetails.getQuantity());
        _orderDetails.setMobile(trnOrderDetails.getMobile());
        _orderDetails.setProduct(trnOrderDetails.getProduct());
        _orderDetails.setModel(trnOrderDetails.getModel());
        _orderDetails.setPancertificate(trnOrderDetails.getPancertificate());
        _orderDetails.setPayeename(trnOrderDetails.getPayeename());
        _orderDetails.setIfsccode(trnOrderDetails.getIfsccode());
        return trnOrderDetailsDao.save(_orderDetails);

    }

}
