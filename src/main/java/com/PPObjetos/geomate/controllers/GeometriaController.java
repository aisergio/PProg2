package com.PPObjetos.geomate.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeometriaController {

    @FXML
    private VBox preguntasContainer;

    // Método para cargar preguntas basado en el handle proporcionado
    public void cargarPreguntas(String handle) {
        preguntasContainer.getChildren().clear(); // Limpiar el contenedor antes de cargar nuevas preguntas
        String filePath = "resources/preguntas.csv"; // Ruta del archivo CSV de preguntas

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                if (fields[0].equals(handle)) {
                    agregarPregunta(fields[1], fields[2], fields[3], fields[4], fields[5]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para agregar una pregunta al contenedor dinámicamente
    private void agregarPregunta(String pregunta, String respuesta1, String respuesta2, String respuesta3, String respuesta4) {
        Label preguntaLabel = new Label(pregunta);
        ToggleGroup grupo = new ToggleGroup();

        RadioButton opcion1 = new RadioButton(respuesta1);
        opcion1.setToggleGroup(grupo);
        RadioButton opcion2 = new RadioButton(respuesta2);
        opcion2.setToggleGroup(grupo);
        RadioButton opcion3 = new RadioButton(respuesta3);
        opcion3.setToggleGroup(grupo);
        RadioButton opcion4 = new RadioButton(respuesta4);
        opcion4.setToggleGroup(grupo);

        preguntasContainer.getChildren().addAll(preguntaLabel, opcion1, opcion2, opcion3, opcion4);
    }

    @FXML
    private void calcularPuntaje() {
        // Lógica para calcular el puntaje, basada en las respuestas seleccionadas
        // Implementa la lógica según sea necesario
    }
}
