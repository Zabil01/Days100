package days100;

import java.util.Scanner;

public class harike62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan usia: ");
        int usia = scanner.nextInt();

        String kategori;

        if (usia < 0) {
            kategori = "Usia tidak valid";
        } else if (usia <= 5) {
            kategori = "Balita";
        } else if (usia <= 12) {
            kategori = "Anak-anak";
        } else if (usia <= 20) {
            kategori = "Remaja";
        } else if (usia <= 59) {
            kategori = "Dewasa";
        } else {
            kategori = "Lansia";
        }

        System.out.println("Kategori usia: " + kategori);

        scanner.close();
    }
}