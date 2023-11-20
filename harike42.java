package days100;
import java.util.Scanner;

public class harike42{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Masukkan nilai: ");
        int nilai = scanner.nextInt();

        
        if (nilai >= 90 && nilai <= 100) {
            System.out.println("Grade: A");
            System.out.println("Pertahankan prestasi Anda!");
        } else if (nilai >= 80 && nilai < 90) {
            System.out.println("Grade: B");
            System.out.println("Anda telah melakukan dengan baik.");
        } else if (nilai >= 70 && nilai < 80) {
            System.out.println("Grade: C");
            System.out.println("Perbaiki lagi prestasi Anda.");
        } else if (nilai >= 60 && nilai < 70) {
            System.out.println("Grade: D");
            System.out.println("Perlu usaha lebih keras.");
        } else if (nilai >= 0 && nilai < 60) {
            System.out.println("Grade: E");
            System.out.println("Anda perlu belajar lebih giat lagi.");
        } else {
            System.out.println("Input nilai tidak valid. Harap masukkan nilai antara 0 dan 100.");
        }
        
        scanner.close();
    }
}