package com.example.timeconverter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage window) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("view1.fxml"));
        Scene firstView =new Scene(root);
        window.setTitle("Time Converter!");
        window.setScene(firstView);
        window.show();
    }

    public static void main(String[] args) {
        launch();
    }
}