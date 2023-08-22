package com.almacen.src.controller;

import com.almacen.src.model.ProductoRefrigerado;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.math.BigInteger;

import static com.almacen.src.controller.AlmacenInstance.INSTANCE;

public class AgregarProductoRefrigerados {

    @FXML
    private Button EliminarProductoRefrigerado;

    @FXML
    private Button agregarProductoRefrigerado;

    @FXML
    private TableColumn<ProductoRefrigerado, BigInteger> colCantidadExistente;

    @FXML
    private TableColumn<ProductoRefrigerado, Integer> colCodigo;

    @FXML
    private TableColumn<ProductoRefrigerado, String> colCodigoAprovacion;

    @FXML
    private TableColumn<?, ?> colDescripcion;

    @FXML
    private TableColumn<ProductoRefrigerado, String> colNombre;

    @FXML
    private TableColumn<ProductoRefrigerado, Short> colTemperatura;

    @FXML
    private TableColumn<ProductoRefrigerado, BigInteger> colValorUnitario;

    @FXML
    private TableView<?> tablaProductoRefrigerado;

    @FXML
    private TextField txtCantidadExistente;

    @FXML
    private TextField txtCod;

    @FXML
    private TextField txtCodigoAprobacion;

    @FXML
    private TextField txtDescripcion;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtTemperatura;

    @FXML
    private TextField txtValorUnitario;

    private final ObservableList<ProductoRefrigerado>observableListRefrigerado= FXCollections.observableArrayList();


    @FXML
    public void initialize(){
        observableListRefrigerado .addAll((ProductoRefrigerado) INSTANCE.getAlmacen().obtenerListaRefrigerados());
        colCantidadExistente.setCellValueFactory(new PropertyValueFactory<ProductoRefrigerado, BigInteger>("existencia"));
        colNombre.setCellValueFactory(new PropertyValueFactory<ProductoRefrigerado,String>("nombre"));
        colCodigo.setCellValueFactory(new PropertyValueFactory<ProductoRefrigerado,Integer>("codigo"));
        colValorUnitario.setCellValueFactory(new PropertyValueFactory<ProductoRefrigerado,BigInteger>("valorUnitario"));
        colCodigoAprovacion.setCellValueFactory(new PropertyValueFactory<ProductoRefrigerado,String>("codigoAlimentos"));
        colTemperatura.setCellValueFactory(new PropertyValueFactory<ProductoRefrigerado, Short>("temperaturaRecomendadaRefrigeracion"));
        tablaProductoRefrigerado.refresh();
    }

    @FXML
    void EventoAgregarProductoRefrigerado(MouseEvent event) {
        String nombre= txtNombre.getText();
        int codigo= Integer.parseInt(txtCod.getText());
        BigInteger cantidadExistente= BigInteger.valueOf(Long.parseLong(txtCantidadExistente.getText()));
        Double valorUnitario= Double.valueOf(txtValorUnitario.getText());
        Short temperatura= Short.valueOf(txtTemperatura.getText());
        ProductoRefrigerado productoRefrigerado= new ProductoRefrigerado(codigo,nombre,valorUnitario,cantidadExistente,txtCodigoAprobacion.getText(),temperatura);



    }

    @FXML
    void EventoEliminarProductoRefrigerado(MouseEvent event) {

    }

    @FXML
    void returnMenu(ActionEvent event) {

    }

}