package com.onurerkan.controller;

import com.onurerkan.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class GirisController {
    @FXML
    private TextField textFieldKullaniciAdi;

    @FXML
    private PasswordField textFieldSifre;

    @FXML
    void girisYap(ActionEvent event) throws IOException {
        if(textFieldKullaniciAdi.getText().equals("onurerkan") &&
        textFieldSifre.getText().equals("onurerkan")){
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("fxml/anasayfa.fxml"));
            Stage stage = (Stage) textFieldSifre.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setTitle("Anasayfa");
            stage.setScene(scene);
            stage.show();
        }
    }

    @FXML
    void sifremiUnuttum(ActionEvent event) {

    }
}
