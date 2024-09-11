module com.example.grup {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.grup to javafx.fxml;
    exports com.example.grup;
}