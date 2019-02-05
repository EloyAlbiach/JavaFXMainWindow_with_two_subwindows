package sample.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class Controller {

    @FXML
    private Button btnview1;

    @FXML
    private Button btnview2;

    @FXML
    private AnchorPane basePane;

    @FXML
    void showView1(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/sample/views/view1.fxml"));
        basePane.getChildren().setAll(pane);
        //basePane.getChildren().clear();
        //basePane.getChildren().add(pane);
    }

    @FXML
    void showView2(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/sample/views/view2.fxml"));
        basePane.getChildren().setAll(pane);
        //basePane.getChildren().clear();
        //basePane.getChildren().add(pane);
    }

}