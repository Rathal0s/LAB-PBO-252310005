package Runtutan_5;


	import java.util.ArrayList;
	import javax.swing.JOptionPane;

	public class Latih02 {
	    public static void main(String[] args) {
	        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
	        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
	        ArrayList<ArrayList<Integer>> C = new ArrayList<>();

	     
	        for (int i = 0; i < 2; i++) {
	            A.add(new ArrayList<>());
	            for (int j = 0; j < 2; j++) {
	                String s = JOptionPane.showInputDialog("Matrix A [" + i + "][" + j + "]");
	                A.get(i).add(Integer.parseInt(s));
	            }
	        }

	        
	        for (int i = 0; i < 2; i++) {
	            B.add(new ArrayList<>());
	            for (int j = 0; j < 2; j++) {
	                String s = JOptionPane.showInputDialog("Matrix B [" + i + "][" + j + "]");
	                B.get(i).add(Integer.parseInt(s));
	            }
	        }

	        // C = A * B
	        for (int i = 0; i < 2; i++) {
	            C.add(new ArrayList<>());
	            for (int j = 0; j < 2; j++) {
	                int total = 0;
	                for (int k = 0; k < 2; k++) {
	                    total += A.get(i).get(k) * B.get(k).get(j);
	                }
	                C.get(i).add(total);
	            }
	        }

	   
	        String hasil = "Matrix C = A * B\n";
	        for (int i = 0; i < 2; i++) {
	            hasil += C.get(i).get(0) + "   " + C.get(i).get(1) + "\n";
	        }
	        JOptionPane.showMessageDialog(null, hasil);
	    }
	}

