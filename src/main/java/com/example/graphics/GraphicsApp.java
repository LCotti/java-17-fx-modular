package com.example.graphics;

import com.example.calculator.Calculator;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class GraphicsApp extends Application {

    Calculator calc = new Calculator();

    @Override
    public void start(Stage primaryStage) throws IOException {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("graphics.fxml"));
            Scene scene = new Scene(loader.load(),600,400);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Graphics App");
            primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
