package Praktikum_5;

public class Array2D {
	public static void main(String[] args) {
		int x =3;
		int y = 3;
		
		int [][] angka = new int[3][3]; //declare
		angka[1][2] = 6; //cara akses array 2d
		//output
		
		System.out.println(angka [1][2]);
		angka[1][2] = 12; //ganti nilai
		
		
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
					System.out.print(angka[i][j] + " ");
					
			}
			System.out.println();
		}
	}

}
