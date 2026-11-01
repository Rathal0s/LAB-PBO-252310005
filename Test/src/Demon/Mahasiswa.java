package Demon;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String jurusan;
    private double ipk;

    // ===== Setter =====
    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    // ===== Getter =====
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public double getIpk() {
        return ipk;
    }
}