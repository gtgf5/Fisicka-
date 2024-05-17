package org.openjfx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    @FXML
    void initialize() {

    }

    @FXML
    private void switchToBack() throws IOException {
        App.setRoot("primary");
    }

    @FXML
    private void switchToNext() throws IOException {
        App.setRoot("teory");
    }

}
