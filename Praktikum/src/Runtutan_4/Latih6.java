package Runtutan_4;

		
		import javax.swing.JOptionPane;

		public class Latih6 {
		    public static void main(String[] args) {
		        int[][] A = new int[2][2];
		        int[][] B = new int[2][2];

		        //  matrix A
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

	
		        String hasil = "Matrix A:\n";
		        for (int i = 0; i < 2; i++) {
		            hasil += "[ ";
		            for (int j = 0; j < 2; j++) {
		                hasil += A[i][j] + "   ";
		            }
		            hasil += "]\n";
		        }

		        hasil += "\nMatrix B:\n";
		        for (int i = 0; i < 2; i++) {
		            hasil += "[ ";
		            for (int j = 0; j < 2; j++) {
		                hasil += B[i][j] + "   ";
		            }
		            hasil += "]\n";
		        }

		        JOptionPane.showMessageDialog(null, hasil, "Output Matrix",
		            JOptionPane.INFORMATION_MESSAGE);
		    }
		}