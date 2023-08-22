package com.almacen.src.controller;

import com.almacen.src.model.Pais;
import com.almacen.src.model.ProductoEnvasado;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.math.BigInteger;
import java.time.LocalDate;

import static com.almacen.src.controller.AlmacenInstance.
public class AgregarProductoEnvasado {

    @FXML
    private MenuButton MenuButtonPaisOrigen;

    @FXML
    private TableColumn<ProductoEnvasado, BigInteger> colCantidadExistentes;

    @FXML
    private TableColumn<ProductoEnvasado, Integer> colCodigo;

    @FXML
    private TableColumn<?, ?> colDescripcion;

    @FXML
    private TableColumn<ProductoEnvasado, LocalDate> colFechaEnvasado;

    @FXML
    private TableColumn<ProductoEnvasado, String> colNombre;

    @FXML
    private TableColumn<ProductoEnvasado, Pais> colPaisOrigen;

    @FXML
    private TableColumn<ProductoEnvasado, Float> colPesoEnvasado;

    @FXML
    private TableColumn<ProductoEnvasado, Double> colValorUnitario;

    @FXML
    private DatePicker pickDateFechaEnvasao;

    @FXML
    private TextField txtCantidadExistente;

    @FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtDescripcion;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtPesoEnvase;

    @FXML
    private TextField txtValorUnitario;

    @FXML
    private TableView<ProductoEnvasado>tablaEnvasados;

    private final ObservableList<ProductoEnvasado>envasadoObservableList= FXCollections.observableArrayList();


    @FXML
    public void initialize(){

        envasadoObservableList.addAll((ProductoEnvasado) INSTANCE.getAlmacen().obtenerListaEnvasados());
        tablaEnvasados.setItems(envasadoObservableList);
        colCodigo.setCellValueFactory(new PropertyValueFactory<ProductoEnvasado, Integer>("codigo"));
        colNombre.setCellValueFactory(new PropertyValueFactory<ProductoEnvasado,String>("nombre"));
        colCantidadExistentes.setCellValueFactory(new PropertyValueFactory<ProductoEnvasado,BigInteger>("existencia"));
        colValorUnitario.setCellValueFactory(new PropertyValueFactory<ProductoEnvasado,Double>("valorUnitario"));
        colFechaEnvasado.setCellValueFactory(new PropertyValueFactory<ProductoEnvasado, LocalDate>("fechaEnvasado"));
        colPesoEnvasado.setCellValueFactory(new PropertyValueFactory<ProductoEnvasado,Float>("pesoEnvase"));
        colPaisOrigen.setCellValueFactory(new PropertyValueFactory<ProductoEnvasado, Pais>("paisOrigen"));
    }

    @FXML
    void EventoAgregarProductoPerecedero(MouseEvent event) {

    }

    @FXML
    void EventoEliminarProductoPerecedero(MouseEvent event) {

    }

    @FXML
    void addProductoEnvasado(ActionEvent event) {

    }

    @FXML
    void asignarArgentina(ActionEvent event) {

    }

    @FXML
    void asignarChile(ActionEvent event) {

    }

    @FXML
    void asignarColombia(ActionEvent event) {

    }

    @FXML
    void asignarEcuador(ActionEvent event) {

    }

    @FXML
    void asignarPeru(ActionEvent event) {

    }

    @FXML
    void eliminarProducto(ActionEvent event) {

    }

    @FXML
    void regresarMenuProductos(ActionEvent event) {

    }

}

