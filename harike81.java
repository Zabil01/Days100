package days100;

public class harike81 {

    public static void main(String[] args) {
        // Deklarasi variabel
        int x = 100;

        // Cari bilangan prima terdekat
        int prima = 0;
        for (int i = x; i >= 2; i--) {
            if (prima == 0) {
                if (isPrima(i)) {
                    prima = i;
                }
            } else {
                if (isPrima(i - 1)) {
                    prima = i - 1;
                    break;
                }
            }
        }

        // Tampilkan bilangan prima terdekat
        System.out.println("Bilangan prima terdekat dari " + x + " adalah " + prima);
    }

    private static boolean isPrima(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}