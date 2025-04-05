package com.riskshield.riskshield;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping
    public String createCustomer(@RequestBody Customer customer) {
        customerRepository.save(customer);
        return "Customer saved with name: " + customer.getName();
    }
}
