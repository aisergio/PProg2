package com.PPObjetos.geomate;

import com.PPObjetos.geomate.views.MainView;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Cargar y mostrar la vista principal
        MainView mainView = new MainView(primaryStage);
        mainView.mostrar(); // Mostrar la escena principal
    }

    public static void main(String[] args) {
        launch(args); // Método estático para iniciar la aplicación JavaFX
    }
}
