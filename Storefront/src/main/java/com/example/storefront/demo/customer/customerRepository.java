package com.example.storefront.demo.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Component
public interface customerRepository extends JpaRepository <customer, Integer> {
    
    List<customer> findByName(String name);

    List<customer> findByEmail(String email);
}

