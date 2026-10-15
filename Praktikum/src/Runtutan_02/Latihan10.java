package Runtutan_02;

import java.util.Scanner;

public class Latihan10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final String NPM = "252315";
        long saldo = 69420;
        String pin;

     
        while (true) {
            System.out.print("Masukkan PIN: ");
            pin = input.next();

            if (pin.equals(NPM)) {
                break;
            }
            System.out.println("PIN salah, silakan coba lagi.");
        }  
        char konfirmasi;

       
        do {
            System.out.println();
            System.out.println("=== Menu ATM ===");
            System.out.println("1. Lihat Saldo");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Keluar");
            System.out.print("Masukkan menu: ");
            int menu = input.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Saldo anda: Rp " + saldo);
                    break;

                case 2:
                    System.out.print("Masukkan nominal setor tunai: ");
                    long setor = input.nextLong();
                    saldo += setor;
                    System.out.println("Setor tunai berhasil. Saldo sekarang: Rp " + saldo);
                    break;

                case 3:
                    System.out.print("Masukkan nominal tarik tunai: ");
                    long tarik = input.nextLong();

                    if (saldo >= tarik) {
                        saldo -= tarik;
                        System.out.println("Tarik tunai berhasil. Saldo sekarang: Rp " + saldo);
                    } else {
                        System.out.println("Saldo tidak cukup.");
                    }
                    break;

                case 4:
                    System.out.println("Anda memilih keluar.");
                    break;

                default:
                    System.out.println("Menu tidak valid.");
                    break;
            }

          
            while (true) {
                System.out.print("Kembali ke menu? (Y/N) ");
                konfirmasi = input.next().toLowerCase().charAt(0);

                if (konfirmasi == 'y' || konfirmasi == 'n') {
                    break;
                }
                System.out.println("Input tidak valid, masukkan Y atau N.");
            }

        } while (konfirmasi == 'y');

        System.out.println("Terima kasih telah menggunakan ATM.");
        input.close();
    }
}