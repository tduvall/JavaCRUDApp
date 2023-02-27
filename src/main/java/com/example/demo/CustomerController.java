package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class CustomerController {
    private final CustomerRepository repository;

    CustomerController(CustomerRepository repository) {
        this.repository = repository;
    }
    
    @GetMapping("/customers")
    List<Customer> all() {
        return repository.findAll();
    }
    
    @PostMapping("/customers")
    Customer newCustomer(@RequestBody Customer newCustomer) {
      return repository.save(newCustomer);
    }

    @GetMapping("/confirmCustomer")
    Customer one(@RequestParam("id") long id) {
    
    return repository.findById(id);
    }

    @GetMapping("/customer")
    Customer one(@RequestParam("id") Long id, @RequestParam("lastName") String lastName) {
      
      return repository.findByIdAndLastName(id, lastName);
    }
}