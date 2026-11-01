package Demon;

import javax.swing.JOptionPane;

public class Main_2 {

    static final int MAX = 5;                      // array capacity
    static Kontak[] daftar = new Kontak[MAX];      // fixed-size array
    static int jumlah = 0;                         // number of filled slots

    // Confirm exit, true if Yes
    static boolean konfirmasiKeluar() {
        int pilihan = JOptionPane.showConfirmDialog(null,
                "Apakah anda ingin keluar?", "Konfirmasi",
                JOptionPane.YES_NO_OPTION);
        return pilihan == JOptionPane.YES_OPTION;
    }

    // Text input: must not be empty, Cancel/close (x) -> ask to exit
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

    // Phone input: digits only, at least 10 digits
    static String inputTelepon() {
        while (true) {
            String s = input("nomor telepon");
            if (!s.matches("[0-9]+")) {
                JOptionPane.showMessageDialog(null, "isian harus angka",
                        "Error", JOptionPane.ERROR_MESSAGE);
            } else if (s.length() < 10) {
                JOptionPane.showMessageDialog(null,
                        "Nomor telepon minimal 10 digit",
                        "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                return s;
            }
        }
    }

    // Find index by phone number, -1 if not found
    static int cari(String telepon) {
        for (int i = 0; i < jumlah; i++) {
            if (daftar[i].getTelepon().equals(telepon)) {
                return i;
            }
        }
        return -1;
    }

    static void tambahKontak() {
        if (jumlah == MAX) {
            JOptionPane.showMessageDialog(null,
                    "Kapasitas penuh (maksimal " + MAX + " kontak)",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String telepon;
        while (true) {
            telepon = inputTelepon();
            if (cari(telepon) == -1) {
                break;
            }
            JOptionPane.showMessageDialog(null, "Nomor telepon sudah terdaftar",
                    "Warning", JOptionPane.WARNING_MESSAGE);
        }

        Kontak k = new Kontak();
        k.setTelepon(telepon);
        k.setNama(input("nama"));
        k.setKota(input("kota"));

        daftar[jumlah] = k;     // put the object into the next empty slot
        jumlah++;
        JOptionPane.showMessageDialog(null, "Kontak berhasil ditambahkan");
    }

    static void hapusKontak() {
        if (jumlah == 0) {
            JOptionPane.showMessageDialog(null, "Belum ada data kontak");
            return;
        }

        int index = cari(input("nomor telepon yang dihapus"));
        if (index == -1) {
            JOptionPane.showMessageDialog(null, "Nomor telepon tidak ditemukan",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int yakin = JOptionPane.showConfirmDialog(null,
                "Hapus kontak \"" + daftar[index].getNama() + "\"?",
                "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
        if (yakin == JOptionPane.YES_OPTION) {
            // shift the remaining elements one slot to the left
            for (int i = index; i < jumlah - 1; i++) {
                daftar[i] = daftar[i + 1];
            }
            daftar[jumlah - 1] = null;
            jumlah--;
            JOptionPane.showMessageDialog(null, "Kontak berhasil dihapus");
        }
    }

    static void tampilkanSemua() {
        if (jumlah == 0) {
            JOptionPane.showMessageDialog(null, "Belum ada data kontak");
            return;
        }

        String hasil = "";
        for (int i = 0; i < jumlah; i++) {
            hasil += (i + 1) + ". " + daftar[i].getNama() + "\n"
                   + "    Telepon : " + daftar[i].getTelepon() + "\n"
                   + "    Kota    : " + daftar[i].getKota() + "\n\n";
        }
        hasil += "Terisi " + jumlah + " dari " + MAX + " slot";

        JOptionPane.showMessageDialog(null, hasil, "Daftar Kontak",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        String[] menu = {"Tambah Kontak", "Hapus Kontak", "Tampilkan Semua", "Keluar"};

        while (true) {
            int pilihan = JOptionPane.showOptionDialog(null,
                    "Silakan pilih menu:", "Buku Kontak",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, menu, menu[0]);

            if (pilihan == 0) {
                tambahKontak();
            } else if (pilihan == 1) {
                hapusKontak();
            } else if (pilihan == 2) {
                tampilkanSemua();
            } else if (konfirmasiKeluar()) {   // Keluar or close (x)
                break;
            }
        }
    }
}
