package com.example;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class PrimaryController implements Initializable {
    @FXML
    private Button btn_terror;

    @FXML
    private Button btn_romantica;

    @FXML
    private Button primaryButton;

    @FXML
    private Button btn_infantil;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void button_infantil(ActionEvent event) {

    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        initComponents();
        initImages();

    }

    private void initComponents() {

    }

    private void initImages() {
        Image img_infantil_portada, img_romantico_portada, img_terror_portada;

        img_infantil_portada = new Image(
                "https://static.guiainfantil.com/media/40053/c/caperucita-roja-hermosa-version-corta-para-bebes-del-cuento-infantil-lg.jpg",
                300, 300, false, false);

        ImageView view = new ImageView();
        view.setImage(img_infantil_portada);

        // view.setFitHeight(btn_infantil.getHeight());
        // view.setFitWidth(btn_infantil.getWidth());
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
}
