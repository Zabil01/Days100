package days100;

import java.util.Scanner;

public class HariKe15 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.print("Masukkan angka pertama: ");
        double angka1 = inputScanner.nextDouble();
        
        System.out.print("Masukkan angka kedua: ");
        double angka2 = inputScanner.nextDouble();

        System.out.print("Masukkan angka ketiga: ");
        double angka3 = inputScanner.nextDouble();
        
        double terbesar = Math.max(angka1, Math.max(angka2, angka3));
        
        System.out.println("Angka terbesar adalah: " + terbesar);
        
        inputScanner.close();
    }
}
