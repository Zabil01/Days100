package days100;

import java.util.Scanner;

public class harike50 {

    public static void main(String[] args) {

        // membuat variabel belanja dan scanner
        int belanja = 0;
        Scanner scanner = new Scanner(System.in);

        // mengambil input
        System.out.print("Total Belanjaan: Rp ");
        belanja = scanner.nextInt();

        // cek apakah dia belanja di atas 50000
        if ( belanja > 50000 ) {
            System.out.println("Selamat, anda mendapatkan hadiah!");
        }

        System.out.println("Terima kasih...");

    }

}