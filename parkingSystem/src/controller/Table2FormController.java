package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import model.diliverTBL;
import util.pageLoader;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Table2FormController implements Initializable,pageLoader {

    public AnchorPane context;
    public TableColumn rVehicleNumber;
    public TableColumn rVehicleType;
    public TableColumn driverName;
    public TableColumn leftTime;
    public TableView tblDilivery;

    public static String dName;
    public static String vNumber;
    public static String vType;
    public static String dTime;


    static ArrayList<diliverTBL> drl =new ArrayList<diliverTBL>();
    static ObservableList<diliverTM> oList= FXCollections.observableArrayList();

    public static void load() {
        String[] arl={vNumber,vType,dName,dTime};
        diliverTM pm=new diliverTM(arl[0],arl[1],arl[2],arl[3]);
        oList.add(pm);

    }


    public void inDiliveryTable(ActionEvent actionEvent) throws IOException {
    loadUI("tableForm");
    }

    public void addVehiclebtn(ActionEvent actionEvent) throws IOException {
    loadUI("addVehicleForm");
    }

    public void addDriverbtn(ActionEvent actionEvent) throws IOException {
     loadUI("addDriverForm");
    }

    @Override
    public void loadUI(String location) throws IOException {
        context.getChildren().clear();
        Parent parent = FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"));
        context.getChildren().add(parent);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {



        rVehicleNumber.setCellValueFactory(new PropertyValueFactory("vn"));
        rVehicleType.setCellValueFactory(new PropertyValueFactory("vt"));
        driverName.setCellValueFactory(new PropertyValueFactory("dn"));
        leftTime.setCellValueFactory(new PropertyValueFactory("dt"));
        tblDilivery.setItems(oList);






    }
}
