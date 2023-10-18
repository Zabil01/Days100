package days100;

import java.util.Scanner;

public class HariKe10 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.print("Berapa usia Anda? ");
        int usia = inputScanner.nextInt();
        
        if (usia >= 18) {
            System.out.println("Anda sudah cukup umur.");
        } else {
            System.out.println("Anda belum cukup umur.");
        }
        
        inputScanner.close();
    }
}
