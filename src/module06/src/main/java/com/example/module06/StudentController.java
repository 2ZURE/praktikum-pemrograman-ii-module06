package com.example.module06;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class StudentController {
    @FXML
    private TableView<Student> studentTable;

    @FXML
    private TableColumn<Student, String> studentIdCol;

    @FXML
    private TableColumn<Student, String> nameCol;

    @FXML
    public void initialize() {
        studentIdCol.setCellValueFactory(new PropertyValueFactory<>("studentId"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));

        ObservableList<Student> studentList = FXCollections.observableArrayList(
                new Student(1, "Putri", "2510817220012"),
                new Student(2, "Agung", "2510817120011"),
                new Student(3, "Mila", "2510817220014"),
                new Student(4, "Lala", "2510817220033"),
                new Student(5, "Caca", "2510817220027"),
                new Student(6, "Alin", "2510817220090"),
                new Student(7, "Alifa", "2510817120012"),
                new Student(8, "Lisya", "2510817320012"),
                new Student(9, "Rie", "2510817220017"),
                new Student(10, "Jesica", "2510817220030")
        );

        studentTable.setItems(studentList);
    }
}
