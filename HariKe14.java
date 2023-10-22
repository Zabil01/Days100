package days100;

import java.util.Scanner;

public class HariKe14 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Masukkan panjang alas segitiga: ");
        double alas = inputScanner.nextDouble();

        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = inputScanner.nextDouble();

        double luas = 0.5 * alas * tinggi;

        System.out.println("Luas segitiga adalah: " + luas);

        inputScanner.close();
    }
}
