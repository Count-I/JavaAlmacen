package com.almacen.src.controller;

import com.almacen.src.model.Persona;
import com.almacen.src.model.PersonaJuridica;
import com.almacen.src.model.ProductoEnvasado;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import static com.almacen.src.controller.AlmacenInstance.INSTANCE;

public class AgregarCliente {
    private Stage stage;
    private Scene scene;

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
    private TableView<Persona> tabla1;

    private final ObservableList<Persona>personas= FXCollections.observableArrayList();

    @FXML
    public void initialize(){
        personas.addAll(INSTANCE.getAlmacen().obtenerJuridica());
        tabla1.setItems(personas);
        colNobre.setCellValueFactory(new PropertyValueFactory<PersonaJuridica,String>("nombre"));
        colApellido.setCellValueFactory(new PropertyValueFactory<PersonaJuridica,String>("apellido"));
        colTelefono.setCellValueFactory(new PropertyValueFactory<PersonaJuridica,String>("telefono"));
        colNit.setCellValueFactory(new PropertyValueFactory<PersonaJuridica,String>("nit"));
        colDirecion.setCellValueFactory(new PropertyValueFactory<PersonaJuridica,String>("direccion"));
        colIdentificacion.setCellValueFactory(new PropertyValueFactory<PersonaJuridica,String>("documento"));


    }


    @FXML
    void EventoAgregarCliente(MouseEvent event) {

        //int codigo = txt

        //ProductoEnvasado productoEnvasado= new ProductoEnvasado()

        //INSTANCE.getAlmacen().getProductos().add();

    }

    @FXML
    void EventoEliminarCliente(MouseEvent event) {

    }

    @FXML
    void EventoRegresarPrincipal(ActionEvent event) {
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

}
