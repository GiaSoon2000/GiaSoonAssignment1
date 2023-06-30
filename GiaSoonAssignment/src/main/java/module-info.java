module com.example.giasoonassignment {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.giasoonassignment to javafx.fxml;
    exports com.example.giasoonassignment;
}