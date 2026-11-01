package Praktikum_5;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList2D {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> angka = new ArrayList<>();
		angka.add(new ArrayList<Integer>()); //Nambahkan row
		
		angka.getLast() .add(10); // akses ke paling baru + menambah nilai
		
		angka.add(new ArrayList<Integer>(Arrays.asList(1,2,3))); //input langsung dengan array yang ada isinya
		
		
		//output satu
		System.out.println(angka.get(0).get(0));
		
		//output semua
		for (int i = 0; i < angka.size(); i++) {
			for (int j = 0; j < angka.get(i).size(); j++) {
					System.out.print(angka.get(i).get(j) + " ");
			}
			System.out.println();
		
	}


	}
	}
