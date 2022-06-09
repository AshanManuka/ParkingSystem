package model;

public class diliverTBL {
    public String vNumber;
    public String vType;
    public String dName;
    public String dTime;

    public diliverTBL() {
    }

    public diliverTBL(String vNumber, String vType, String dName, String dTime) {
        this.vNumber = vNumber;
        this.vType = vType;
        this.dName = dName;
        this.dTime = dTime;
    }

    public String getvNumber() {
        return vNumber;
    }

    public void setvNumber(String vNumber) {
        this.vNumber = vNumber;
    }

    public String getvType() {
        return vType;
    }

    public void setvType(String vType) {
        this.vType = vType;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getdTime() {
        return dTime;
    }

    public void setdTime(String dTime) {
        this.dTime = dTime;
    }

    @Override
    public String toString() {
        return "diliverTBL{" +
                "vNumber='" + vNumber + '\'' +
                ", vType='" + vType + '\'' +
                ", dName='" + dName + '\'' +
                ", dTime='" + dTime + '\'' +
                '}';
    }
}
