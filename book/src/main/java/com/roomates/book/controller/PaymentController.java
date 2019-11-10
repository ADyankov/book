package com.roomates.book.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/payment")
public class PaymentController {

    @PostMapping(value = "/createPayment",
             consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
             produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<String> createPayment(String paymentData) {

        System.out.println(paymentData);
        return null;
    }

    @GetMapping(value = "/getPayment", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<String> getPayment(@RequestParam(value = "paymentId") String paymentId) {
        System.out.println(paymentId);
        return new ResponseEntity<>("some response", HttpStatus.OK);
    }


}
