package Runtutan_01;

import java.util.Scanner;

public class SUHU {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double Celcius;
		double fahrenheit;
		double reamur;
		double kelvin;
		
		System.out.println("Masukan Nilai Celsius: ");
		Celcius = scanner.nextDouble();
		
		fahrenheit = (Celcius * 9 / 5) + 32;
        reamur = Celcius * 4 / 5;
        kelvin = Celcius + 273.15;
        
        System.out.println("Suhu Konversi Fahrenheit adalah: " +fahrenheit);
        System.out.println("Suhu Konversi Reamur adalah: " +reamur);
        System.out.println("Suhu Konversi Kelvin adalah: " +kelvin);
	}

}
