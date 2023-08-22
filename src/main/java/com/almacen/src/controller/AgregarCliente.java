package com.almacen.src.controller;

import com.almacen.src.model.PersonaJuridica;
import com.almacen.src.model.ProductoEnvasado;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import static com.almacen.src.controller.AlmacenInstance.INSTANCE;

public class AgregarCliente {

    @FXML
    private Button EliminarCliente;

    @FXML
    private Button agregarCliente;

    @FXML
    private TableColumn<PersonaJuridica, String> colApellido;

    @FXML
    private TableColumn<PersonaJuridica, String> colDirecion;



    @FXML
    private TableColumn<PersonaJuridica, String> colIdentificacion;

    @FXML
    private TableColumn<PersonaJuridica, String> colNit;

    @FXML
    private TableColumn<PersonaJuridica, String> colNobre;

    @FXML
    private TableColumn<PersonaJuridica, String> colTelefono;

    @FXML
    private Button regresarPrincipal;

    @FXML
    private TableView<PersonaJuridica> tabla1;

    private final ObservableList<PersonaJuridica>personas= FXCollections.observableArrayList();

    @FXML
    public void initialize(){
        personas.addAll((PersonaJuridica) INSTANCE.getAlmacen().obtenerJuridica());
        tabla1.setItems(personas);
        colNobre.setCellValueFactory(new PropertyValueFactory<PersonaJuridica,String>("nombre"));
        colApellido.setCellValueFactory(new PropertyValueFactory<PersonaJuridica,String>("apellido"));
        colTelefono.setCellValueFactory(new PropertyValueFactory<PersonaJuridica,String>("telefono"));
        colNit.setCellValueFactory(new PropertyValueFactory<PersonaJuridica,String>("nit"));
        colDirecion.setCellValueFactory(new PropertyValueFactory<PersonaJuridica,String>("direccion"));
        colIdentificacion.setCellValueFactory(new PropertyValueFactory<PersonaJuridica,String>("identificacion"));


    }


    @FXML
    void EventoAgregarCliente(MouseEvent event) {

       // int codigo =

       // ProductoEnvasado productoEnvasado= new ProductoEnvasado()

        //INSTANCE.getAlmacen().getProductos().add();

    }

    @FXML
    void EventoEliminarCliente(MouseEvent event) {

    }

    @FXML
    void EventoRegresarPrincipal(MouseEvent event) {

    }

}
