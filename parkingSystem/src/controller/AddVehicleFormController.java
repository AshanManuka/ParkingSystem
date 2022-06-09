package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.Vehicle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AddVehicleFormController implements Initializable {
    public AnchorPane context;
    public TextField newvNumber;
    public TextField newVWeight;
    public TextField newNoPassenger;
    public ComboBox newVType;

    public void addNewVehicle(ActionEvent actionEvent) throws IOException {
        InterfaceFormController.vehicle[14]=newvNumber.getText();
        newVType.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            String nType = newValue.toString();

            String nNum = newvNumber.getText();
            String nWeight = newVWeight.getText();
            String nPassenger = newNoPassenger.getText();

            Vehicle vn = new Vehicle(nNum, nType, nWeight, nPassenger);
        });
        Alert alert=new Alert(Alert.AlertType.CONFIRMATION,"Successfully", ButtonType.OK);
        alert.showAndWait();

        context.getChildren().clear();
        Parent parent = FXMLLoader.load(getClass().getResource("../view/tableForm.fxml"));
        context.getChildren().add(parent);

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        String[] arr={"Bus","Van","Cargo Lorry"};
        newVType.setPromptText("Select Type");
        newVType.getItems().addAll(arr);
    }
}
