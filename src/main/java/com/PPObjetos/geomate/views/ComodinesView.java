package com.PPObjetos.geomate.views;

import com.PPObjetos.geomate.controllers.ComodinesController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ComodinesView {
    private final Stage primaryStage;

    public ComodinesView(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void mostrar() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/ComodinesView.fxml"));
            Parent root = loader.load();

            ComodinesController controller = loader.getController();
            controller.setStage(primaryStage); // Método para pasar el primaryStage al controlador

            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Comodines");
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
