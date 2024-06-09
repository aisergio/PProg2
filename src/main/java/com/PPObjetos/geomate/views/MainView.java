package com.PPObjetos.geomate.views;

import com.PPObjetos.geomate.controllers.MainController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainView {
    private Stage primaryStage;

    public MainView(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void mostrar() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MainView.fxml"));
            Parent root = loader.load();

            // Obtener el controlador y establecer el stage
            MainController controller = loader.getController();
            controller.setStage(primaryStage);

            Scene scene = new Scene(root, 400, 300);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Inicio");
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
