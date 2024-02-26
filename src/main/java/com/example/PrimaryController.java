package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class PrimaryController implements Initializable {

    @FXML
    private VBox vbox;

    @FXML
    private HBox hbox;
    @FXML
    private Button btn_terror;

    @FXML
    private Button btn_romantica;

    @FXML
    private Button primaryButton;

    @FXML
    private Button btn_infantil;

    @FXML
    private Label lbl_descripcion;

    private Cuento cuento;

    @FXML
    private void switchToSecondary() throws IOException {
        initCuento();
       // App.setRoot("secondary");

    }

    @FXML
    private void button_infantil(ActionEvent event) {
        cuento.setTipo(Cuento.Tipo.INFANTIL);
        System.out.println("Infantil");

    }

    @FXML
    private void button_romantica(ActionEvent event) {
        cuento.setTipo(Cuento.Tipo.ROMANTICA);
        System.out.println("Romantica");

    }

    @FXML
    private void button_terror(ActionEvent event) {
        cuento.setTipo(Cuento.Tipo.TERROR);
        System.out.println("Terror");

    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        initComponents();
        initImages();
    }

    private void initComponents() {
        cuento = new Cuento("");

    }

    private void initImages() {
        Image img_infantil_portada, img_romantico_portada, img_terror_portada;

        img_infantil_portada = new Image(
                "https://static.guiainfantil.com/media/40053/c/caperucita-roja-hermosa-version-corta-para-bebes-del-cuento-infantil-lg.jpg",
                300, 300, false, false);

        ImageView view = new ImageView();
        view.setImage(img_infantil_portada);

        view.setPreserveRatio(true);

        btn_infantil.setGraphic(view);
        btn_infantil.setContentDisplay(ContentDisplay.BOTTOM);

        img_romantico_portada = new Image(
                "https://m.media-amazon.com/images/I/91MYuXCDBtL._AC_UF1000,1000_QL80_.jpg",
                300, 300, false, false);
        view = new ImageView();
        view.setImage(img_romantico_portada);
        view.setPreserveRatio(true);
        btn_romantica.setGraphic(view);
        btn_romantica.setContentDisplay(ContentDisplay.BOTTOM);

        img_terror_portada = new Image(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSTttPT5sf3F72qCuRvWbP3PPRf7GyyMWnWZONo4AdqAA&s",
                300, 300, false, false);
        view = new ImageView();
        view.setImage(img_terror_portada);
        view.setPreserveRatio(true);
        btn_terror.setGraphic(view);
        btn_terror.setContentDisplay(ContentDisplay.BOTTOM);

    }

    private void initCuento() {
        if (cuento.getTipo().equals(Cuento.Tipo.ROMANTICA)) {
            cuento.setDescripcion("romantica");
        }
        if (cuento.getTipo().equals(Cuento.Tipo.TERROR)) {
            cuento.setDescripcion("terror");
        }
        if (cuento.getTipo().equals(Cuento.Tipo.INFANTIL)) {
            cuento.setDescripcion("infantil");
        }
        lbl_descripcion.setText(cuento.getDescripcion());
        try {
            // Cargo la vista
            FXMLLoader loader = new FXMLLoader(PrimaryController.class.getResource("a.fxml"));

            // Cargo la ventana
            Parent root = loader.load();
            Stage stage = new Stage();
            // Estamos pasando el cuento a la instancia del stage
            stage.setUserData(cuento);
            // Creo el Scene
            Scene scene = new Scene(root);
            System.out.println("La nueva escena" + scene.toString());
            stage.setTitle("Datos cuento");
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
        } catch (IOException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText(e.getMessage());
            System.out.println(e.getMessage().toString());
            alert.showAndWait();
        }
    }
}
