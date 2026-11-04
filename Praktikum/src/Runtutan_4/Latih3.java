package Runtutan_4;


	import javax.swing.JOptionPane;

	public class Latih3 {
	    public static void main(String[] args) {
	    
	        int jumlah = Integer.parseInt(
	            JOptionPane.showInputDialog(null, "Masukan jumlah array:", "Input",
	                JOptionPane.QUESTION_MESSAGE));

	        int[] nilai = new int[jumlah];

	      
	        for (int i = 0; i < nilai.length; i++) {
	            nilai[i] = Integer.parseInt(
	                JOptionPane.showInputDialog(null, "Masukan angka:", "Data array ke-" + i,
	                    JOptionPane.QUESTION_MESSAGE));
	        }

	        // sort
	        int terbesar = nilai[0];
	        int terkecil = nilai[0];
	        for (int i = 1; i < nilai.length; i++) {
	            if (nilai[i] > terbesar) {
	                terbesar = nilai[i];
	            }
	            if (nilai[i] < terkecil) {
	                terkecil = nilai[i];
	            }
	        }

	     
	        String hasil = "";
	        for (int i = 0; i < nilai.length; i++) {
	            hasil += "x[" + i + "]=" + nilai[i] + "\n";
	        }
	        hasil += "Nilai terbesar adalah " + terbesar + "\n";
	        hasil += "Nilai terkecil adalah " + terkecil;

	        JOptionPane.showMessageDialog(null, hasil, "Output Array",
	            JOptionPane.INFORMATION_MESSAGE);
	    }
	}


