package days100;

import java.util.Scanner;

public class harike86 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka n: ");
        int n = scanner.nextInt();

        int i = 1;  // Penghitung luar
        while (i <= n) {
            int j = i;  // Penghitung dalam, dimulai dari i
            while (j > 0) {
                System.out.print(j + " ");  // Cetak angka dari i ke 1
                j--;
            }
            System.out.println();  // Pindah baris
            i++;
        }
    }
}
