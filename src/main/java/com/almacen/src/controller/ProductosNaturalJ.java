package com.almacen.src.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

public class ProductosNaturalJ {

    @FXML
    private TableView<?> tabla1;

    @FXML
    private Button x;

    @FXML
    void aceptar (ActionEvent event){
        System.exit(0);
    }

    public void EventoAgregarCliente(ActionEvent actionEvent) {
    }

    public void EventoEliminarCliente(ActionEvent actionEvent) {
    }

    public void EventoRegresarPrincipal(ActionEvent actionEvent) {
    }
}
