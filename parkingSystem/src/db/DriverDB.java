package db;

import model.Driver;

import java.util.ArrayList;

public class DriverDB {
    public static ArrayList<Driver> driverlist = new ArrayList<Driver>();



    static{
        driverlist.add(new Driver("Sumith Kumara","544465412V","B20010234","Panadura","789645315"));
        driverlist.add(new Driver("Amila Pathirana","6542698V","B6404570","Galle","705143335"));
        driverlist.add(new Driver("Jithmal Perera","6545684V","B8575122","Matara","789563214"));
        driverlist.add(new Driver("Sumith Dissanayake","3245628V","B3254870","Galle","45651235"));
        driverlist.add(new Driver("Sumanasiri Herath","8945651V","B852123","Colombo","712354865"));
        driverlist.add(new Driver("Awantha Fernando","78986514V","B425370","Kaluthara","769582546"));
        driverlist.add(new Driver("Charith Sudara","32456755V","B213572","Panadura","456223585"));
        driverlist.add(new Driver("Prashan Dineth","69865751V","B654574","Matara","748565452"));
        driverlist.add(new Driver("Chethiya Dilan","886542352V","B6486450","Horana","779865452"));
        driverlist.add(new Driver("Dushantha Perera","996545321V","B640320","Galle","756664857"));

    }


}
