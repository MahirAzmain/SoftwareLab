module com.example.lab4tasksoftwarelab {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab4tasksoftwarelab to javafx.fxml;
    exports com.example.lab4tasksoftwarelab;
}