package days100;

import java.util.Scanner;

public class HariKe24 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat positif: ");
        int bilangan = inputScanner.nextInt();

        int faktorial = 1;
        int angka = 1;

        while (angka <= bilangan) {
            faktorial *= angka;
            angka++;
        }

        System.out.println(bilangan + "! = " + faktorial);

        inputScanner.close();
    }
}
