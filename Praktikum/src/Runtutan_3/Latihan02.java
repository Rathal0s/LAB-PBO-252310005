package Runtutan_3;

import javax.swing.JOptionPane;

public class Latihan02 {
    public static void main(String[] args) {
        Biodata bio = new Biodata();

        // Form input menggunakan kotak dialog
        String fullname = JOptionPane.showInputDialog(null,
                "Masukkan Fullname:", "Input Biodata", JOptionPane.QUESTION_MESSAGE);

        String usiaStr = JOptionPane.showInputDialog(null,
                "Masukkan Usia:", "Input Biodata", JOptionPane.QUESTION_MESSAGE);

        String alamat = JOptionPane.showInputDialog(null,
                "Masukkan Alamat:", "Input Biodata", JOptionPane.QUESTION_MESSAGE);

        if (fullname == null || usiaStr == null || alamat == null) {
            JOptionPane.showMessageDialog(null, "Input dibatalkan.");
            return;
        }

        try {
            int usia = Integer.parseInt(usiaStr.trim());
            bio.setData(fullname, usia, alamat);
           
            String hasil = "Fullname : " + bio.getFullname() + "\n"
                         + "Usia     : " + bio.getUsia() + " tahun\n"
                         + "Alamat   : " + bio.getAlamat();

            JOptionPane.showMessageDialog(null, hasil,
                    "Data Biodata", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "Usia harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}