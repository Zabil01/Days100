import java.util.Scanner;
   public class DayKelima {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.print("Masukkan nama Anda: ");
        String nama = inputScanner.nextLine();
        
        System.out.println("Halo, " + nama + "! Selamat datang di Java!");
        
        inputScanner.close();
    }
   }
