package com.example.w23200524586javaproject;

import javafx.scene.image.Image;

public class Person {
    private String firstName;


    public Person(String firstName) {
        setFirstName(firstName);

    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        if(firstName.isBlank()){
            throw new IllegalArgumentException("Invalid");
        } else {
            this.firstName = firstName;
        }
    }

}
