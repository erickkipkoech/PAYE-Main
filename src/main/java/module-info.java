module com.example.paye {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.paye to javafx.fxml;
    exports com.example.paye;
}