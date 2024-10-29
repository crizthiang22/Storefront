package com.example.storefront.demo.customer;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
@Component

public class customerController {
    private final customerService customerService;

    public customerController(customerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<customer> getAllCustomer() {
        return customerService.getAllCustomers();
    }
}
