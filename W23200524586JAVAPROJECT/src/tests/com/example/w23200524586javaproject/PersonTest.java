package com.example.w23200524586javaproject;

import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class PersonTest {
    private Person person;

    @org.junit.Before
    public void setUp() throws Exception {
        person=new Person("Spandan");
    }

    @org.junit.Test
    public void setFirstName() {
        person.setFirstName("Spandan");
        assertEquals("Spandan",person.getFirstName());
    }

    @org.junit.Test
    public void invalidFirstName() {
        Assertions.assertThrows(IllegalArgumentException.class,()->{
            person.setFirstName(" ");
        });
    }
}