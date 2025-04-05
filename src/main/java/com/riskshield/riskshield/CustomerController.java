package com.riskshield.riskshield;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @PostMapping
    public String createCustomer(@RequestBody String customer) {
        return "Customer has been received: " + customer;
    }
}
