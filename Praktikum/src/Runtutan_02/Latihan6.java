package Runtutan_02;

import java.util.Scanner;

public class Latihan6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Resto resto = new Resto();
        char ulang;

        do {
            resto.chooseMenu();

            // Ulangi pertanyaan sampai input valid (y/n)
            while (true) {
                System.out.print("Apakah anda akan memesan kembali ? (y/n) ");
                ulang = input.next().toLowerCase().charAt(0);

                if (ulang == 'y' || ulang == 'n') {
                    break;
                }
                System.out.println("Input tidak valid, masukkan y atau n.");
            }

            System.out.println();

        } while (ulang == 'y');

        System.out.println("Terimakasih telah memesan.");
    }
}