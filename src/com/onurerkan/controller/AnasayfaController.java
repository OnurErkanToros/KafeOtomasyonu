package com.onurerkan.controller;

import com.onurerkan.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class AnasayfaController {
    @FXML
    private BorderPane anaBorderPane;

    @FXML
    void anasayfa(ActionEvent event) throws IOException {
        Parent parent = getLoader(0).load();
        anaBorderPane.setCenter(parent);
    }

    @FXML
    void ayarlar(ActionEvent event) throws IOException {
        Parent parent = getLoader(4).load();
        anaBorderPane.setCenter(parent);
    }

    @FXML
    void kullanici(ActionEvent event) throws IOException {
        Parent parent = getLoader(3).load();
        anaBorderPane.setCenter(parent);
    }

    @FXML
    void masalar(ActionEvent event) throws IOException {
        Parent parent = getLoader(1).load();
        anaBorderPane.setCenter(parent);
    }

    @FXML
    void urunler(ActionEvent event) throws IOException {
        Parent parent = getLoader(2).load();
        anaBorderPane.setCenter(parent);
    }
    private FXMLLoader getLoader(int secim){
        switch (secim){
            case 1 ->{
                return new FXMLLoader(Main.class.getResource("resources/fxml/masalar.fxml"));
            }
            case 2 ->{
                return new FXMLLoader(Main.class.getResource("resources/fxml/urunler.fxml"));
            }
            case 3 ->{
                return new FXMLLoader(Main.class.getResource("resources/fxml/kullanici.fxml"));
            }
            case 4 ->{
                return new FXMLLoader(Main.class.getResource("resources/fxml/ayarlar.fxml"));
            }
            default -> {
                return new FXMLLoader(Main.class.getResource("resources/fxml/istatistikler.fxml"));
            }
        }
    }
}
