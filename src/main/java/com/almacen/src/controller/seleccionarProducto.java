package com.almacen.src.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class seleccionarProducto {
    private Stage stage;
    private Scene scene;
    public SplitPane ContenedroInterfaz;
    public Label tituloInterfaz;
    public Button productosPerecederos;
    public Button productosRefrigerados;
    public Button productosEnvasados;
    public Button menuPrincipal;

        @FXML
        private void EventoRegresarMenuPrincipal(ActionEvent event) throws IOException {
            try{
                Parent root = FXMLLoader.load(getClass().getResource("/com/almacen/src/view/Almacen.fxml"));
                stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    public void EventoProductosEnvasados(ActionEvent event) {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/com/almacen/src/view/agregarProductoEnvasado.fxml"));
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
        }

    public void EventoProductosRefigerados(ActionEvent event) {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/com/almacen/src/view/agregarProductoRefrigerados.fxml"));
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
        }

    public void EventoProductosPerecederos(ActionEvent event) {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/com/almacen/src/view/agregarProductoPerecedero.fxml"));
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
        }
}
