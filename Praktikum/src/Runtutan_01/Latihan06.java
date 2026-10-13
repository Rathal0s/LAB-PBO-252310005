package Runtutan_01;

import java.util.Scanner;

public class Latihan06 {

	public static void main(String[] args) {
	int usia;
	String FirstName;
	String LastName;
	int npm;
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Masukan Usia: ");
	usia = scanner.nextInt();
	
	System.out.println("Masukan FirstName: ");
	FirstName = scanner.next();
	
	System.out.println("Masukan LasttName: ");
	LastName = scanner.next();
	
	System.out.println("Masukan NPM: ");
	npm = scanner.nextInt();
	
	System.out.println("Hasil Concat: " + usia + FirstName + LastName + npm );
	
	}

}
