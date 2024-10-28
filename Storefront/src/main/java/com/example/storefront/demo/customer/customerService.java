package com.example.storefront.demo.customer;

import java.util.List;
import java.util.Optional;

public class customerService {
    private final customerDAO customerDAO;

    public customerService(customerDAO customerDAO){
        this.customerDAO = customerDAO;
    }

    public List<customer> getAllCustomers() {
        return customerDAO.findAllcustomers();
    }

    public Optional<customer> getCustomerById(Integer id) {
        return customerDAO.findCustomerById(id);
    }

    public customer saveCustomer(customer customer) {
        return customerDAO.saveCustomer(customer);
    }

    public Optional<customer> updateCustomer(Integer id, customer customerDetails) {
        return customerDAO.findCustomerById(id).map(existingCustomer -> {
            existingCustomer.setName(customerDetails.getName());
            existingCustomer.setEmail(customerDetails.getEmail());
            return customerDAO.saveCustomer(existingCustomer);
        });
    }

    public List<customer> findByName (String name){
        return customerDAO.findCustomersByName(name);
    }

    public List<customer> findByEmail (String email){
        return customerDAO.findCustomerByEmail(email);
    }

    public void deleteCustomer(Integer id) {
        customerDAO.deleteCustomerById(id);
    }

}
