package com.riskshield.riskshield;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private MessageSender messageSender;

    @PostMapping
    public String createCustomer(@RequestBody Customer customer) {
        customerRepository.save(customer);
        messageSender.sendMessage("New customer added: " + customer.getName());
        return "Customer saved with name: " + customer.getName();
    }
}
