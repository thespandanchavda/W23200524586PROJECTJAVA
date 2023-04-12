package com.example.w23200524586javaproject;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class StudentTest {
    private Student student;

    @Before
    public void setUp() throws Exception {
       student = new Student("Spandan",200524586,"CMPA");
    }

    @org.junit.Test
    public void invalidStudentNumber() {
        Assertions.assertThrows(IllegalArgumentException.class,()->{
            student.setStudentNumber(20000000);
        });
    }


    @Test
    public void setStudentNumber() {
        student.setStudentNumber(200524586);
        assertEquals(200524586,student.getStudentNumber());
    }
    @org.junit.Test
    public void setCourse() {
        student.setFirstName("CMPA");
        assertEquals("CMPA",student.getCourse());
    }

    @org.junit.Test
    public void invalidFirstName() {
        Assertions.assertThrows(IllegalArgumentException.class,()->{
            student.setCourse("CMPAG");
        });
    }

}