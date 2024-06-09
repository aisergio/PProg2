package com.PPObjetos.geomate.views;

import com.PPObjetos.geomate.controllers.DesafiosController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException; // Importar IOException para manejar excepciones

public class DesafiosView {
    private final Stage primaryStage; // Stage principal de la aplicación

    public DesafiosView(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void mostrar() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/DesafiosView.fxml"));
        Parent root = loader.load();

        DesafiosController controller = loader.getController();
        controller.setPrimaryStage(primaryStage); // Llama al método correcto setPrimaryStage

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Desafíos");
        primaryStage.show();
    }
}
