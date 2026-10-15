package Runtutan_02;



import java.util.Scanner;

public class Latihan4 {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter the number of row:");
	        int n = input.nextInt();

	        int i = 1;
	        while (i <= 2 * n - 1) {
	            // k = jumlah bintang di kiri dan di kanan pada baris ini
	            int k;
	            if (i <= n) {
	                k = n - i + 1;      // setengah atas: berkurang
	            } else {
	                k = i - n + 1;      // setengah bawah: bertambah
	            }

	            // bintang kiri
	            int a = 1;
	            while (a <= k) {
	                System.out.print("* ");
	                a++;
	            }

	            // spasi tengah (2 kolom per pasang bintang yang hilang)
	            int b = 1;
	            while (b <= 2 * (n - k)) {
	                System.out.print("  ");
	                b++;
	            }

	            // bintang kanan
	            int c = 1;
	            while (c <= k) {
	                System.out.print("* ");
	                c++;
	            }

	            System.out.println();
	            i++;
	        }
	    }
	}

