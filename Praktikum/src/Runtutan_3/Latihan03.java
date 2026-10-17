package Runtutan_3;

import javax.swing.JOptionPane;

public class Latihan03 {
    public static void main(String[] args) {
        // Input
        String fullname = JOptionPane.showInputDialog(null,
                "Masukkan Fullname:", "Input Biodata", JOptionPane.QUESTION_MESSAGE);
        if (fullname == null) {
            JOptionPane.showMessageDialog(null, "Input dibatalkan.");
            return;
        }

        // Validasi fullname tidak boleh kosong
        if (fullname.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Field fullname tidak boleh kosong",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String usiaStr = JOptionPane.showInputDialog(null,
                "Masukkan Usia:", "Input Biodata", JOptionPane.QUESTION_MESSAGE);
        if (usiaStr == null) {
            JOptionPane.showMessageDialog(null, "Input dibatalkan.");
            return;
        }

      
        if (usiaStr.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Field usia tidak boleh kosong",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

   
        int usia;
        try {
            usia = Integer.parseInt(usiaStr.trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    "isian harus angka",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String alamat = JOptionPane.showInputDialog(null,
                "Masukkan Alamat:", "Input Biodata", JOptionPane.QUESTION_MESSAGE);
        if (alamat == null) {
            JOptionPane.showMessageDialog(null, "Input dibatalkan.");
            return;
        }

       
        if (alamat.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "Field alamat tidak boleh kosong",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

     
        if (alamat.trim().length() < 10) {
            JOptionPane.showMessageDialog(null,
                    "Alamat harus memiliki minimal 10 karakter",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

     
        Biodata bio = new Biodata();
        bio.setData(fullname.trim(), usia, alamat.trim());

      
        String hasil = "Fullname : " + bio.getFullname() + "\n"
                     + "Usia     : " + bio.getUsia() + " tahun\n"
                     + "Alamat   : " + bio.getAlamat();

        JOptionPane.showMessageDialog(null, hasil,
                "Data Biodata", JOptionPane.INFORMATION_MESSAGE);
    }
}