package com.example.w23200524586javaproject;

import javafx.scene.image.Image;

   public class Student extends Person{

    private int studentNumber;
    private String course;
   // private String imagePath;

       public Student(String firstName, int studentNumber, String course) {
           super(firstName);
           setStudentNumber(studentNumber);
           setCourse(course);
       }


    public int getStudentNumber() {

        return studentNumber;
    }

    public String getCourse() {

        return course;
    }

    public void setCourse(String course) {
           if(course.matches("[A-Z]{4}")){
                this.course = course;
           } else {
               throw new IllegalArgumentException("PLEASE ENTER COURSE CODE (e.g CMPA,CMPG etc..)");
           }
    }

    public void setStudentNumber(int studentNumber) {
           if(studentNumber > 100000000 && studentNumber < 999999999) {
               this.studentNumber = studentNumber;
           }
           else {
               throw new IllegalArgumentException("YOUR STUDENT NUMBER MUST BE OF 9 DIGITS AND DON'T START WITH 0");
           }
    }
       public Image getImagePath() {
           String filename = "Images/"+getFirstName()+".jpeg";
           if(getFirstName().equals("Kartavya")||getFirstName().equals("Kunj")||getFirstName().equals("Parth")||getFirstName().equals("Spandan")){
               return new Image(Student.class.getResourceAsStream(filename));
           }
           else
           {
               String temp = "Images/img"+".jpeg";
               return new Image(Student.class.getResourceAsStream(temp));
           }
       }
}
