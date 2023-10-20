package days100;

import java.util.Scanner;

public class HariKe12 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Masukkan string pertama: ");
        String stringPertama = inputScanner.nextLine();

        System.out.print("Masukkan string kedua: ");
        String stringKedua = inputScanner.nextLine();

        String gabung = stringPertama + " " + stringKedua;

        System.out.println("Hasil penggabungan: " + gabung);

        inputScanner.close();
    }
}
