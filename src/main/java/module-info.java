module com.example.timeconverter {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.timeconverter to javafx.fxml;
    exports com.example.timeconverter;
}