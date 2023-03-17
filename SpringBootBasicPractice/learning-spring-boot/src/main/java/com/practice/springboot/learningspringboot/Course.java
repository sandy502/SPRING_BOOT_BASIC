package com.practice.springboot.learningspringboot;

public class Course {
    private long id;
    private String name;
    private int price;

    //Constructor
    //Getters
    //toString

    // Now we have toString method
    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


    // Now we have getters for each one
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }


    // and we have got our constructor
    public Course(long id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
