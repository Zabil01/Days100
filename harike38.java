package days100;
public class harike38 {
    public static void main(String[] args) {
        // Menampilkan pesan sebanyak 5 kali menggunakan perulangan for
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ini adalah perulangan ke-" + i);
        }

        // Menampilkan pesan sebanyak 3 kali menggunakan perulangan while
        int j = 1;
        while (j <= 3) {
            System.out.println("Ini adalah perulangan lagi ke-" + j);
            j++;
        }

        // Menampilkan pesan sebanyak 4 kali menggunakan perulangan do-while
        int k = 1;
        do {
            System.out.println("Ini adalah perulangan lagi-lagi ke-" + k);
            k++;
        } while (k <= 4);
    }
}