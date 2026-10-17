package Runtutan_3;

public class Biodata {
    private String fullname;
    private int usia;
    private String alamat;

    // Method untuk menyimpan value ketiga atribut
    public void setData(String fullname, int usia, String alamat) {
        this.fullname = fullname;
        this.usia = usia;
        this.alamat = alamat;
    }

    public String getFullname() {
        return fullname;
    }

    public int getUsia() {
        return usia;
    }

    public String getAlamat() {
        return alamat;
    }
}