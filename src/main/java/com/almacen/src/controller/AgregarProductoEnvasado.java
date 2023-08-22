package com.almacen.src.controller;

import com.almacen.src.model.Pais;
import com.almacen.src.model.Producto;
import com.almacen.src.model.ProductoEnvasado;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.math.BigInteger;
import java.time.LocalDate;

import static com.almacen.src.controller.AlmacenInstance.INSTANCE;
public class AgregarProductoEnvasado {

    private Stage stage;
    private Scene scene;
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
    private TableView<Producto>tablaEnvasados;

    private final ObservableList<Producto>envasadoObservableList= FXCollections.observableArrayList();


    Pais tipoPais = null;
    @FXML
    public void initialize(){

        envasadoObservableList.addAll(INSTANCE.getAlmacen().obtenerListaEnvasados());
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
    void addProductoEnvasado(ActionEvent event) {

        int codigo= Integer.parseInt(txtCodigo.getText());
        Double valorUnitario= Double.valueOf(txtValorUnitario.getText());
        BigInteger existencia= BigInteger.valueOf(Integer.parseInt(txtCantidadExistente.getText()));
        Float pesoEnvasoe = Float.parseFloat(txtPesoEnvase.getText());
        ProductoEnvasado productoEnvasado= new ProductoEnvasado(codigo,txtNombre.getText(),valorUnitario,existencia,pickDateFechaEnvasao.getValue(), pesoEnvasoe,tipoPais);
        INSTANCE.getAlmacen().addProducto(productoEnvasado);
        envasadoObservableList.add(productoEnvasado);
        tablaEnvasados.setItems(envasadoObservableList);
    }

    @FXML
    void asignarArgentina(ActionEvent event) {

        tipoPais = Pais.ARGENTINA;
    }

    @FXML
    void asignarChile(ActionEvent event) {

        tipoPais = Pais.CHILE;
    }

    @FXML
    void asignarColombia(ActionEvent event) {
        tipoPais = Pais.COLOMBIA;

    }

    @FXML
    void asignarEcuador(ActionEvent event) {

        tipoPais = Pais.ECUADOR;

    }

    @FXML
    void asignarPeru(ActionEvent event) {

        tipoPais = Pais.PERU;

    }

    @FXML
    void eliminarProducto(ActionEvent event) {

    }

    @FXML
    void regresarMenuProductos(ActionEvent event) {
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

