package com.almacen.src.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SeleccionarTipoClienteController {
    private Stage stage;
    private Scene scene;

    @FXML
    public void agregarNatural(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/almacen/src/view/agregarCliente.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void agregarJuridico(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/almacen/src/view/agregarClienteJuridico.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
