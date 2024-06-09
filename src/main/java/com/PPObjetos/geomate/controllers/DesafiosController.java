package com.PPObjetos.geomate.controllers;

//import com.PPObjetos.geomate.views.AritmeticaView;
//import com.PPObjetos.geomate.views.EstadisticaView;
import com.PPObjetos.geomate.views.GeometriaView;
//import com.PPObjetos.geomate.views.LogicaView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class DesafiosController {
    private Stage primaryStage;

    public void setPrimaryStage(Stage stage) {
        this.primaryStage = stage;
    }

    @FXML
    private Button botonRegresarInicio;

    @FXML
    private void regresarInicio() {
        // Aquí debes implementar la lógica para regresar a la escena principal (MainView)
        // Puedes usar el método cargarEscena() o implementar tu propia lógica de navegación
        cargarEscena("/fxml/MainView.fxml");  // Ejemplo de cómo cargar la escena principal
    }

    @FXML
    private void handleGeometria(ActionEvent event) {
        try {
            GeometriaView geometriaView = new GeometriaView();
            geometriaView.mostrar(primaryStage);
        } catch (IOException e) {
            e.printStackTrace();
            // Manejar la excepción de manera adecuada (mostrar un mensaje de error, etc.)
        }
    }




/*
    @FXML
    private void handleAritmetica() {
        try {
            AritmeticaView aritmeticaView = new AritmeticaView();
            aritmeticaView.mostrar(primaryStage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleLogica() {
        try {
            LogicaView logicaView = new LogicaView();
            logicaView.mostrar(primaryStage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleEstadistica() {
        try {
            EstadisticaView estadisticaView = new EstadisticaView();
            estadisticaView.mostrar(primaryStage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
*/








    private void cargarEscena(String rutaFXML) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(rutaFXML));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
