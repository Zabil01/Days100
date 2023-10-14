import java.util.Scanner;

public class HariKe06 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.print("Masukkan angka pertama: ");
        int angka1 = inputScanner.nextInt();
        
        System.out.print("Masukkan angka kedua: ");
        int angka2 = inputScanner.nextInt();
        
        int hasil = angka1 + angka2;
        
        System.out.println("Hasil penjumlahan: " + hasil);
        
        inputScanner.close();
    }
}
