package com.PPObjetos.geomate.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class DesafiosController {

    @FXML
    private Button geometriaButton; // Botón para cargar preguntas de geometría
    @FXML
    private Button trigonometriaButton; // Botón para cargar preguntas de trigonometría
    @FXML
    private Button algebraButton; // Botón para cargar preguntas de álgebra

    // Método para manejar el evento del botón de Geometría
    @FXML
    private void handleGeometria() {
        cargarVista("GeometriaView.fxml", "geometria");
    }

    // Método para manejar el evento del botón de Trigonometría
    @FXML
    private void handleTrigonometria() {
        cargarVista("GeometriaView.fxml", "trigonometria");
    }

    // Método para manejar el evento del botón de Álgebra
    @FXML
    private void handleAlgebra() {
        cargarVista("GeometriaView.fxml", "algebra");
    }

    // Método genérico para cargar la vista y configurar el controlador con el handle adecuado
    private void cargarVista(String fxmlPath, String handle) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/" + fxmlPath));
            Parent root = loader.load();

            // Obtener el controlador asociado al FXML cargado
            GeometriaController controller = loader.getController();

            // Llamar al método cargarPreguntas con el handle correspondiente
            controller.cargarPreguntas(handle);

            // Crear y mostrar la nueva escena
            Stage stage = new Stage();
            stage.setTitle("Preguntas de " + handle);
            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
