package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.Driver;

import java.io.IOException;

public class AddDriverFormController{
    public AnchorPane context;
    public TextField newDName;
    public TextField newDNIC;
    public TextField newDrivingLicenNo;
    public TextArea newDAddress;
    public TextField newDContact;



    public void addNewDriver(ActionEvent actionEvent) throws IOException {
        String dName=newDName.getText();
        String dNic=newDNIC.getText();
        String dLNum=newDrivingLicenNo.getText();
        String dAddress=newDAddress.getText();
        String dContact= newDContact.getText();

        Driver d=new Driver(dName,dNic,dLNum,dAddress,dContact);
        InterfaceFormController.drivers[16]=dName;
        Alert alert=new Alert(Alert.AlertType.CONFIRMATION,"Successfully", ButtonType.OK);
        alert.showAndWait();

        context.getChildren().clear();
        Parent parent = FXMLLoader.load(getClass().getResource("../view/tableForm.fxml"));
        context.getChildren().add(parent);
    }


}
