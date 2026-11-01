package Runtutan_5;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Latih01 {
	
	    public static void main(String[] args) {
	        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
	        ArrayList<ArrayList<Integer>> B = new ArrayList<>();

	        // Input matrix A
	        for (int i = 0; i < 2; i++) {
	            A.add(new ArrayList<>());
	            for (int j = 0; j < 2; j++) {
	                String s = JOptionPane.showInputDialog("Matrix A [" + i + "][" + j + "]");
	                A.get(i).add(Integer.parseInt(s));
	            }
	        }

	        // Input matrix B
	        for (int i = 0; i < 2; i++) {
	            B.add(new ArrayList<>());
	            for (int j = 0; j < 2; j++) {
	                String s = JOptionPane.showInputDialog("Matrix B [" + i + "][" + j + "]");
	                B.get(i).add(Integer.parseInt(s));
	            }
	        }

	   
	
	        String hasil = "Matrix A:\n";
	        for (int i = 0; i < 2; i++) {
	            hasil += A.get(i).get(0) + "   " + A.get(i).get(1) + "\n";
	        }

	        hasil += "\nMatrix B:\n";
	        for (int i = 0; i < 2; i++) {
	            hasil += B.get(i).get(0) + "   " + B.get(i).get(1) + "\n";
	        }

	        JOptionPane.showMessageDialog(null, hasil);

	}
}


