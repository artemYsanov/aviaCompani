module com.example.aviacompany1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires mysql.connector.j;
    requires java.sql;


    opens com.example.aviacompany1 to javafx.fxml;
    exports com.example.aviacompany1;
}