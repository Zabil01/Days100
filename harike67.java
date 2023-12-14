package days100;

import java.util.Scanner;

public class harike67 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Masukkan bilangan:");
    int number = scanner.nextInt();

    System.out.println("Faktor prima dari " + number + " adalah:");

    int factor = 2;
    while (number > 1) {
      if (number % factor == 0) {
        System.out.println(factor);
        number /= factor;
      } else {
        factor++;
      }
    }
  }
}
