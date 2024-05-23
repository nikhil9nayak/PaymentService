package com.paymentservice.paymentservice.paymentgateways;

import com.razorpay.RazorpayException;

public interface PaymentGateway {
    String generatePaymentLink(String orderId, Long amount, String phoneNumber, String email) throws RazorpayException;

}
