package com.PPObjetos.geomate.views;

import com.PPObjetos.geomate.controllers.GeometriaController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

import java.io.IOException;

public class GeometriaView {

    public void mostrar(Stage primaryStage) throws IOException {
        // Toma el Stage principal como argumento para no crear uno nuevo
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/GeometriaView.fxml"));
        Parent root = loader.load();

        GeometriaController controller = loader.getController();

        // Inyectar ToggleGroups
        controller.setGrupoPregunta1((ToggleGroup) loader.getNamespace().get("grupoPregunta1"));
        controller.setGrupoPregunta2((ToggleGroup) loader.getNamespace().get("grupoPregunta2"));
        controller.setGrupoPregunta3((ToggleGroup) loader.getNamespace().get("grupoPregunta3"));

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);  // Usar el Stage principal
        primaryStage.setTitle("Geometría");
        primaryStage.show();
    }
}
