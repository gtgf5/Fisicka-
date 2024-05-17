package org.openjfx;

import java.io.IOException;
import javafx.fxml.FXML;
import java.net.URL;
import java.util.ResourceBundle;

public class PrimaryController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;


    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    @FXML
    private void switchToFirst() throws IOException {
        App.setRoot("First");
    }
    @FXML
    private void switchToSecond() throws IOException {
        App.setRoot("Second");
    }
    @FXML
    private void switchToFerd() throws IOException {
        App.setRoot("Ferd");
    }
    @FXML
    private void switchToF() throws IOException {
        App.setRoot("Avtory");
    }
    @FXML
    private void ToExit(){
        System.exit(0);
    }
}
