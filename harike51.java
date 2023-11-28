package days100;

import java.util.Scanner;

public class harike51 {

    public static void main(String[] args) {

        // membuat variabel dan Scanner
        int nilai;
        String nama;
        Scanner scanner = new Scanner(System.in);

        // mengambil input
        System.out.print("Nama: ");
        nama = scanner.nextLine();
        System.out.print("Nilai: ");
        nilai = scanner.nextInt();

        // cek hasil apakah lulus atau tidak
        if( nilai >= 50 ) {
            System.out.println("Selemat " + nama + ", anda lulus!");
        } else {
            System.out.println("Maaf " + nama + ", anda gagal");
        }

    }

}