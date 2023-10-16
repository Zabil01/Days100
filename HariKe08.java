package days100;

import java.util.Scanner;

public class ke08 {
  public static void main(String[] args) {
    Scanner inputScanner = new Scanner(System.in);

    System.out.print("Masukkan teks: ");
    String teks = inputScanner.nextLine();

    System.out.println("Anda memasukkan teks: " + teks);

    inputScanner.close();
  }
}
