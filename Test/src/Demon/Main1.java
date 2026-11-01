package Demon;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main1 {

    static ArrayList<Barang> daftar = new ArrayList<>();

    // Konfirmasi keluar, true jika pilih Yes
    static boolean konfirmasiKeluar() {
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

    // Input angka: harus numerik dan tidak boleh negatif
    static int inputAngka(String nama) {
        while (true) {
            String s = input(nama);
            try {
                int angka = Integer.parseInt(s);
                if (angka < 0) {
                    JOptionPane.showMessageDialog(null,
                            nama + " tidak boleh negatif",
                            "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    return angka;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "isian harus angka",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // Mencari index barang berdasarkan kode, -1 jika tidak ada
    static int cari(String kode) {
        for (int i = 0; i < daftar.size(); i++) {
            if (daftar.get(i).getKode().equalsIgnoreCase(kode)) {
                return i;
            }
        }
        return -1;
    }

    static void tambahBarang() {
        String kode;
        while (true) {
            kode = input("kode barang");
            if (cari(kode) == -1) {
                break;
            }
            JOptionPane.showMessageDialog(null, "Kode barang sudah digunakan",
                    "Warning", JOptionPane.WARNING_MESSAGE);
        }

        String nama = input("nama barang");
        int harga = inputAngka("harga");
        int stok = inputAngka("stok");

        Barang b = new Barang();
        b.setData(kode, nama, harga, stok);
        daftar.add(b);
        JOptionPane.showMessageDialog(null, "Barang berhasil ditambahkan");
    }

    static void hapusBarang() {
        if (daftar.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Belum ada data barang");
            return;
        }

        String kode = input("kode barang yang dihapus");
        int index = cari(kode);

        if (index == -1) {
            JOptionPane.showMessageDialog(null, "Kode barang tidak ditemukan",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int yakin = JOptionPane.showConfirmDialog(null,
                "Hapus barang \"" + daftar.get(index).getNama() + "\"?",
                "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
        if (yakin == JOptionPane.YES_OPTION) {
            daftar.remove(index);
            JOptionPane.showMessageDialog(null, "Barang berhasil dihapus");
        }
    }

    static void tampilkanSemua() {
        if (daftar.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Belum ada data barang");
            return;
        }

        String hasil = "";
        int totalNilai = 0;
        for (int i = 0; i < daftar.size(); i++) {
            Barang b = daftar.get(i);
            hasil += (i + 1) + ". " + b.getNama() + "\n"
                   + "    Kode  : " + b.getKode() + "\n"
                   + "    Harga : Rp " + b.getHarga() + "\n"
                   + "    Stok  : " + b.getStok() + "\n\n";
            totalNilai += b.getHarga() * b.getStok();
        }
        hasil += "Total nilai persediaan: Rp " + totalNilai;

        JOptionPane.showMessageDialog(null, hasil, "Daftar Barang",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        String[] menu = {"Tambah Barang", "Hapus Barang", "Tampilkan Semua", "Keluar"};

        while (true) {
            int pilihan = JOptionPane.showOptionDialog(null,
                    "Silakan pilih menu:", "Menu Inventaris Toko",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, menu, menu[0]);

            if (pilihan == 0) {
                tambahBarang();
            } else if (pilihan == 1) {
                hapusBarang();
            } else if (pilihan == 2) {
                tampilkanSemua();
            } else if (konfirmasiKeluar()) {   // Keluar atau close (x)
                break;
            }
        }
    }
}