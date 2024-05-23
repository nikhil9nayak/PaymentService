package com.paymentservice.paymentservice.paymentgateways;

public class StripePaymentGateway implements PaymentGateway{
    @Override
    public String generatePaymentLink(String orderId, Long amount, String phoneNumber, String email) {
        return null;
    }
}
