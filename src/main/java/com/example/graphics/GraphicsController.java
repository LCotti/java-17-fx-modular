package com.example.graphics;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GraphicsController {

    @javafx.fxml.FXML
    private Label area;

    @javafx.fxml.FXML
    private Label circumference;

    @javafx.fxml.FXML
    private TextField widthText;

    @javafx.fxml.FXML
    private TextField heightText;

    private double height;
    private double width;


    @javafx.fxml.FXML
    public void compute(ActionEvent actionEvent) {
        getValues();
        Rectangular r = new Rectangular(height,width);
        double c = r.computeCircumference();
        double a = r.computeArea();
        area.setText(String.valueOf(a));
        circumference.setText(String.valueOf(c));
    }

    private void getValues(){
        height = Double.parseDouble(heightText.getText());
        width = Double.parseDouble(widthText.getText());
    }
}
