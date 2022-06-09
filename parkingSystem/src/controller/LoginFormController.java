package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import util.pageLoader;

import java.io.IOException;

public class LoginFormController implements pageLoader {
    public AnchorPane context;
    public TextField userName;
    public PasswordField password;

    String Name="user123";
    String Word="user123";

    public void loginbtn(ActionEvent actionEvent) throws IOException {
    String uName=userName.getText();
    String pWord=password.getText();
    if(uName.equals(Name) && pWord.equals(Word)){
        loadUI("tableForm");
    }else{
        Alert alert=new Alert(Alert.AlertType.WARNING,"Incorrect Username or Password", ButtonType.OK);
        alert.showAndWait();
    }
    }

    public void cancelbtn(ActionEvent actionEvent) throws IOException {
       loadUI("interfaceForm");
    }

    @Override
    public void loadUI(String location) throws IOException {
        context.getChildren().clear();
        Parent parent = FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"));
        context.getChildren().add(parent);
    }
}
