module com.example.w23200524586javaproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.w23200524586javaproject to javafx.fxml;
    exports com.example.w23200524586javaproject;
}