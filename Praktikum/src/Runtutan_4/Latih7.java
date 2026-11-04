package Runtutan_4;


	import javax.swing.JOptionPane;

		public class Latih7 {
		    public static void main(String[] args) {
		        int[][] A = new int[2][2];
		        int[][] B = new int[2][2];
		        int[][] C = new int[2][2];

		        // matrix A
		        for (int i = 0; i < 2; i++) {
		            for (int j = 0; j < 2; j++) {
		                A[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null,
		                    "Masukan nilai A[" + i + "][" + j + "]:", "Matrix A",
		                    JOptionPane.QUESTION_MESSAGE));
		            }
		        }

		        //  matrix B
		        for (int i = 0; i < 2; i++) {
		            for (int j = 0; j < 2; j++) {
		                B[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null,
		                    "Masukan nilai B[" + i + "][" + j + "]:", "Matrix B",
		                    JOptionPane.QUESTION_MESSAGE));
		            }
		        }

		        // matrix C 
		        for (int i = 0; i < 2; i++) {
		            for (int j = 0; j < 2; j++) {
		                C[i][j] = A[i][j] + B[i][j];
		            }
		        }

		     
		        String hasil = "Matrix C = A + B\n\n";
		        for (int i = 0; i < 2; i++) {
		            hasil += "[ ";
		            for (int j = 0; j < 2; j++) {
		                hasil += C[i][j] + "   ";
		            }
		            hasil += "]\n";
		        }

		        JOptionPane.showMessageDialog(null, hasil, "Output Matrix C",
		            JOptionPane.INFORMATION_MESSAGE);
		    }
		}