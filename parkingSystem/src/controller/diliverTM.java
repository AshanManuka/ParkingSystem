package controller;

public class diliverTM {
    private String vn;
    private String vt;
    private String dn;
    private String dt;

    public diliverTM() {
    }

    public diliverTM(String vn, String vt, String dn, String dt) {
        this.vn = vn;
        this.vt = vt;
        this.dn = dn;
        this.dt = dt;
    }

    public String getVn() {
        return vn;
    }

    public void setVn(String vn) {
        this.vn = vn;
    }

    public String getVt() {
        return vt;
    }

    public void setVt(String vt) {
        this.vt = vt;
    }

    public String getDn() {
        return dn;
    }

    public void setDn(String dn) {
        this.dn = dn;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    @Override
    public String toString() {
        return "diliverTM{" +
                "vn='" + vn + '\'' +
                ", vt='" + vt + '\'' +
                ", dn='" + dn + '\'' +
                ", dt='" + dt + '\'' +
                '}';
    }
}
