package com.markgravestock.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class CustomerController {
    private CustomerRepository customerRepository;

    @Autowired
    CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;

        customerRepository.save(new Customer("Jack", "Bauer"));
        customerRepository.save(new Customer("Chloe", "O'Brian"));
        customerRepository.save(new Customer("Kim", "Bauer"));
        customerRepository.save(new Customer("David", "Palmer"));
        customerRepository.save(new Customer("Michelle", "Dessler"));
    }

    @RequestMapping("/customer")
    Iterable<Customer> customers() {
        return customerRepository.findAll();
    }
}
