package days100;

import java.util.Scanner;

public class harike33 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input dari pengguna
        Scanner inputScanner = new Scanner(System.in);

        // Meminta input data diri karyawan
        System.out.println("=== Pengisian Data Karyawan ===");
        System.out.print("Masukkan Nama: ");
        String nama = inputScanner.nextLine();

        System.out.print("Masukkan Usia: ");
        int usia = inputScanner.nextInt();
        inputScanner.nextLine(); // Membersihkan newline

        System.out.print("Masukkan Alamat: ");
        String alamat = inputScanner.nextLine();

        System.out.print("Masukkan Nomor Telepon: ");
        String nomorTelepon = inputScanner.nextLine();

        // Meminta input data gaji
        System.out.println("=== Pengisian Data Gaji ===");
        System.out.print("Masukkan Gaji Pokok: ");
        int gajiPokok = inputScanner.nextInt();

        System.out.print("Masukkan Tunjangan: ");
        int tunjangan = inputScanner.nextInt();

        // Menghitung total gaji
        int totalGaji = gajiPokok + tunjangan;

        // Menampilkan hasil
        System.out.println("\n=== Data Karyawan ===");
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Alamat: " + alamat);
        System.out.println("Nomor Telepon: " + nomorTelepon);

        System.out.println("\n=== Data Gaji ===");
        System.out.println("Gaji Pokok: Rp " + gajiPokok);
        System.out.println("Tunjangan: Rp " + tunjangan);
        System.out.println("Total Gaji: Rp " + totalGaji);
        
        inputScanner.close();
    }
}