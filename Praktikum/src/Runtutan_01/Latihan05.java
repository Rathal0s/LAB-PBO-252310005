package Runtutan_01;

import java.util.Scanner;

public class Latihan05 {

	public static void main(String[] args) {
		String txt;
		String Convert;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukan Teks: ");
		txt = scanner.next();
		
		Convert = txt.toUpperCase();
		System.out.println("Teks yang telah dikonversi: " + Convert);
		

}
}
