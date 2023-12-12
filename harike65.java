package days100;

import java.util.Scanner;

public class harike65 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        int n;
        int total = 0;

        // Meminta penggua untuk memasukkan nilai n
        System.out.print("Masukkan nilai n: ");
        n = input.nextInt();

        // Perulangan do while
        do {
            // Hitung total
            total += n;

            // Cetak nilai n
            System.out.println("n = " + n);

            // Perbarui nilai n
            n--;
        } while (n > 0);

        // Cetak total
        System.out.println("Total = " + total);
    }
}
