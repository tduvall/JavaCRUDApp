package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

	List <Customer> findAll();

	List <Customer> findByLastName(String lastName);

	Customer findByIdAndLastName(Long id, String lastName);

	Customer findById(long id);
}
