
public class ArrayApp {

}


import java.util.Scanner;

public class ArrayApp {
	public static void main(String[] args) {
		String[] nama = new String[4];
		nama[0] = "Sajidah"; //cara input
		System.out.println(nama[0]); //cara output
		System.out.println(nama[1]); //tes output (hasilnya null karena udah ditentuin di array isinya 4 jadi kalo di data yang gaada ya isinya null)
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input Nama: ");
		nama[1] = scanner.nextLine();
		System.out.println("Nama yang dioutput: " + nama[1]); 
		
		for (int i = 0; i < 4; i++) {
			
		}
	}
}