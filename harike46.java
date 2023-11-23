package days100;

import java.util.Scanner;

public class harike46 {

    public static void main(String[] args) {
        // deklarasi variabel
        String nama, alamat;
        int usia, gaji;

        // membuat scanner baru
        Scanner inputScanner = new Scanner(System.in);

        // Tampilkan output ke user
        System.out.println("==== Pendataan Karyawan ====");
        System.out.print("Nama karyawan: ");
        // menggunakan scanner dan menyimpan apa yang diketik di variabel nama
        nama = inputScanner.nextLine();
        // Tampilkan outpu lagi
        System.out.print("Alamat: ");
        // menggunakan scanner lagi
        alamat = inputScanner.nextLine();

        System.out.print("Usia: ");
        usia = inputScanner.nextInt();

        System.out.print("Gaji: ");
        gaji = inputScanner.nextInt();


        // Menampilkan apa yang sudah simpan di variabel
        System.out.println("\nNama Karyawan: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Gaji: Rp " + gaji);
    }

}