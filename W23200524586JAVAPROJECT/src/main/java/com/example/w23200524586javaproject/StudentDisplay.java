package com.example.w23200524586javaproject;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class StudentDisplay implements Initializable {

   @FXML
    private Label Course;

    @FXML
    public TextField course;

    @FXML
    private Label error;

    @FXML
    private Label fullname;

    @FXML
    private ListView<String> index = new ListView<>();

    @FXML
    public TextField name;

    @FXML
    private Label oldStudentNumber;

    @FXML
    public TextField studentNumber;

    @FXML
    private ImageView students;

    @FXML
    private Label courseLabel;
    @FXML
    private Label nameLabel;
    @FXML
    private Label studentNumberLabel;
    private List<Student> studentList = new ArrayList<>();



    void displayData(String selectedName)
    {
        for(Student obj : studentList)
        {
            if(obj.getFirstName().equals(selectedName))
            {
                fullname.setText(obj.getFirstName());
                Course.setText(obj.getCourse());
                oldStudentNumber.setText(Integer.toString(obj.getStudentNumber()));
                students.setImage(obj.getImagePath());

            }
        }
    }

    @FXML
    void add(ActionEvent event){
        try{
            Student student = new Student(name.getText(),Integer.parseInt(studentNumber.getText()),course.getText());
            studentList.add(student);
        } catch (Exception e){
            error.setVisible(true);
            error.setText(e.getMessage());
            name.clear();
            studentNumber.clear();
            course.clear();
        }
        Student student = new Student(name.getText(),Integer.parseInt(studentNumber.getText()),course.getText());
         studentList.add(student);
        index.getItems().add(name.getText());
        name.clear();
        studentNumber.clear();
        course.clear();
        index.setOnMouseClicked(mouseEvent -> {
            String selectedItems = index.getSelectionModel().getSelectedItem();
            displayData(selectedItems);

        });

        fullname.setText(studentList.get(studentList.size()-1).getFirstName());
        Course.setText(studentList.get(studentList.size()-1).getCourse());
        oldStudentNumber.setText(Integer.toString(studentList.get(studentList.size()-1).getStudentNumber()));
        students.setImage(studentList.get(studentList.size()-1).getImagePath());

        error.setText("");
        error.setVisible(false);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        error.setVisible(false);
       Student student1 = new Student("Spandan",200524586,"CMPA");
       Student student2 = new Student("Kartavya",200489763,"CMPG");
       Student student3 = new Student("Kunj",200456798,"GBMS");
       Student student4 = new Student("Parth",200876549,"AVIA");
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        index.getItems().add(student1.getFirstName());
        index.getItems().add(student2.getFirstName());
        index.getItems().add(student3.getFirstName());
        index.getItems().add(student4.getFirstName());
        index.setOnMouseClicked(mouseEvent -> {
            String selectedItems = index.getSelectionModel().getSelectedItem();
            displayData(selectedItems);

        });
        fullname.setText(student1.getFirstName());
        oldStudentNumber.setText(Integer.toString(student1.getStudentNumber()));
        Course.setText((student1.getCourse()));

        students.setImage(student1.getImagePath());
    }
}

