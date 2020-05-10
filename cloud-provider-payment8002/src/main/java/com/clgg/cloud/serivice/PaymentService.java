package com.clgg.cloud.serivice;

import com.clgg.cloud.entities.Payment;

public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(Long id);
}
