package com.PPObjetos.geomate.views;

import com.PPObjetos.geomate.controllers.DesafiosController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DesafiosView {
    private final Stage primaryStage;

    public DesafiosView(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void mostrar() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/DesafiosView.fxml"));
            Parent root = loader.load();

            DesafiosController controller = loader.getController();
            controller.setStage(primaryStage); // Método para pasar el primaryStage al controlador

            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Desafíos");
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
