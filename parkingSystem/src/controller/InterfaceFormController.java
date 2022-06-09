package controller;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;
import model.parkingTBL;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import java.io.IOException;

public class InterfaceFormController {
    public AnchorPane context;
    public ComboBox vNumberBox;
    public ComboBox dNameBox;
    public Label parkingSlot;
    public Label dtlbl;
    public Label dtlbl2;
    public Label vTypelbl;
    public Button parkbtn;
    public Button diliverbtn;

    static String s1 = "0"; static String s2 = "0"; static String s3 = "0"; static String s4 = "0"; static String s5 = "0"; static String s6 = "0";
    static String s7 = "0"; static String s8 = "0"; static String s9 = "0"; static String s10 = "0"; static String s11 = "0"; static String s12 = "0"; static String s13 = "0";

    static String[] vehicle = {"NA-3434", "KA-4563", "58-3567", "GF-4358", "CCB-3568", "LM-6679", "QA-3369", "KB-3668", "JJ-9878", "GH-5772", "XY-4456", "YQ-3536", "CBB-3566", "QH-3444"," "};
    static String[] drivers = {"Sumith Kumara", "Amila Pathirana", "Jithmal Perera", "Sumith Dissanayaka", "Suamanasiri Herath", "Awantha Fernando", "Charith Sudara", "Prashan Dineth",
            "Chethiya Dilan", "Dushantha Perera", "Sumith Udayanga", "Dinesh Udara", "Udana Chathuranga", "Mohommad Riaz", "Sandun Kuamara", "Priyanga Perera"," "};


    public void initialize() {
        RunningTime();
        showDate();
        vehicleComboBox();
        driversComboBox();
    }

