package com.example.timeconverter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    Parent root;
    Scene scene;
    Stage window;
    @FXML
    TextField uName,fName,lName,cName;
    @FXML
    String username,firstName,lastName,country;
    @FXML
    public void clickONButton(ActionEvent ev) throws IOException {
        username=uName.getText();
        firstName=fName.getText();
        lastName=lName.getText();
        country=cName.getText();
        window = (Stage)((Node)ev.getSource()).getScene().getWindow();
        FXMLLoader loadd = new FXMLLoader(getClass().getResource("View2.fxml"));
        root=loadd.load();
        Controller2 control = loadd.getController();
        control.setWlcName("Welcome "+username+"!");
        scene = new Scene(root);
        window.setScene(scene);
        window.show();

    }


}