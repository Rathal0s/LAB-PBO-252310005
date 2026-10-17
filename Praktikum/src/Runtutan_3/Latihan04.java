package Runtutan_3;

import javax.swing.JOptionPane;

public class Latihan04 {

    // Menampilkan konfirmasi keluar. Return true jika pengguna memilih Yes.
    private static boolean konfirmasiKeluar() {
        int pilihan = JOptionPane.showConfirmDialog(null,
                "Apakah anda ingin keluar?",
                "Konfirmasi",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        return pilihan == JOptionPane.YES_OPTION;
    }

    // Menampilkan dialog input. Jika Cancel/close (x), tanya keluar.
    // Yes -> program selesai, No -> dialog input ditampilkan lagi.
    private static String inputDialog(String pesan) {
        while (true) {
            String hasil = JOptionPane.showInputDialog(null,
                    pesan, "Input Biodata", JOptionPane.QUESTION_MESSAGE);
            if (hasil != null) {
                return hasil;
            }
            if (konfirmasiKeluar()) {
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        while (true) {
         
            String fullname;
            while (true) {
                fullname = inputDialog("Masukkan Fullname:");
                if (fullname.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            "Field fullname tidak boleh kosong",
                            "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    break;
                }
            }

          
            int usia;
            while (true) {
                String usiaStr = inputDialog("Masukkan Usia:");
                if (usiaStr.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            "Field usia tidak boleh kosong",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    continue;
                }
                try {
                    usia = Integer.parseInt(usiaStr.trim());
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null,
                            "isian harus angka",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

           
            String alamat;
            while (true) {
                alamat = inputDialog("Masukkan Alamat:");
                if (alamat.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            "Field alamat tidak boleh kosong",
                            "Error", JOptionPane.ERROR_MESSAGE);
                } else if (alamat.trim().length() < 10) {
                    JOptionPane.showMessageDialog(null,
                            "Alamat harus memiliki minimal 10 karakter",
                            "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    break;
                }
            }

            
            Biodata bio = new Biodata();
            bio.setData(fullname.trim(), usia, alamat.trim());

          
            String hasil = "Fullname : " + bio.getFullname() + "\n"
                         + "Usia     : " + bio.getUsia() + " tahun\n"
                         + "Alamat   : " + bio.getAlamat();

            JOptionPane.showMessageDialog(null, hasil,
                    "Data Biodata", JOptionPane.INFORMATION_MESSAGE);

         
            if (konfirmasiKeluar()) {
                break;         
            }
           
        }
    }
}