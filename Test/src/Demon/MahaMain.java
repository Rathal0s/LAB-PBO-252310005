package Demon;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MahaMain {

    static ArrayList<Mahasiswa> daftar = new ArrayList<>();

    // Konfirmasi keluar, true jika pilih Yes
     boolean konfirmasiKeluar() {
        int pilihan = JOptionPane.showConfirmDialog(null,
                "Apakah anda ingin keluar?", "Konfirmasi",
                JOptionPane.YES_NO_OPTION);
        return pilihan == JOptionPane.YES_OPTION;
    }

    // Input teks: tidak boleh kosong, Cancel/close (x) -> tanya keluar
    static String input(String nama) {
        while (true) {
            String s = JOptionPane.showInputDialog(null, "Masukkan " + nama + ":");
            if (s == null) {
                if (konfirmasiKeluar()) {
                    System.exit(0);
                }
            } else if (s.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null,
                        "Field " + nama + " tidak boleh kosong",
                        "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                return s.trim();
            }
        }
    }

    // Input IPK: harus angka dan berada di antara 0 sampai 4
    static double inputIpk() {
        while (true) {
            String s = input("IPK (0 - 4)");
            try {
                double ipk = Double.parseDouble(s);
                if (ipk >= 0 && ipk <= 4) {
                    return ipk;
                }
                JOptionPane.showMessageDialog(null,
                        "IPK harus antara 0 sampai 4",
                        "Warning", JOptionPane.WARNING_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "isian harus angka",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // Mencari index mahasiswa berdasarkan NIM, -1 jika tidak ada
    static int cari(String nim) {
        for (int i = 0; i < daftar.size(); i++) {
            if (daftar.get(i).getNim().equalsIgnoreCase(nim)) {
                return i;
            }
        }
        return -1;
    }

    static void tambahMahasiswa() {
        String nim;
        while (true) {
            nim = input("NIM");
            if (cari(nim) == -1) {
                break;
            }
            JOptionPane.showMessageDialog(null, "NIM sudah terdaftar",
                    "Warning", JOptionPane.WARNING_MESSAGE);
        }

        Mahasiswa m = new Mahasiswa();
        m.setNim(nim);
        m.setNama(input("nama"));
        m.setJurusan(input("jurusan"));
        m.setIpk(inputIpk());

        daftar.add(m);
        JOptionPane.showMessageDialog(null, "Mahasiswa berhasil ditambahkan");
    }

   

    static void hapusMahasiswa() {
        if (daftar.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Belum ada data mahasiswa");
            return;
        }

        int index = cari(input("NIM yang akan dihapus"));
        if (index == -1) {
            JOptionPane.showMessageDialog(null, "NIM tidak ditemukan",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int yakin = JOptionPane.showConfirmDialog(null,
                "Hapus data \"" + daftar.get(index).getNama() + "\"?",
                "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
        if (yakin == JOptionPane.YES_OPTION) {
            daftar.remove(index);
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
        }
    }

    static void tampilkanSemua() {
        if (daftar.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Belum ada data mahasiswa");
            return;
        }

        String hasil = "";
        double total = 0;
        for (int i = 0; i < daftar.size(); i++) {
            Mahasiswa m = daftar.get(i);
            hasil += (i + 1) + ". " + m.getNama() + "\n"
                   + "    NIM     : " + m.getNim() + "\n"
                   + "    Jurusan : " + m.getJurusan() + "\n"
                   + "    IPK     : " + m.getIpk() + "\n\n";
            total += m.getIpk();
        }
        hasil += "Rata-rata IPK: " + (total / daftar.size());

        JOptionPane.showMessageDialog(null, hasil, "Daftar Mahasiswa",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        String[] menu = {"Tambah", "Hapus", "Tampilkan Semua", "Keluar"};

        while (true) {
            int pilihan = JOptionPane.showOptionDialog(null,
                    "Silakan pilih menu:", "Data Mahasiswa",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, menu, menu[0]);

            if (pilihan == 0) {
                tambahMahasiswa();
            
            } else if (pilihan == 2) {
                hapusMahasiswa();
            } else if (pilihan == 3) {
                tampilkanSemua();
            } else if (konfirmasiKeluar()) {   // Keluar atau close (x)
                break;
            }
        }
    }
}
