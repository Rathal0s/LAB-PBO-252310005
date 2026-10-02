import java.util.Scanner;

public class Balok {
	public static void main(String[] args) {
		System.out.println("Program Menghitung Volume Balok");
			Balok balok = new Balok();
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Masukan Panjang Balok:");
			balok.panjang = scanner.nextInt();
			
			System.out.println("Masukan Lebar Balok:");
			balok.lebar = scanner.nextInt();
			
			System.out.println("Masukan Tinggi Balok:");
			balok.tinggi = scanner.nextInt();
			
			System.out.println("Volume dari balok:" + balok.getVolume());
	}
}
