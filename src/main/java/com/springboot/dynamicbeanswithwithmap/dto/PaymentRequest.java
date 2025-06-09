package com.springboot.dynamicbeanswithwithmap.dto;

import lombok.Data;

@Data
public class PaymentRequest {
    private double amount;
    private String paymentMode;
    private String sender;
    private String receiver;
}
