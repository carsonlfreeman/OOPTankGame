module com.example.tankgame {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.tankgame to javafx.fxml;
    exports com.example.tankgame;
}