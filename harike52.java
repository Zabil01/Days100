package days100
 
import java.util.Scanner;

public class harike52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat array string
        String[] arrayString = new String[5];
        int stringCount = 0;

        // Membuat array angka
        int[] arrayAngka = new int[5];
        int angkaCount = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan input: ");
            if (scanner.hasNextInt()) {
                // Jika inputan berupa angka
                int angka = scanner.nextInt();
                arrayAngka[angkaCount] = angka;
                angkaCount++;
            } else {
                // Jika inputan berupa string
                String input = scanner.next();
                arrayString[stringCount] = input;
                stringCount++;
            }
        }

        // Menampilkan array string
        System.out.println("Array String:");
        for (int i = 0; i < stringCount; i++) {
            System.out.println(arrayString[i]);
        }

        // Menampilkan array angka
        System.out.println("Array Angka:");
        for (int i = 0; i < angkaCount; i++) {
            System.out.println(arrayAngka[i]);
        }
    }
}