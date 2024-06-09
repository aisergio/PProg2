package com.PPObjetos.geomate.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

public class GeometriaController1 {

    @FXML
    private VBox preguntasContainer; // Contenedor para las preguntas

    // Clase interna para representar una pregunta con sus opciones
    private static class Pregunta {
        public String textoPregunta;
        public List<String> opciones;

        // Constructor vacío necesario para la deserialización de JSON
        public Pregunta() {
        }
    }

    // Mapa para almacenar las preguntas por tema, cargadas desde el archivo JSON
    private Map<String, List<Pregunta>> preguntasPorTema;

    @FXML
    public void initialize() {
        // Cargar preguntas desde el archivo JSON en la inicialización
        cargarPreguntasDesdeArchivo();
    }

    // Método para cargar las preguntas desde un archivo JSON
    private void cargarPreguntasDesdeArchivo() {
        ObjectMapper objectMapper = new ObjectMapper();
        try (InputStream inputStream = getClass().getResourceAsStream("/preguntas.json")) {
            if (inputStream != null) {
                // Leer y deserializar el archivo JSON en un Map
                preguntasPorTema = objectMapper.readValue(inputStream, objectMapper.getTypeFactory().constructMapType(Map.class, String.class, objectMapper.getTypeFactory().constructCollectionType(List.class, Pregunta.class)));
            } else {
                System.err.println("No se pudo encontrar el archivo de preguntas.");
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error al leer el archivo de preguntas: " + e.getMessage());
        }
    }

    // Método para cargar las preguntas basadas en el handle
    public void cargarPreguntas(String handle) {
        // Limpiar cualquier contenido previo
        preguntasContainer.getChildren().clear();

        // Obtener las preguntas del tema correspondiente
        List<Pregunta> preguntas = preguntasPorTema.get(handle);

        if (preguntas != null) {
            for (Pregunta pregunta : preguntas) {
                // Crear y agregar la etiqueta de la pregunta
                Label labelPregunta = new Label(pregunta.textoPregunta);
                preguntasContainer.getChildren().add(labelPregunta);

                // Crear un ToggleGroup para las opciones de la pregunta
                ToggleGroup grupo = new ToggleGroup();

                // Crear y agregar las opciones (RadioButton)
                for (String opcion : pregunta.opciones) {
                    RadioButton radioButton = new RadioButton(opcion);
                    radioButton.setToggleGroup(grupo);
                    preguntasContainer.getChildren().add(radioButton);
                }
            }
        }
    }

    // Método para calcular el puntaje (por ahora, puede estar vacío o mostrar un mensaje)
    @FXML
    private void calcularPuntaje() {
        // Aquí se puede agregar la lógica para calcular el puntaje
        System.out.println("Calculando puntaje...");
    }
}
