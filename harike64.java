package days100;

import java.util.Scanner;

public class harike64 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int number;
    int sum = 0;

    do {
      System.out.println("Masukkan angka: ");
      number = input.nextInt();
      sum += number;
    } while (number != 0);

    System.out.println("Hasil penjumlahan: " + sum);
  }
}
