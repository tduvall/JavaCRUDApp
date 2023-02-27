package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String grade;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String postal;

    protected Customer() { }
    
    public Customer(String firstName, String lastName, String grade, String address1, String address2, String city, String state, String postal) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.postal = postal;
    }

    @Override
    public String toString() {
        return String.format(
            "Customer[id=%d, firstName='%s', lastName='%s']",
            id, firstName, lastName);
    }

    // Get methods
    public Long getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getGrade() {
        return this.grade;
    }
    public String getAddress1() {
        return this.address1;
    }
    public String getAddress2() {
        return this.address2;
    }
    public String getCity() {
        return this.city;
    }
    public String getState() {
        return this.state;
    }
    public String getPostal() {
        return this.postal;
    }
    
    // Set methods
    public void setId(Long id) {
        this.id = id;
    }
    public void setFirstName(String fname) {
        this.firstName = fname;
    }
    public void setLastName(String lname) {
        this.lastName = lname;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    public void setAddress1(String address) {
        this.address1 = address;
    }
    public void setAddress2(String address) {
        this.address2 = address;
    }
    // public void setCity() {
    //     return this.city;
    // }
    // public void setState() {
    //     return this.state;
    // }
    // public void setPostal() {
    //     return this.postal;
    // }
}
