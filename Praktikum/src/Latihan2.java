import java.util.Scanner;


public class Latihan2 {
	public static void main(String[] args) {
		System.out.println("Program Menghitung Harga_Tanah");
			Tanah tanah = new Tanah();
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Masukan Luas:");
			tanah.Luas = scanner.nextInt();
			
			System.out.println("Total Tanah:" + tanah.getTotal()) ;
	}
}
