package com.example.timeconverter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller2 {
    @FXML
    Label wlcName;
    @FXML
    Parent root;
    Stage window;
    Scene scene;
    @FXML
    AnchorPane aPane;
    @FXML
    public void setWlcName(String txt) {
        wlcName.setText(txt);
    }
    @FXML
    public void clickONContBtn(ActionEvent e) throws IOException {
        window=(Stage)((Node)e.getSource()).getScene().getWindow();
        FXMLLoader root = new FXMLLoader(getClass().getResource("View3.fxml"));
        scene= new Scene(root.load());
        window.setScene(scene);
        window.show();
    }
    public void clickONExitP2(ActionEvent e){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirm Exit");
        alert.setHeaderText("You are about to exit!!");
        alert.setContentText("You sure you want to Exit!");
        if(alert.showAndWait().get()== ButtonType.OK){
            window=(Stage) aPane.getScene().getWindow();
            window.close();
        }
    }

}
