package sample.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class View1Controller {

    @FXML
    private Button btn1;

    @FXML
    void showMessage(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Alert in Window 1");
        alert.setHeaderText(null);
        alert.setContentText("This is a message in Window 1.");
        alert.showAndWait();
    }

}