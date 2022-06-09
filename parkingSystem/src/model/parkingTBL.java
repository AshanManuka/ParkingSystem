package model;

public class parkingTBL {
    public String vNumber;
    public String vType;
    public String pSlot;
    public String pTime;

    public parkingTBL() {

    }

    public parkingTBL(String vNumber, String vType, String pSlot, String pTime) {
        this.vNumber = vNumber;
        this.vType = vType;
        this.pSlot = pSlot;
        this.pTime = pTime;
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

    public String getpSlot() {
        return pSlot;
    }

    public void setpSlot(String pSlot) {
        this.pSlot = pSlot;
    }

    public String getpTime() {
        return pTime;
    }

    public void setpTime(String pTime) {
        this.pTime = pTime;
    }

    @Override
    public String toString() {
        return "parkingTBL{" +
                "vNumber='" + vNumber + '\'' +
                ", vType='" + vType + '\'' +
                ", pSlot='" + pSlot + '\'' +
                ", pTime='" + pTime + '\'' +
                '}';
    }
}
