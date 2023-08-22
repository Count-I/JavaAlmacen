package com.almacen.src.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AgregarProductoRefrigerados {
    private Stage stage;
    private Scene scene;
    public void EventoAgregarProductoRefrigerado(ActionEvent actionEvent) {
    }

    public void EventoEliminarProductoRefrigerado(ActionEvent actionEvent) {
    }

    public void regresarMenuProductos(ActionEvent event) {
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
}
