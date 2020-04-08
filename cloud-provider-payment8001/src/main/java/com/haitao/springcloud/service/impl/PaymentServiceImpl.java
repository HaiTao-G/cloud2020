package com.haitao.springcloud.service.impl;

import com.haitao.springcloud.dao.PaymentDao;
import com.haitao.springcloud.entities.Payment;
import com.haitao.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @version 1.0.0
 * @ClassName PaymentServiceImpl
 * @Description TODO
 * @Author Tao
 * @Date 2020/4/8 15:04
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
