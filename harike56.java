package days100;

import java.util.Scanner;

public class harike56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan nilai pertama: ");
        int nilai1 = scanner.nextInt();

        System.out.print("Masukkan nilai kedua: ");
        int nilai2 = scanner.nextInt();

        // Operator logika AND
        boolean hasil = (nilai1 > 0) && (nilai2 < 20);

        // Menampilkan hasil
        System.out.println("Apakah nilai 1 lebih dari 0 DAN nilai 2 kurang dari 20? " + hasil);

        scanner.close();
    }
}
