package com.paymentservice.paymentservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InitiatePaymentRequestDtos {
    private String orderId;
    private Long amount;
    private String phoneNumber;
    private String email;
}
