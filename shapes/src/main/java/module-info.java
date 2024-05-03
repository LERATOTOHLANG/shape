module com.example.shapes {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.shapes to javafx.fxml;
    exports com.example.shapes;
}