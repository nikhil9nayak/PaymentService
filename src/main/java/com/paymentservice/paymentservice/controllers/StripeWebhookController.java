package com.paymentservice.paymentservice.controllers;

import com.stripe.model.Event;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stripeWebhook")
public class StripeWebhookController {

    @PostMapping
    public void stripeWebhook(Event event){   // After an Event successfully completed, this webhook will auto trigger. Event can be anything like Payment Successful, Payment Failed, Payment Pending etc
        System.out.println("Stripe Webhooks");
    }
}
