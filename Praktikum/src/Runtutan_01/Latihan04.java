package Runtutan_01;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Latihan04 {
	  public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        Locale indo = new Locale("id", "ID");
	        NumberFormat rp = NumberFormat.getInstance(indo);

	     
	        Students myBio = new Students();

	        final String namaProduk = "ROTI ENAK";
	        final int hargaSatuan = 6300;

	        String garis = "======================================================";
	        String garisPutus = "------------------------------------------------------";

	        System.out.println(garis);
	        System.out.println("                 TOKO SERBAGUNA IBIK");
	        System.out.println(garis);

	        System.out.print("Masukan jumlah produk yang dibeli : ");
	        int qty = input.nextInt();
	        input.nextLine(); 

	        System.out.print("Masukan nama member               : ");
	        String namaInput = input.nextLine();
	        String memberName = myBio.getFullname(namaInput);

	      
	        Date sekarang = new Date();
	        SimpleDateFormat format = new SimpleDateFormat("dd MMM yyyy (HH:mm)", indo);
	        System.out.println(format.format(sekarang));

	  
	        int total = qty * hargaSatuan;
	        int diskonPersen = (qty / 3) * 5; 
	        double potongan = total * diskonPersen / 100.0;
	        double subTotal = total - potongan;

	      
	        System.out.println();
	        System.out.printf("%-14s %-5s %-12s %s%n", "ITEM", "QTY", "HARGA", "TOTAL");
	        System.out.println(garis);
	        System.out.printf("%-14s %-5d Rp %-9s Rp %s%n",
	                namaProduk, qty, rp.format(hargaSatuan) + ",-", rp.format(total));
	        System.out.println(garisPutus);
	        System.out.println("Diskon      : " + diskonPersen + "%");
	        System.out.println("Sub Total   : Rp " + rp.format(Math.round(subTotal)) + ",-");
	        System.out.println("Member Name : " + memberName);
	        System.out.println(garis);

	        input.close();
	    }
	}