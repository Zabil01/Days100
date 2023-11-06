package days100;

import java.util.Scanner;

public class harike29 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        // Meminta panjang kotak
        System.out.print("Masukkan panjang kotak: ");
        double panjang = inputScanner.nextDouble();

        // Meminta lebar kotak
        System.out.print("Masukkan lebar kotak: ");
        double lebar = inputScanner.nextDouble();

        // Menghitung luas kotak
        double luas = panjang * lebar;

        // Menampilkan hasil
        System.out.println("Luas kotak dengan panjang " + panjang + " dan lebar " + lebar + " adalah " + luas);

        inputScanner.close();
    }
}
