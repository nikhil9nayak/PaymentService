package com.paymentservice.paymentservice.services;

import com.paymentservice.paymentservice.paymentgateways.PaymentGateway;
import com.razorpay.RazorpayException;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private PaymentGateway paymentGateway;

    public PaymentService(PaymentGateway paymentGateway){
        this.paymentGateway = paymentGateway;
    }

    public String initiatePayment(String orderId, Long amount, String phoneNumber, String email) throws RazorpayException {
//        Long amount = 10000L;

        //Generate Payment Link
        return paymentGateway.generatePaymentLink(orderId, amount, phoneNumber, email);
    }
}
