package mataUang;

import java.util.Scanner;

public class Konversi {
	 public static void main(String[] args) {
	        Scanner masukan = new Scanner(System.in);
	        float rupiah, dolar;
	        System.out.print("Masukan Rupiah = ");
	        
	        
	        rupiah = masukan.nextFloat();
	        dolar = masukan.nextFloat();
	        
	        rupiah = (float) (dolar*14000);
	        dolar = (float) (rupiah*14000);
	        
	        System.out.println();
	        System.out.println("Hasil Kurs = ");
	        System.out.println("Dolar = " + dolar);
	        System.out.println("rupiah = " + rupiah);
	        
	    }
}
