package com.PPObjetos.geomate.views;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class PreguntasView {

    // Método para mostrar las preguntas según la categoría seleccionada
    public void mostrar(Stage stage, String categoria) {
        try {
            // Carga el archivo FXML para la vista de preguntas
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Pregunta.fxml"));
            Parent root = loader.load();

            // Obtiene el controlador asociado y le pasa la categoría
            PreguntasController controller = loader.getController();
            controller.cargarPreguntas(categoria);

            // Configura la escena y la muestra en el escenario proporcionado
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Preguntas de " + categoria);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
