package com.onurerkan.controller;

import com.onurerkan.Main;
import com.onurerkan.manager.UrunManager;
import com.onurerkan.models.Urun;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Callback;

import java.net.URL;
import java.util.ResourceBundle;

public class UrunlerController implements Initializable {
    @FXML
    private TableView tableViewUrunler;

    private TableColumn idCol;
    private TableColumn urunAdiCol;
    private TableColumn birimFiyatCol;
    private TableColumn stokCol;
    private TableColumn kategoriCol;
    private TableColumn aksiyonCol;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        idCol = new TableColumn("Ürün ID");
        urunAdiCol = new TableColumn("Ürün Adı");
        birimFiyatCol = new TableColumn("Birim Fiyat");
        stokCol = new TableColumn("Stok");
        kategoriCol = new TableColumn("Kategori");
        aksiyonCol = new TableColumn("Aksiyonlar");

        tableViewUrunler.getColumns().addAll(idCol, urunAdiCol, birimFiyatCol, stokCol, kategoriCol, aksiyonCol);
        loadData();
    }

    @FXML
    void urunEkle(ActionEvent event) {

    }

    private void loadData() {
        UrunManager urunManager = new UrunManager();
        ObservableList<Urun> data = FXCollections.observableArrayList(urunManager.getUrunler());

        idCol.setCellValueFactory(new PropertyValueFactory<Urun, Integer>("id"));
        urunAdiCol.setCellValueFactory(new PropertyValueFactory<Urun, String>("urunAdi"));
        birimFiyatCol.setCellValueFactory(new PropertyValueFactory<Urun, Double>("birimFiyat"));
        stokCol.setCellValueFactory(new PropertyValueFactory<Urun, Integer>("stok"));
        kategoriCol.setCellValueFactory(new PropertyValueFactory<Urun, String>("kategori"));
        Callback<TableColumn<Urun, String>, TableCell<Urun, String>> cellFactory = (TableColumn<Urun, String> param) -> {
            final TableCell<Urun, String> cell = new TableCell<>() {
                @Override
                protected void updateItem(String s, boolean b) {
                    super.updateItem(s, b);
                    if (b) {
                        setGraphic(null);
                        setText(null);
                    } else {
                        Button detaylar = new Button("Detaylar");

                        detaylar.setStyle("-fx-background-color: yellow;");


                        detaylar.setOnAction((ActionEvent event) -> {
                            try {
                                Urun urun = (Urun) tableViewUrunler.getSelectionModel().getSelectedItem();
                                FXMLLoader loader = new FXMLLoader(Main.class.getResource("resources/fxml/urunDetay.fxml"));
                                Stage stage = new Stage(StageStyle.UNDECORATED);
                                Scene scene = new Scene(loader.load());
                                UrunDetayController detayController = loader.getController();
                                detayController.setUrun(urun);
                                stage.setTitle("Ürün detay");
                                stage.setScene(scene);
                                stage.show();
                                loadData();

                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        });

                        HBox hbox = new HBox(detaylar);
                        hbox.setStyle("-fx-alignment:center;");
                        setGraphic(hbox);
                        setText(null);
                    }
                }
            };
            return cell;
        };
        aksiyonCol.setCellFactory(cellFactory);
        tableViewUrunler.setItems(data);

    }

}
