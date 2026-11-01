package Runtutan_5;


	import java.util.ArrayList;
	import javax.swing.JOptionPane;

	public class Latih03 {
	    public static void main(String[] args) {
	        ArrayList<ArrayList<String>> data = new ArrayList<>();

	        // Input data 
	        for (int i = 0; i < 3; i++) {
	            data.add(new ArrayList<>());
	            data.get(i).add(JOptionPane.showInputDialog("Nama Lengkap orang ke-" + (i + 1)));
	            data.get(i).add(JOptionPane.showInputDialog("Alamat orang ke-" + (i + 1)));
	            data.get(i).add(JOptionPane.showInputDialog("No Telp orang ke-" + (i + 1)));
	        }

	       
	        String hasil = "Nama Lengkap | Alamat | No Telp\n\n";
	        for (ArrayList<String> baris : data) {
	            hasil += baris.get(0) + " | " + baris.get(1) + " | " + baris.get(2) + "\n";
	        }
	        JOptionPane.showMessageDialog(null, hasil);
	    }
	}

