package Runtutan_01;

import java.util.Scanner;

public class Latihan03 {
    static double phi = 3.14;

 
    static double luasPermukaan(double r, double s) {
        double luas = phi * r * (r + s); 
        return luas;
    }

   
    static double luasSelimut(double r, double s) {
        double luas = phi * r * s; 
        return luas;
    }

    static double volumeKerucut(double r, double t) {
        double volume = (phi * r * r * t) / 3; 
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    
        double jariJari, garisPelukis, tinggi;

        System.out.print("Masukkan jari-jari kerucut: ");
        jariJari = input.nextDouble();

        System.out.print("Masukkan garis pelukis kerucut: ");
        garisPelukis = input.nextDouble();

        System.out.print("Masukkan tinggi kerucut: ");
        tinggi = input.nextDouble();

       
        double luas = luasPermukaan(jariJari, garisPelukis);
        double selimut = luasSelimut(jariJari, garisPelukis);
        double volume = volumeKerucut(jariJari, tinggi);

       
        System.out.println("Luas Permukaan : " + luas);
        System.out.println("Luas Selimut   : " + selimut);
        System.out.println("Volume         : " + volume);

        input.close();
    }
}
