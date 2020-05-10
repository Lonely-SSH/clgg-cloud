package com.clgg.cloud.serivice.impl;

import com.clgg.cloud.dao.PaymentDao;
import com.clgg.cloud.entities.Payment;
import com.clgg.cloud.serivice.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById( Long id){

        return paymentDao.getPaymentById(id);

    }
}
