package quiz;

public class Buku {
    private String kode;
    private String judul;
   

    public void setData(String kode, String judul) {
        this.kode = kode;
        this.judul = judul;
       
    }

    public String getKode()      { return kode; }
    public String getJudul()     { return judul; }
   
}