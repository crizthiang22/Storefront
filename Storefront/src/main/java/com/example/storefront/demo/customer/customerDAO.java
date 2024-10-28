package com.example.storefront.demo.customer;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class customerDAO {
    private final customerRepository customerRepository;

    public customerDAO(customerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public List<customer> findAllcustomers() {
        return customerRepository.findAll();
    }

   public Optional<customer> findCustomerById (Integer id){
        return customerRepository.findById(id);
    }

    public void deleteCustomerById(Integer id){
        customerRepository.deleteById(id);
    }

    public customer saveCustomer(customer customer){
       return customerRepository.save(customer);
    }

    public List<customer> findCustomersByName(String name) {
        return customerRepository.findByName(name);
    }

    public List<customer> findCustomerByEmail(String email) {
        return customerRepository.findByEmail(email);
    }


}
