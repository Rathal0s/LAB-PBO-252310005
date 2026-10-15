package Praktikum_2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int a;
		int b;
		int c;
		
		System.out.println("Masukan Nilai A: ");
		a = scanner.nextInt();
		
		System.out.println("Masukin Nilai B:");
		b = scanner.nextInt();
		
		System.out.println("Masukin Nilai C:");
		c = scanner.nextInt();
		
		
		Segitiga segitiga = new Segitiga(a, b ,c);
		if (a*a + b*b == c*c) {
			System.out.println("Keren");
		} else { System.out.println("Salah");
		
			

	}

	}
}
