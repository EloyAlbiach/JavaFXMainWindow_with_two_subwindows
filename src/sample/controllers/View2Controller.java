package sample.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class View2Controller {

    @FXML
    private Button btn2;

    @FXML
    void showMessage(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Alert in Window 2");
        alert.setHeaderText(null);
        alert.setContentText("This is a message in Window 2.");
        alert.showAndWait();
    }

}
