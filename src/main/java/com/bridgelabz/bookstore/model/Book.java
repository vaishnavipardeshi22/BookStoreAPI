package com.bridgelabz.bookstore.model;

import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.Table;


@Entity
public class Book {

    @Id
    private int id;
    private String author;
    private String title;
    private String image;
    private int quantity;
    private double price;
    private String description;
//
//    public Book() {
//    }
//
//    public Book(int id, String author, String title, String image, double price, String description) {
//        this.id = id;
//        this.author = author;
//        this.title = title;
//        this.image = image;
//        this.price = price;
//        this.description = description;
//    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
