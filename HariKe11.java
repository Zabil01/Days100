package days100;

import java.util.Scanner;

public class hari11 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.print("Masukkan nama Anda: ");
        String nama = inputScanner.nextLine();
        
        System.out.println("Halo saya " + nama + " Saya adalah mahasiswa universitas sulawesi barat");
        
        inputScanner.close();
    }
}
