package com.almacen.src.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

import java.io.IOException;

public class SeleccionarTipoCliente {

    @FXML
    private TableView<?> tabla1;

    @FXML
    private Button x;

    @FXML
    void aceptar (ActionEvent event){
        System.exit(0);
    }

    public SeleccionarTipoCliente(){
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("view/seleccionarTipoCLiente.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try{
            fxmlLoader.load();
        }catch (IOException exception){
            throw new RuntimeException(exception);
        }
    }


    public void EventoAgregarCliente(ActionEvent actionEvent) {
    }

    public void EventoEliminarCliente(ActionEvent actionEvent) {
    }

    public void EventoRegresarPrincipal(ActionEvent actionEvent) {
    }
}
