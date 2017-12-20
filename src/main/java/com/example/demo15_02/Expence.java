package com.example.demo15_02;


import org.springframework.beans.factory.annotation.Autowired;

public class Expence {


    String name;
    Double price;
    Category category;


    public Expence(String name, Double prize, Category category) {
        this.name = name;
        this.price = prize;
        this.category = category;

    }

    public Expence() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return name + ", " + price + ", " + category;
    }
}
