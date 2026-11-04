package Runtutan_4;


import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latih9 {
    public static void main(String[] args) {
        int jumlah = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Masukan jumlah array:", "Input",
                JOptionPane.QUESTION_MESSAGE));

        ArrayList<Integer> nilai = new ArrayList<Integer>();

      
        for (int i = 0; i < jumlah; i++) {
            nilai.add(Integer.parseInt(
                JOptionPane.showInputDialog(null, "Masukan angka:", "Data array ke-" + i,
                    JOptionPane.QUESTION_MESSAGE)));
        }

        
        int terbesar = nilai.get(0);
        int terkecil = nilai.get(0);
        for (int i = 1; i < nilai.size(); i++) {
            if (nilai.get(i) > terbesar) {
                terbesar = nilai.get(i);
            }
            if (nilai.get(i) < terkecil) {
                terkecil = nilai.get(i);
            }
        }

     
        String hasil = "";
        for (int i = 0; i < nilai.size(); i++) {
            hasil += "x[" + i + "]=" + nilai.get(i) + "\n";
        }
        hasil += "Nilai terbesar adalah " + terbesar + "\n";
        hasil += "Nilai terkecil adalah " + terkecil;

        JOptionPane.showMessageDialog(null, hasil, "Output Array",
            JOptionPane.INFORMATION_MESSAGE);
    }
}
