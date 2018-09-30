package com.kxland.hydrodonoremote;


public class Monitoring {
    String id;
    String suhu;
    String ph;
    String ec;
    String pupukA;
    String pupukB;
    String ketinggianWadah;
    String idarduino;
    String tanggal;


    public Monitoring() {

    }

    public Monitoring(String id, String ph, String suhu, String ec, String pupukA, String pupukB, String ketinggianWadah, String idarduino, String tanggal) {
        this.id = id;
        this.ph = ph;
        this.suhu = suhu;
        this.ec = ec;
        this.pupukA = pupukA;
        this.pupukB = pupukB;
        this.ketinggianWadah = ketinggianWadah;
        this.idarduino = idarduino;
        this.tanggal = tanggal;
    }

    public String getId() {
        return id;
    }

    public String getPh() {
        return ph;
    }

    public String getEc() {
        return ec;
    }

    public String getSuhu() {
        return suhu;
    }

    public String getPupukA() {
        return pupukA;
    }

    public String getPupukB() {
        return pupukB;
    }

    public String getKetinggianWadah() {
        return ketinggianWadah;
    }

    public String getIdArduino() {
        return idarduino;
    }

    public String getTanggal() {
        return tanggal;
    }

}