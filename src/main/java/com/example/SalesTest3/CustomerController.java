package com.example.SalesTest3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping
    List<Customer> getAllCustomer() {
        return customerService.getALlCustomer();
    }

    @GetMapping("{name}")
    Customer getCustomerByName(@PathVariable("name") String name) {
        return customerService.getCustomerByName(name);
    }

    @PostMapping("/post")
    String addNewCustomer(@RequestBody Customer customer){
        customerService.addNewCustomer(customer);
        return "add thanh cong";
    }
}
