package com.almacen.src.controller;

import com.almacen.src.model.Persona;
import com.almacen.src.model.PersonaJuridica;
import com.almacen.src.model.PersonaNatural;
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

import java.time.LocalDate;

import static com.almacen.src.controller.AlmacenInstance.INSTANCE;

public class AgregarClienteNatural {
    private Stage stage;
    private Scene scene;

    @FXML
    private Button EliminarCliente;

    @FXML
    private Button agregarCliente;

    @FXML
    private TableColumn<PersonaNatural, String> colApellido;

    @FXML
    private TableColumn<PersonaNatural, String> colIdentificacion;

    @FXML
    private TableColumn<PersonaNatural, String> colEmail;
    @FXML
    private TableColumn<PersonaNatural, LocalDate> colFechaNacimiento;
    @FXML
    private TableColumn<PersonaNatural, String> colDireccion;

    @FXML
    private TableColumn<PersonaNatural, String> colNombre;

    @FXML
    private TableColumn<PersonaNatural, String> colTelefono;

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
    private TextField txtEmail;
    @FXML
    private DatePicker fechaNacimiento;

    @FXML
    private TableView<Persona>tablaPersonas;

    private final ObservableList<Persona>personasObservableList= FXCollections.observableArrayList();

    public AgregarClienteNatural() {
    }

    @FXML
    public void initialize(){
        personasObservableList.addAll(INSTANCE.getAlmacen().obtenerNatural());
        tablaPersonas.setItems(personasObservableList);
        colNombre.setCellValueFactory(new PropertyValueFactory<PersonaNatural,String>("nombre"));
        colApellido.setCellValueFactory(new PropertyValueFactory<PersonaNatural,String>("apellido"));
        colTelefono.setCellValueFactory(new PropertyValueFactory<PersonaNatural,String>("telefono"));
        colDireccion.setCellValueFactory(new PropertyValueFactory<PersonaNatural, String>("direccion"));
        colIdentificacion.setCellValueFactory(new PropertyValueFactory<PersonaNatural,String>("documento"));
        colEmail.setCellValueFactory(new PropertyValueFactory<PersonaNatural, String>("email"));
        colFechaNacimiento.setCellValueFactory(new PropertyValueFactory<PersonaNatural, LocalDate>("fechaNacimiento"));
    }


    @FXML
    void EventoAgregarCliente(ActionEvent event) {


        PersonaNatural cliente = new PersonaNatural(
                txtNombre.getText(),
                txtApellido.getText(),
                txtCedula.getText(),
                txtDireccion.getText(),
                txtTelefono.getText(),
                txtEmail.getText(),
                fechaNacimiento.getValue());
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
