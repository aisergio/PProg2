package com.PPObjetos.geomate.views;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GeometriaView {

    public void mostrar(Stage stage) {
        try {
            // Carga el archivo FXML para la vista de geometría
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/GeometriaView.fxml"));
            Parent root = loader.load();

            // Opcional: Aquí puedes obtener el controlador si necesitas realizar alguna operación con él
            // GeometriaController controller = loader.getController();

            // Configura la escena y la muestra en el escenario proporcionado
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Vista de Geometría");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
