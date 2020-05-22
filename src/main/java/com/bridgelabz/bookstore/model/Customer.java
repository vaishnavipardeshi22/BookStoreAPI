package com.bridgelabz.bookstore.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    private int customerId;
    private String customerName;
    private double phoneNumber;
    private int pinCode;
    private String locality;
    private String address;
    private String city;
    private String landmark;
    private String type;
    private int orderQuantity;

    public Customer() {
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public int getPinCode() {
        return pinCode;
    }

    public String getLocality() {
        return locality;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }
}
