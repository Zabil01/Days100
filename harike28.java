package days100;

import java.util.Scanner;

public class harike28 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Selamat datang di isc, sebelum bergabung di isc anda harus mengisi data diri!");
        System.out.print("Masukkan nama Anda: ");
        String nama = inputScanner.nextLine();

        System.out.print("Masukkan usia Anda: ");
        int usia = inputScanner.nextInt();
        inputScanner.nextLine();

        System.out.print("Masukkan alamat Anda: ");
        String alamat = inputScanner.nextLine();

        System.out.print("Masukkan nomor telepon Anda: ");
        int nomorTelepon = inputScanner.nextInt();

        System.out.println("Terima kasih, berikut adalah data diri Anda:");
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Alamat: " + alamat);
        System.out.println("Nomor Telepon: " + nomorTelepon);
        System.out.println("Selamat anda dapat bergabung di isc");
        

        inputScanner.close();
    }
}
