package com.almacen.src.controller;

import com.almacen.src.model.Persona;
import com.almacen.src.model.PersonaJuridica;
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
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import static com.almacen.src.controller.AlmacenInstance.INSTANCE;

public class AgregarClienteJuridico {
    private Stage stage;
    private Scene scene;

    @FXML
    private Button EliminarCliente;

    @FXML
    private Button agregarCliente;

    @FXML
    private TableColumn<PersonaJuridica, String> colApellido;

    @FXML
    private TableColumn<PersonaJuridica, String> colIdentificacion;

    @FXML
    private TableColumn<PersonaJuridica, String> colNit;
    @FXML
    private TableColumn<PersonaJuridica, String> colDireccion;

    @FXML
    private TableColumn<PersonaJuridica, String> colNombre;

    @FXML
    private TableColumn<PersonaJuridica, String> colTelefono;

    @FXML
    private Button regresarPrincipal;

    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtCedula;

    @FXML
    private TextField txtDireccion;

    @FXML
    private TextField txtNit;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtTelefono;

    @FXML
    private TableView<Persona>tablaPersonas;

    private final ObservableList<Persona>personasObservableList= FXCollections.observableArrayList();

    public AgregarClienteJuridico() {
    }

    @FXML
    public void initialize(){
        personasObservableList.addAll(INSTANCE.getAlmacen().obtenerJuridica());
        tablaPersonas.setItems(personasObservableList);
        colNombre.setCellValueFactory(new PropertyValueFactory<PersonaJuridica,String>("nombre"));
        colApellido.setCellValueFactory(new PropertyValueFactory<PersonaJuridica,String>("apellido"));
        colTelefono.setCellValueFactory(new PropertyValueFactory<PersonaJuridica,String>("telefono"));
        colNit.setCellValueFactory(new PropertyValueFactory<PersonaJuridica,String>("nit"));
        colDireccion.setCellValueFactory(new PropertyValueFactory<PersonaJuridica, String>("direccion"));
        colIdentificacion.setCellValueFactory(new PropertyValueFactory<PersonaJuridica,String>("documento"));


    }


    @FXML
    void EventoAgregarCliente(ActionEvent event) {


        PersonaJuridica cliente = new PersonaJuridica(
                txtNombre.getText(),
                txtApellido.getText(),
                txtCedula.getText(),
                txtDireccion.getText(),
                txtTelefono.getText(),
                txtNit.getText());
        INSTANCE.getAlmacen().addCliente(cliente);
        personasObservableList.add(cliente);
        tablaPersonas.setItems(personasObservableList);
    }

    @FXML
    void EventoEliminarCliente(MouseEvent event) {

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
