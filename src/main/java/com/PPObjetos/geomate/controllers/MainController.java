package com.PPObjetos.geomate.controllers;

import com.PPObjetos.geomate.views.DesafiosView;
import com.PPObjetos.geomate.views.InstruccionesView;
import com.PPObjetos.geomate.views.ComodinesView;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.SplitMenuButton;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
    private Stage primaryStage;

    @FXML
    private Button botonDesafios;
    @FXML
    private SplitMenuButton botonPerfil;

    public void setStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    @FXML
    private void initialize() {
        // Inicializar la animación del botón "INICIAR DESAFÍO"
        animarBotonDesafio();
    }

    @FXML
    private void irAPaginaDesafios() {
        try {
            DesafiosView desafiosView = new DesafiosView(primaryStage);
            desafiosView.mostrar();
        } catch (IOException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("No se pudo cargar la página de desafíos.");
            alert.showAndWait();
        }
    }

    @FXML
    private void irAPaginaInstrucciones() {
        InstruccionesView instruccionesView = new InstruccionesView(primaryStage);
        instruccionesView.mostrar();
    }

    @FXML
    private void irAPaginaComodines() {
        ComodinesView comodinesView = new ComodinesView(primaryStage);
        comodinesView.mostrar();
    }

    private void animarBotonDesafio() {
        javafx.animation.Timeline timeline = new javafx.animation.Timeline(
                new javafx.animation.KeyFrame(javafx.util.Duration.seconds(0.5), e -> botonDesafios.setTextFill(javafx.scene.paint.Color.GREEN)),
                new javafx.animation.KeyFrame(javafx.util.Duration.seconds(1), e -> botonDesafios.setTextFill(javafx.scene.paint.Color.WHITE))
        );
        timeline.setCycleCount(javafx.animation.Timeline.INDEFINITE);
        timeline.play();
    }
}
