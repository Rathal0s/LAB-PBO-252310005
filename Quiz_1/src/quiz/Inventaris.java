package quiz;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Inventaris {
	   JOptionPane jop = new JOptionPane();

     ArrayList<Buku> daftar = new ArrayList<>();
  
  
     boolean konfirmasiKeluar() {
        int pilihan = jop.showConfirmDialog(null,
                "Exit?", "Konfirmasi",
                jop.YES_NO_OPTION);
        return pilihan == jop.YES_OPTION;
    }

   
     String input(String nama) {
        while (true) {
            String s = jop.showInputDialog(null, "Masukkan " + nama + ":");
            if (s == null) {
                if (konfirmasiKeluar()) {
                    System.exit(0);
                }
            } else if (s.trim().isEmpty()) {
                jop.showMessageDialog(null,
                        "Field " + nama + " tidak boleh kosong",
                        "Error", jop.ERROR_MESSAGE);
            } else {
                return s.trim();
            }
        }
    }

    
     int cari(String kode) {
        for (int i = 0; i < daftar.size(); i++) {
            if (daftar.get(i).getKode().equalsIgnoreCase(kode)) {
                return i;
            }
        }
        return -1;
    }

     void tambahBuku() {
        String kode;
        while (true) {
            kode = input("kode buku");
            if (cari(kode) == -1) {
                break;
            }
            jop.showMessageDialog(null, "Kode buku dupliakt",    "Warning", jop.WARNING_MESSAGE);
        }

        String judul = input("judul");

        

        Buku b = new Buku();
        b.setData(kode, judul);
        daftar.add(b);
        jop.showMessageDialog(null, "Buku berhasil ditambahkan");
    }

     void hapusBuku() {
        if (daftar.isEmpty()) {
            jop.showMessageDialog(null, "Belum ada data buku");
            return;
        }

        String kode = input("kode buku yang dihapus");
        int index = cari(kode);

        if (index == -1) {
            jop.showMessageDialog(null, "Kode buku tidak ditemukan",
                    "Error", jop.ERROR_MESSAGE);
            return;
        }

        int yakin = jop.showConfirmDialog(null,
                "Hapus buku \"" + daftar.get(index).getJudul() + "\"?",
                "Konfirmasi Hapus", jop.YES_NO_OPTION);
        if (yakin == jop.YES_OPTION) {
            daftar.remove(index);
            jop.showMessageDialog(null, "Buku berhasil dihapus");
        }
    }

     void tampilkanSemua() {
        if (daftar.isEmpty()) {
            jop.showMessageDialog(null, "Belum ada data buku");
            return;
        }

        String hasil = "";
        for (int i = 0; i < daftar.size(); i++) {
            Buku b = daftar.get(i);
            hasil += (i + 1) + ". " + b.getJudul() + "\n"
                   + "    Kode      : " + b.getKode() + "\n";
        }
        jop.showMessageDialog(null, hasil, "Daftar Buku",
                jop.INFORMATION_MESSAGE);
    }

    public  void main(String[] args) {
        String[] menu = {"Add Buku", "Delete Buku", "Tampilkan Semua", "Exit"};

        while (true) {
            int pilihan = jop.showOptionDialog(null,
                    "Silakan pilih menu:", "Menu Perpustakaan",
                    jop.DEFAULT_OPTION, jop.QUESTION_MESSAGE,
                    null, menu, menu[0]);

            if (pilihan == 0) {
                tambahBuku();
            } else if (pilihan == 1) {
                hapusBuku();
            } else if (pilihan == 2) {
                tampilkanSemua();
            } else if (konfirmasiKeluar()) {   
                break;
            }
        }
    }
}