package com.ibik.pbo.Pembelajaran;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AppLogistikV2 {


    static void konfirmasiKeluar() {
        int k = JOptionPane.showConfirmDialog(null, "Apakah anda ingin keluar ?",
                "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (k == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    // validasi 
    static Integer inputAngka(String pesan) {
        while (true) {
            String s = JOptionPane.showInputDialog(pesan);
            if (s == null) {
                konfirmasiKeluar();
                return null;
            }
            s = s.trim();

         
            boolean angka = s.length() > 0 && s.length() <= 9;
            for (int i = 0; i < s.length(); i++) {
                if (!Character.isDigit(s.charAt(i))) {
                    angka = false;
                }
            }

            if (angka) {
                return Integer.parseInt(s);
            } else {
                JOptionPane.showMessageDialog(null, "Masukan angka", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
     
        ArrayList<String> resi = new ArrayList<>();
        ArrayList<String> penerima = new ArrayList<>();
        ArrayList<Integer> biaya = new ArrayList<>();
        ArrayList<String> status = new ArrayList<>();

        String menu = "1. Input Pesanan\n2. Tracking Pesanan\n3. Keluar";
        Integer pilih = 0;
        while (pilih == null || pilih != 3) {
            pilih = inputAngka(menu);
            if (pilih == null) {
                continue;
            }

            if (pilih == 1) {
                String nama = JOptionPane.showInputDialog("Nama Penerima:");
                if (nama == null) {
                    konfirmasiKeluar();
                    continue;
                }
                Integer berat = inputAngka("Berat barang (gram):");
                if (berat == null) {
                    continue;
                }
                Integer jarak = inputAngka("Jarak tujuan (km):");
                if (jarak == null) {
                    continue;
                }

               
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

            } else if (pilih == 2) {
                
                if (resi.size() == 0) {
                    JOptionPane.showMessageDialog(null, "Anda belum melakukan input pesanan",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    continue;
                }

                String cari = JOptionPane.showInputDialog("Masukkan nomor resi:");
                if (cari == null) {
                    konfirmasiKeluar();
                    continue;
                }

                int index = resi.indexOf(cari.trim());
                if (index == -1) {
               
                    JOptionPane.showMessageDialog(null, "Data tidak ditemukan",
                            "Error", JOptionPane.ERROR_MESSAGE);
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