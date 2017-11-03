package com.example.demo.domain;



import javax.persistence.*;

public class Student {
    private Long id ;
    private String firstName;
    private String lastName;
    private String regNumber;

    public Student() {
    }

    public Student( String firstName, String lastName, String regNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.regNumber = regNumber;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }
}
