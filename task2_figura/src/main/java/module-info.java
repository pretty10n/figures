module org.example.task2_figura {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.task2_figura to javafx.fxml;
    exports org.example.task2_figura;
}