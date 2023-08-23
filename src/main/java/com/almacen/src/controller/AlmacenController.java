package com.almacen.src.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Separator;
import javafx.stage.Stage;

import java.io.IOException;

public class AlmacenController {
    private Stage stage;
    private Scene scene;
    @FXML
    private Separator Separador;

    @FXML
    private void eventoAgregarCliente(ActionEvent event) throws IOException {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/com/almacen/src/view/seleccionarTipoCliente.fxml"));
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @FXML
    private void eventoAgregarProducto(ActionEvent event) throws IOException {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/com/almacen/src/view/seleccionarProducto.fxml"));
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @FXML
    private void eventoRegistrarVenta(ActionEvent event) throws IOException {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/com/almacen/src/view/FacturaVenta.fxml"));
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}