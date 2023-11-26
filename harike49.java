package days100;

import java.util.Scanner;

public class harike49 {

    public static void main(String[] args) {
        // deklarasi
        Double luas;
        int alas, tinggi;

        // mebuat scanner baru
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.println("== Menghitung luas Segitiga ==");
        System.out.print("Input alas: ");
        alas = scanner.nextInt();
        System.out.print("Input tinggi: ");
        tinggi = scanner.nextInt();

        // proses
        luas = Double.valueOf((alas * tinggi) / 2);

        // output
        System.out.println("Luas = " + luas);
    }
}