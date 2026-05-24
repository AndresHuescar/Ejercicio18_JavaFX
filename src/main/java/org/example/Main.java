package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        // Etiqueta principal del formulario
        Label titulo = new Label("Formulario con varios botones");

        // Creo varios botones
        Button botonGuardar = new Button("Guardar");
        Button botonModificar = new Button("Modificar");
        Button botonEliminar = new Button("Eliminar");
        Button botonSalir = new Button("Salir");

        // Doy el mismo tamaño a los botones para que se vean ordenados
        botonGuardar.setPrefWidth(150);
        botonModificar.setPrefWidth(150);
        botonEliminar.setPrefWidth(150);
        botonSalir.setPrefWidth(150);

        // Evento del botón Guardar
        botonGuardar.setOnAction(event -> {
            System.out.println("Has pulsado el botón Guardar.");
        });

        // Evento del botón Modificar
        botonModificar.setOnAction(event -> {
            System.out.println("Has pulsado el botón Modificar.");
        });

        // Evento del botón Eliminar
        botonEliminar.setOnAction(event -> {
            System.out.println("Has pulsado el botón Eliminar.");
        });

        // Evento del botón Salir
        botonSalir.setOnAction(event -> {
            System.out.println("Has pulsado el botón Salir.");
        });

        // VBox organiza todos los elementos en vertical
        VBox root = new VBox(15);
        root.getChildren().addAll(
                titulo,
                botonGuardar,
                botonModificar,
                botonEliminar,
                botonSalir
        );

        // Estilo para centrar los elementos y añadir margen interior
        root.setStyle("-fx-alignment: center; -fx-padding: 20;");

        // Creo la escena principal
        Scene scene = new Scene(root, 450, 320);

        // Configuro y muestro la ventana
        stage.setTitle("Ejercicio 18 - JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}