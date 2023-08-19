module com.almacen.almacen {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.almacen.src to javafx.fxml;
    exports com.almacen.src;
    exports com.almacen.src.controller;
    opens com.almacen.src.controller to javafx.fxml;
}