package Runtutan_5;


	import java.util.ArrayList;
	import java.util.Collections;
	import javax.swing.JOptionPane;

	public class Latih04 {
	    public static void main(String[] args) {
	        ArrayList<ArrayList<String>> data = new ArrayList<>();

	        // Input data (3 orang)
	        for (int i = 0; i < 3; i++) {
	            data.add(new ArrayList<>());
	            data.get(i).add(JOptionPane.showInputDialog("Nama Lengkap orang ke-" + (i + 1)));
	            data.get(i).add(JOptionPane.showInputDialog("Alamat orang ke-" + (i + 1)));
	            data.get(i).add(JOptionPane.showInputDialog("No Telp orang ke-" + (i + 1)));
	        }

	     // Urutkan Ascending berdasarkan Nama Lengkap (bubble sort)
	        for (int i = 0; i < data.size() - 1; i++) {
	            for (int j = 0; j < data.size() - 1 - i; j++) {
	                String nama1 = data.get(j).get(0);
	                String nama2 = data.get(j + 1).get(0);

	                if (nama1.compareToIgnoreCase(nama2) > 0) {
	                    // tukar posisi baris j dan j+1
	                    ArrayList<String> temp = data.get(j);
	                    data.set(j, data.get(j + 1));
	                    data.set(j + 1, temp);
	                }
	            }
	        }

	        // Output
	        String hasil = "Nama Lengkap | Alamat | No Telp\n\n";
	        for (ArrayList<String> baris : data) {
	            hasil += baris.get(0) + " | " + baris.get(1) + " | " + baris.get(2) + "\n";
	        }
	        JOptionPane.showMessageDialog(null, hasil);
	    }
	}

