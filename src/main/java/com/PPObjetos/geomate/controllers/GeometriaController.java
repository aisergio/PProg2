package com.PPObjetos.geomate.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class GeometriaController {

    @FXML
    private ToggleGroup grupoPregunta1;
    @FXML
    private ToggleGroup grupoPregunta2;
    @FXML
    private ToggleGroup grupoPregunta3;

    @FXML
    private void calcularPuntaje() {
        int puntaje = 0;

        // Verificar respuestas (simplificado)
        if (respuestaCorrecta(grupoPregunta1, "b")) puntaje++;
        if (respuestaCorrecta(grupoPregunta2, "c")) puntaje++;
        if (respuestaCorrecta(grupoPregunta3, "c")) puntaje++;

        System.out.println("\nTu puntaje final es: " + puntaje);
        // Aquí puedes mostrar el puntaje en una ventana emergente o actualizar un elemento de la interfaz
    }

    // Método auxiliar para verificar respuestas
    private boolean respuestaCorrecta(ToggleGroup grupo, String letraCorrecta) {
        RadioButton seleccion = (RadioButton) grupo.getSelectedToggle();
        return seleccion != null && seleccion.getText().startsWith(letraCorrecta);
    }

// ... en GeometriaController.java

    public void setGrupoPregunta1(ToggleGroup grupoPregunta1) {
        this.grupoPregunta1 = grupoPregunta1;
    }

    public void setGrupoPregunta2(ToggleGroup grupoPregunta2) {
        this.grupoPregunta2 = grupoPregunta2;
    }

    public void setGrupoPregunta3(ToggleGroup grupoPregunta3) {
        this.grupoPregunta3 = grupoPregunta3;
    }

}
