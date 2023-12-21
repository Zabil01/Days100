package days100;

import java.util.Scanner;

public class harike74 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan total belanja: ");
        double totalBelanja = scanner.nextDouble();

        System.out.print("Masukkan jumlah item: ");
        int jumlahItem = scanner.nextInt();

        // Syarat diskon: total belanja di atas 50 dan jumlah item minimal 3
        boolean syaratDiskon = totalBelanja > 50 && jumlahItem >= 3;

        if (syaratDiskon) {
            System.out.println("Selamat, Anda mendapatkan diskon!");
        } else {
            System.out.println("Maaf, Anda tidak memenuhi syarat untuk diskon.");
        }
    }
}
