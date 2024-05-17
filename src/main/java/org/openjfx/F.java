package org.openjfx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;

public class F {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private void switchToBack() throws IOException {
        App.setRoot("primary");
    }
}
