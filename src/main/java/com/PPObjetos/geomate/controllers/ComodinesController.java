package com.PPObjetos.geomate.controllers;

import com.PPObjetos.geomate.views.MainView;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ComodinesController {
    private Stage primaryStage;

    @FXML
    private Button botonRegresarInicio;

    public void setStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    @FXML
    private void regresarInicio() {
        MainView mainView = new MainView(primaryStage);
        mainView.mostrar();
    }
}
