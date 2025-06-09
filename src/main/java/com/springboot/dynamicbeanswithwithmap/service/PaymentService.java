package com.springboot.dynamicbeanswithwithmap.service;

public interface PaymentService {
    String pay(double amount, String paymentMode, String sender, String receiver);
}
