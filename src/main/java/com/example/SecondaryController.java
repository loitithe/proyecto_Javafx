package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SecondaryController implements Initializable {

    private Cuento cuento;

    @FXML
    public VBox vBox;

    @FXML
    private ImageView img3;

    @FXML
    private Button btn_reset;

    @FXML
    private Button btn_back;

    @FXML
    private ImageView img2;

    @FXML
    private ImageView img1;

    @FXML
    private TextArea textArea;

    @FXML
    public void btn_Reset(ActionEvent event){
        Stage stage = (Stage) this.vBox.getScene().getWindow();
        Cuento cuento = (Cuento) stage.getUserData();
        System.out.println(cuento.getTitulo());

    }
    public SecondaryController(Cuento cuento) {
        this.cuento = cuento;
    }
//    @FXML
//    public AnchorPane raiz;

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    @FXML
    public void recuperarDatos() {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        recuperarDatos();
    }
}