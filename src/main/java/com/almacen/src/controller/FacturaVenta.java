package com.almacen.src.controller;

import com.almacen.src.model.Producto;
import com.almacen.src.model.Venta;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import static com.almacen.src.controller.AlmacenInstance.INSTANCE;

public class FacturaVenta {

    public TableColumn<Venta, String> colCodigo;
    public TableColumn<Venta, String> colFecha;
    public TableColumn<Venta, String> colIdCliente;
    public TableColumn<Venta, String> colCantidad;
    public TableColumn<Venta, String> colProducto;
    public TableColumn<Venta, String> colSubtotal;
    private Stage stage;
    private Scene scene;


    @FXML
    private TextField txtCantidadProducto;

    @FXML
    private TextField txtCodigoproducto;

    @FXML
    private TextField txtIdentificacionCliente;

    @FXML
    private AnchorPane fechaCompra;

    @FXML
    private TextField txtivaProducto;

    @FXML
    private TableView<Venta>tablaVentas;

    private final ObservableList<Venta>ventaObservableList = FXCollections.observableArrayList();
    private final ObservableList<Producto>productosObservableList = FXCollections.observableArrayList();
    @FXML
    public void initialize(){
        ventaObservableList.addAll(INSTANCE.getAlmacen().getVentas());
        productosObservableList.addAll(INSTANCE.getAlmacen().getProductos());
        tablaVentas.setItems(ventaObservableList);
        colCantidad.setCellValueFactory(new PropertyValueFactory<Venta, String>("cantidad"));
        colCodigo.setCellValueFactory(new PropertyValueFactory<Venta, String>("codigo"));
        colFecha.setCellValueFactory(new PropertyValueFactory<Venta, String>("fecha"));
        colSubtotal.setCellValueFactory(new PropertyValueFactory<Venta, String>("subtotal"));
        colProducto.setCellValueFactory(new PropertyValueFactory<Venta, String>("producto"));
        colIdCliente.setCellValueFactory(new PropertyValueFactory<Venta, String>("idCliente"));


    }
    @FXML
    void EventoAgregarVenta(ActionEvent event){
        System.out.println(productosObservableList);
        productosObservableList.forEach(e-> System.out.println(e.getValorUnitario() * Integer.parseInt(txtCantidadProducto.getText())));
        System.out.println("entra");
    }

    @FXML
    void EventoRegresarPrincipal(ActionEvent event) {
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
}
