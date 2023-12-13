package days100;

import java.util.Scanner;

public class harike66 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();

        System.out.print("Masukkan angka ketiga: ");
        int angka3 = input.nextInt();

        boolean lulus = (angka1 >= 50 && angka2 >= 10 && angka3 >= 5);

        if (lulus) {
            System.out.println("Selamat, Anda lulus!");
        } else {
            System.out.println("Maaf, Anda belum lulus.");
        }
    }
}
