package days100;


import java.util.Scanner;

public class HariKe13 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.print("Berapa usia Anda? ");
        int usia = inputScanner.nextInt();
        
        if (usia >= 18) {
            System.out.println("Anda boleh bergabung dengan ISC.");
        } else {
            System.out.println("Maaf, Anda belum bisa bergabung dengan ISC.");
        }
        
        inputScanner.close();
    }
}
