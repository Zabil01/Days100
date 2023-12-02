package days100;
import java.util.Scanner;

public class harike55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat: ");
        int bilangan = scanner.nextInt();

        String kategori = (bilangan % 2 == 0) ? "Bilangan genap" : "Bilangan ganjil";

        System.out.println(kategori);
    }
}