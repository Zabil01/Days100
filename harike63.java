package days100;

import java.util.Scanner;

public class harike63 {

    public static void main(String[] args) {
        
        // Deklarasi variabel
        int a, b;

        // Buat objek Scanner
        Scanner input = new Scanner(System.in);

        // Input nilai untuk variabel a dan b
        System.out.print("Masukkan nilai a: ");
        a = input.nextInt();
        System.out.print("Masukkan nilai b: ");
        b = input.nextInt();

        // Operasi aritmatika
        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;

        // Tampilkan hasil operasi aritmatika
        System.out.println("a + b = " + c);
        System.out.println("a - b = " + d);
        System.out.println("a * b = " + e);
        System.out.println("a / b = " + f);
    }
}