    private void RunningTime() {
        final Thread thread = new Thread(() -> {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("h:mm aa ");
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                final String times = simpleDateFormat.format(new Date());
                Platform.runLater(() -> {
                    dtlbl2.setText(times);
                });
            }
        });
        thread.start();
    }

    private void showDate() {

        Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            dtlbl.setText(LocalDateTime.now().format(formatter));
        }), new KeyFrame(Duration.seconds(1)));
        clock.setCycleCount(Animation.INDEFINITE);
        clock.play();
    }


    public void vehicleComboBox() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date date = new Date();
        String time= String.valueOf(date);

        vNumberBox.setPromptText("Select Vehicle Number");
        vNumberBox.getItems().addAll(vehicle);

        vNumberBox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {

            if (newValue == vehicle[0]) {
                vTypelbl.setText("Bus");
                parkingSlot.setText("14");
                String selected = newValue.toString();
                String vehi="Bus";
                String slt="14";
                parkingTBL p=new parkingTBL(selected,vehi,slt,time);
                TableFormController.prl.add(p);
                Table2FormController.vNumber=selected;
                Table2FormController.vType="Bus";
                Table2FormController.dTime=time;

            } else {
                if (newValue == vehicle[1] || newValue == vehicle[2] || newValue == vehicle[3] || newValue == vehicle[4] || newValue == vehicle[5] || newValue == vehicle[6]) {
                    vTypelbl.setText("Van");
                    String selected = newValue.toString();
                    String vehi="Van";
                    if (s1.equals("0")) {
                        String slt="01";
                        parkingSlot.setText(slt);
                        s1 = slt;
                        parkingTBL p=new parkingTBL(selected,vehi,slt,time);
                        TableFormController.prl.add(p);
                        Table2FormController.vNumber=selected;
                        Table2FormController.vType="Van";
                        Table2FormController.dTime=time;

                    } else if (s2.equals("0")) {
                        String slt="02";
                        parkingSlot.setText(slt);
                        s2 = slt;
                        parkingTBL p=new parkingTBL(selected,vehi,slt,time);
                        TableFormController.prl.add(p);
                        Table2FormController.vNumber=selected;
                        Table2FormController.vType="Van";
                        Table2FormController.dTime=time;

                    } else if (s3.equals("0")) {
                        String slt="03";
                        parkingSlot.setText(slt);
                        s3 = slt;
                        parkingTBL p=new parkingTBL(selected,vehi,slt,time);
                        TableFormController.prl.add(p);
                        Table2FormController.vNumber=selected;
                        Table2FormController.vType="Van";
                        Table2FormController.dTime=time;

                    } else if (s4.equals("0")) {
                        String slt="04";
                        parkingSlot.setText(slt);
                        s4 =slt;
                        parkingTBL p=new parkingTBL(selected,vehi,slt,time);
                        TableFormController.prl.add(p);
                        Table2FormController.vNumber=selected;
                        Table2FormController.vType="Van";
                        Table2FormController.dTime=time;

                    } else if (s5.equals("0")) {
                        String slt="12";
                        parkingSlot.setText(slt);
                        s5 = slt;
                        parkingTBL p=new parkingTBL(selected,vehi,slt,time);
                        TableFormController.prl.add(p);
                        Table2FormController.vNumber=selected;
                        Table2FormController.vType="Van";
                        Table2FormController.dTime=time;
                    } else if (s6.equals("0")) {
                        String slt="13";
                        parkingSlot.setText(slt);
                        s6 = slt;
                        parkingTBL p=new parkingTBL(selected,vehi,slt,time);
                        TableFormController.prl.add(p);
                        Table2FormController.vNumber=selected;
                        Table2FormController.vType="Van";
                        Table2FormController.dTime=time;
                    }


                } else {
                    vTypelbl.setText("Cargo Lorry");
                    String selected = newValue.toString();
                    String vehi="Cargo Lorry";

                    if (s7.equals("0")) {
                        String slt="05";
                        parkingSlot.setText(slt);
                        s7 = slt;
                        parkingTBL p=new parkingTBL(selected,vehi,slt,time);
                        TableFormController.prl.add(p);
                        Table2FormController.vNumber=selected;
                        Table2FormController.vType="Cargo Lorry";
                        Table2FormController.dTime=time;

                    } else if (s8.equals("0")) {
                        String slt="06";
                        parkingSlot.setText(slt);
                        s8 = slt;
                        parkingTBL p=new parkingTBL(selected,vehi,slt,time);
                        TableFormController.prl.add(p);
                        Table2FormController.vNumber=selected;
                        Table2FormController.vType="Cargo Lorry";
                        Table2FormController.dTime=time;

                    } else if (s9.equals("0")) {
                        String slt="07";
                        parkingSlot.setText(slt);
                        s9 = slt;
                        parkingTBL p=new parkingTBL(selected,vehi,slt,time);
                        TableFormController.prl.add(p);
                        Table2FormController.vNumber=selected;
                        Table2FormController.vType="Cargo Lorry";
                        Table2FormController.dTime=time;

                    } else if (s10.equals("0")) {
                        String slt="08";
                        parkingSlot.setText(slt);
                        s10 = slt;
                        parkingTBL p=new parkingTBL(selected,vehi,slt,time);
                        TableFormController.prl.add(p);
                        Table2FormController.vNumber=selected;
                        Table2FormController.vType="Cargo Lorry";
                        Table2FormController.dTime=time;

                    } else if (s11.equals("0")) {
                        String slt="09";
                        parkingSlot.setText(slt);
                        s11 = slt;
                        parkingTBL p=new parkingTBL(selected,vehi,slt,time);
                        TableFormController.prl.add(p);
                        Table2FormController.vNumber=selected;
                        Table2FormController.vType="Cargo Lorry";
                        Table2FormController.dTime=time;

                    } else if (s12.equals("0")) {
                        String slt="10";
                        parkingSlot.setText(slt);
                        s12 = slt;
                        parkingTBL p=new parkingTBL(selected,vehi,slt,time);
                        TableFormController.prl.add(p);
                        Table2FormController.vNumber=selected;
                        Table2FormController.vType="Cargo Lorry";
                        Table2FormController.dTime=time;

                    } else if (s13.equals("0")) {
                        String slt="11";
                        parkingSlot.setText(slt);
                        s12 = slt;
                        parkingTBL p=new parkingTBL(selected,vehi,slt,time);
                        TableFormController.prl.add(p);
                       Table2FormController.vNumber=selected;
                       Table2FormController.vType="Cargo Lorry";
                       Table2FormController.dTime=time;
                    }
                }
            }
        });
    }


    public void driversComboBox() {

        dNameBox.getItems().addAll(drivers);
        dNameBox.setPromptText("Select Name");

        dNameBox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            String dSelected = newValue.toString();
            Table2FormController.dName=dSelected;
        });
    }

    public void parkVehiclebtn(ActionEvent actionEvent) {
        setBTN("park");
        TableFormController.loader();
    }


    public void diliveryShiftbtn(ActionEvent actionEvent) {
        Table2FormController.load();
        setBTN("delivery");

    }

    public void setBTN(String set){
        if(set.equals("park")){
        diliverbtn.setDisable(true);
        }else{
            parkbtn.setDisable(true);
        }
    }

    public void managementLoginbtn(ActionEvent actionEvent) throws IOException {
        context.getChildren().clear();
        Parent parent = FXMLLoader.load(getClass().getResource("../view/loginForm.fxml"));
        context.getChildren().add(parent);
    }


}
