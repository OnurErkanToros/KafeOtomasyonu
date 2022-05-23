package com.onurerkan.controller;

import com.onurerkan.models.Kategori;
import com.onurerkan.models.Urun;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class UrunDetayController {
    private Urun urun;
    public void setUrun(Urun urun){
        this.urun=urun;
        detayUrunAdi.setText(urun.getUrunAdi());
        detayBirimFiyat.setText(String.valueOf(urun.getBirimFiyat()));
        detayStok.setText(String.valueOf(urun.getStok()));
        detayKategoriler.getItems().addAll(urun.getKategori(),"Soğuklar","Frappeler");
    }
    @FXML
    private TextField detayBirimFiyat;

    @FXML
    private ChoiceBox<String> detayKategoriler;

    @FXML
    private TextField detayStok;

    @FXML
    private TextField detayUrunAdi;

    @FXML
    void urunDegisiklikleriKaydet(ActionEvent event) {

    }

    @FXML
    void urunDetayKapat(ActionEvent event) {
        Stage stage = (Stage) detayUrunAdi.getScene().getWindow();
        stage.close();
    }

    @FXML
    void urunSil(ActionEvent event) {

    }
}
