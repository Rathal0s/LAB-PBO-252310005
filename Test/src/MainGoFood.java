// MainGoFood.java
public class MainGoFood {
    public static void main(String[] args) {
        PesananFood pesanan = new PesananFood("PSN-001", "Andi");
        pesanan.tambahItem("Nasi Goreng", 25000);
        pesanan.tambahItem("Es Teh", 5000);

        Driver driver = new Driver("DRV-01", "Budi");
        driver.terimaPesanan(pesanan);

        pesanan.tampilkanInfo();
        // pesanan.totalHarga = 0;  // ERROR kompilasi: totalHarga private
    }
}