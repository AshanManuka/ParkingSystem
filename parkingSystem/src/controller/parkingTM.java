package controller;

public class parkingTM {
    private String num;
    private String tp;
    private String st;
    private String tm;

    public parkingTM() {
    }

    public parkingTM(String num, String tp, String st, String tm) {
        this.num = num;
        this.tp = tp;
        this.st = st;
        this.tm = tm;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
    }

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    public String getTm() {
        return tm;
    }

    public void setTm(String tm) {
        this.tm = tm;
    }

    @Override
    public String toString() {
        return "parkingTM{" +
                "num='" + num + '\'' +
                ", tp='" + tp + '\'' +
                ", st='" + st + '\'' +
                ", tm='" + tm + '\'' +
                '}';
    }
}
