package com.ibik.pbo.Pembelajaran;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AppBukuTelp {

    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<>();
        ArrayList<ArrayList<String>> buku = new ArrayList<>();

        int lagi = JOptionPane.YES_OPTION;
        while (lagi == JOptionPane.YES_OPTION) {
            String n = JOptionPane.showInputDialog("Nama Lengkap:");
            String a = JOptionPane.showInputDialog("Alamat:");
            String t = JOptionPane.showInputDialog("No Telp:");

            ArrayList<String> baris = new ArrayList<>();
            baris.add(n);
            baris.add(a);
            baris.add(t);
            buku.add(baris);
            nama.add(n);

            lagi = JOptionPane.showConfirmDialog(null, "Tambah data lagi?", "Buku Telepon",
                    JOptionPane.YES_NO_OPTION);
        }

        String hasil = "";
        for (int i = 0; i < buku.size(); i++) {
            hasil = hasil + (i + 1) + ". " + buku.get(i).get(0) + "\n"
                    + "   Alamat  : " + buku.get(i).get(1) + "\n"
                    + "   No Telp : " + buku.get(i).get(2) + "\n";
        }
        JOptionPane.showMessageDialog(null, hasil, "Data Buku Telepon", JOptionPane.INFORMATION_MESSAGE);
    }
}