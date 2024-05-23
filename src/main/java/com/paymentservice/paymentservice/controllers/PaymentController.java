package com.paymentservice.paymentservice.controllers;

import com.paymentservice.paymentservice.dtos.InitiatePaymentRequestDtos;
import com.paymentservice.paymentservice.services.PaymentService;
import com.razorpay.RazorpayException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController { // External microservices will interact with PS microservice with this api

    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    @PostMapping("/")
    public String sayHello(@RequestBody InitiatePaymentRequestDtos requestDtos) throws RazorpayException {
        return paymentService.initiatePayment(requestDtos.getOrderId(), requestDtos.getAmount(), requestDtos.getPhoneNumber(), requestDtos.getEmail());
    }
}
