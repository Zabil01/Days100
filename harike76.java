package days100;

public class harike76 {

    public static void main(String[] args) {
        // Deklarasi variabel
        int n = 10;
        float a = 2;
        float r = 3;

        // Hitung deret geometri
        for (int i = 0; i < n; i++) {
            System.out.print(a * Math.pow(r, i) + " ");
        }
    }
}