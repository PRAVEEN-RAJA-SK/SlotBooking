package com.praveen.codes.SlotBooking.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MasterStudent {
    @Id
    private String rollNo;
    private String name;
    private String email;

    public MasterStudent() {
        // Default constructor
    }

    // Getters and Setters

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
