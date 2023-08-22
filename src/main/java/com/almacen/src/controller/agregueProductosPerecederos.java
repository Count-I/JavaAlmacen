package com.almacen.src.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class agregueProductosPerecederos {
    private Stage stage;
    private Scene scene;

    public Button EliminarProductoPerecedero;

    public void EventoAgregarProductoPerecedero(MouseEvent actionEvent) {
    }

    public void EventoEliminarProductoPerecedero(MouseEvent mouseEvent) {
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
