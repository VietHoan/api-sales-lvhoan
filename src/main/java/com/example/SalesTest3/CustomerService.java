package com.example.SalesTest3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> getALlCustomer(){
        return  customerRepository.findAll();
    }

    public Customer getCustomerByName(String name){
        return customerRepository.getCustomerByName(name);
    }

    public void addNewCustomer(Customer customer){
        customerRepository.save(customer);
    }


}
