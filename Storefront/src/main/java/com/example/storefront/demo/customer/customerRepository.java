package com.example.storefront.demo.customer;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface customerRepository extends JpaRepository <customer, Integer> {
    
    List<customer> findByName(String name);

    List<customer> findByEmail(String email);
}

