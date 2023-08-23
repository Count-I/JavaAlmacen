package com.almacen.src;

import javafx.application.Application;
        import javafx.fxml.FXMLLoader;
        import javafx.scene.Parent;
        import javafx.scene.Scene;
        import javafx.stage.Stage;

        import java.io.IOException;
        import java.util.Date;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        try {
            Parent root = FXMLLoader.load(Main.class.getResource("view/Almacen.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("Almacen");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        }catch (Exception e){
            e.printStackTrace();
            throw new IOException(e);
        }
    }

    public static void main(String[] args) {
        launch();
    }
}