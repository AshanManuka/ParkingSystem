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
import model.parkingTBL;
import util.pageLoader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ResourceBundle;



public class TableFormController implements Initializable,pageLoader {

    public AnchorPane context;
    public TableColumn pVehicleNumber;
    public TableColumn pVehicleType;
    public TableColumn pSlot;
    public TableColumn pTime;
    public TableView tblParking;

    static ArrayList<parkingTBL> prl =new ArrayList<parkingTBL>();
    static ObservableList<parkingTM> obList=FXCollections.observableArrayList();



    public static void loader() {
        //set itr for ensure
       // Iterator itr = prl.iterator();
       // while (itr.hasNext()) {
         //   parkingTBL p = (parkingTBL) itr.next();
           // System.out.println(p.vNumber + " " + p.vType + " " + p.pSlot + " " + p.pTime);

            for (parkingTBL pr :prl
                 ) {
                parkingTM tm=new parkingTM(pr.getvNumber(),pr.getvType(),pr.getpSlot(),pr.getpTime());
                obList.add(tm);
            }


        //}
    }

    public void onDiliveryTable(ActionEvent actionEvent) throws IOException {
        loadUI("table2Form");
    }

    public void addVehiclebtn(ActionEvent actionEvent) throws IOException {
        loadUI("addVehicleForm");
    }

    public void addDriverbtn(ActionEvent actionEvent) throws IOException {
        loadUI("addDriverForm");
    }

    public void logOutbtn(ActionEvent actionEvent) throws IOException {
       loadUI("interfaceForm");
    }

    @Override
    public void loadUI(String location) throws IOException {
        context.getChildren().clear();
        Parent parent = FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"));
        context.getChildren().add(parent);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        pVehicleNumber.setCellValueFactory(new PropertyValueFactory("num"));
        pVehicleType.setCellValueFactory(new PropertyValueFactory("tp"));
        pSlot.setCellValueFactory(new PropertyValueFactory("st"));
        pTime.setCellValueFactory(new PropertyValueFactory("tm"));
        tblParking.setItems(obList);
      //  loader();
    }
}
