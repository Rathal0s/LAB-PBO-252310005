package com.ibik.pbo.Pembelajaran;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AppLogistik {

    public static void main(String[] args) {
        ArrayList<String> resi = new ArrayList<>();
        ArrayList<String> penerima = new ArrayList<>();
        ArrayList<Integer> biaya = new ArrayList<>();
        ArrayList<String> status = new ArrayList<>();

        String menu = "1. Buat Pengiriman\n2. Lacak Resi\n3. Keluar";
        String pilih = "";
        while (!pilih.equals("3")) {
            pilih = JOptionPane.showInputDialog(null, menu, "PT. XYZ Logistik", JOptionPane.QUESTION_MESSAGE);
            if (pilih == null) {
                break;
            }

            if (pilih.equals("1")) {
                String nama = JOptionPane.showInputDialog("Nama Penerima:");
                int berat = Integer.parseInt(JOptionPane.showInputDialog("Berat barang (gram):"));
                int jarak = Integer.parseInt(JOptionPane.showInputDialog("Jarak tujuan (km):"));

              
                int kelipatanBerat = (berat + 99) / 100;
                int kelipatanJarak = (jarak + 9) / 10;
                int total = kelipatanBerat * 5000 + kelipatanJarak * 8000;

                String noResi = "XYZ" + (1001 + resi.size());
                resi.add(noResi);
                penerima.add(nama);
                biaya.add(total);
                status.add("Barang sedang dikirim");

                JOptionPane.showMessageDialog(null,
                        "Pengiriman berhasil!\nNo. Resi : " + noResi + "\nTotal    : Rp " + total);

            } else if (pilih.equals("2")) {
                String cari = JOptionPane.showInputDialog("Masukkan nomor resi:");
                int index = resi.indexOf(cari);
                if (index == -1) {
                    JOptionPane.showMessageDialog(null, "Nomor resi tidak ditemukan");
                } else {
                    JOptionPane.showMessageDialog(null,
                            "No. Resi : " + resi.get(index) + "\n"
                            + "Penerima : " + penerima.get(index) + "\n"
                            + "Biaya    : Rp " + biaya.get(index) + "\n"
                            + "Status   : " + status.get(index));
                }
            }
        }
    }
}