package com.springboot.dynamicbeanswithwithmap.service.impl;


import com.springboot.dynamicbeanswithwithmap.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service("paypal")
@Slf4j
public class PaypalPaymentServiceImpl implements PaymentService {
    @Override
    public String pay(double amount, String paymentMode, String sender, String receiver) {
        log.info("Processing payment for amount: {} from sender: {} to receiver: {} with paymentMode: {}", amount, sender, receiver, paymentMode);
        return "Processed payment for amount: " + amount + " from sender: " + sender + " to receiver: " + receiver + " with payment mode: " + paymentMode;
    }
}
