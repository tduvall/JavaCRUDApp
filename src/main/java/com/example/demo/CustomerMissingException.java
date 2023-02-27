package com.example.demo;

public class CustomerMissingException extends RuntimeException {
    CustomerMissingException() {
        super("Could not find that customer!");
    }
}
