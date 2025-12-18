package com.sendit.learningmodularjavafx.internal;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


public final class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
