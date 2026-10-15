package Runtutan_02;

import java.util.Scanner;

public class Latihan1 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	        System.out.print("Masukkan NPM: ");
	        long npm = input.nextLong();

	        boolean prima = true;

	        if (npm <= 1) {
	            prima = false;
	        } else {
	            for (long i = 2; i <= Math.sqrt(npm); i++) {
	                if (npm % i == 0) {
	                    prima = false;
	                    break;
	                }
	            }
	        }

	        if (prima) {
	            System.out.println("Termasuk bilangan PRIMA");
	        } else {
	            System.out.println(
	                "Bukan termasuk bilangan prima karena dapat dibagi dengan 2"
	            );
	        }
	    }
	}