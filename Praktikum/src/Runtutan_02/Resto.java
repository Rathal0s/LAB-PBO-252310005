package Runtutan_02;

import java.util.Locale;
import java.util.Scanner;

public class Resto {

    // Attribute
    private long Harga;

    // Method untuk menampilkan menu dan menginput pilihan
    public void chooseMenu() {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Menu Sarapan ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Bubur Ayam");
        System.out.println("3. Soto Ayam");

        System.out.print("Masukkan pilihan menu: ");
        int pilihan = input.nextInt();

        Long hasil = getPrices(pilihan);

        switch (pilihan) {
            case 1:
                System.out.println("Anda memesan Nasi Goreng dengan harga Rp " + formatRupiah(hasil) + ",-");
                break;
            case 2:
                System.out.println("Anda memesan Bubur Ayam dengan harga Rp " + formatRupiah(hasil) + ",-");
                break;
            case 3:
                System.out.println("Anda memesan Soto Ayam dengan harga Rp " + formatRupiah(hasil) + ",-");
                break;
            default:
                System.out.println("Maaf menu yang anda masukan salah.");
                break;
        }
        // Scanner sengaja tidak di-close agar System.in tidak ikut tertutup
    }

    // Method untuk menentukan harga berdasarkan menu
    private Long getPrices(int menu) {
        if (menu == 1) {
            Harga = 22000;
        } else if (menu == 2) {
            Harga = 15000;
        } else if (menu == 3) {
            Harga = 25000;
        } else {
            Harga = 0;
        }
        return Harga;
    }

    // Format angka menjadi 22.000
    private String formatRupiah(long angka) {
        return String.format(new Locale("id", "ID"), "%,d", angka);
    }
}