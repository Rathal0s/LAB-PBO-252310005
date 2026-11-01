package Praktikum_4;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayListApp {
public static void main(String[] args) {
	ArrayList<String> nama = new ArrayList<String>();
	nama.add("Budog"); // input data
	System.out.println(nama.get(0));
	JOptionPane jop = new JOptionPane();
	nama.add(jop.showInputDialog(null, "Input Nama:"));
	jop.showMessageDialog(null, "Nama : " + nama.getLast());
	
	nama.remove(0);// menghapus
	System.out.println("Nama Setelah Dihapus: " + nama.get(0));
	
	//pertanyaan
//	System.out.println(nama.get(1));
	
	nama.add("Ade");
	nama.add("Anton");
	System.out.println("Nama List: ");
	for (int i = 0; i< nama.size(); i++) {
		System.out.println(nama.get(i));
	}
	nama.clear(); 
	System.out.println(nama.size());
	
}
}