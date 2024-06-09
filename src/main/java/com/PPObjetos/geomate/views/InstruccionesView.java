package com.PPObjetos.geomate.views;

import com.PPObjetos.geomate.controllers.InstruccionesController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class InstruccionesView {
    private final Stage primaryStage;

    public InstruccionesView(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void mostrar() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/InstruccionesView.fxml"));
            Parent root = loader.load();

            InstruccionesController controller = loader.getController();
            controller.setStage(primaryStage); // Método para pasar el primaryStage al controlador

            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Instrucciones");
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
