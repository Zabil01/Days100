package days100;

public class harike79 {
    public static void main(String[] args) {
        int[] angka = {3, 2, 8, 7, 9};

        int nilaiMax = angka[0];
        int nilaiMin = angka[0];

        for (int i = 1; i < angka.length; i++) {
            if (angka[i] > nilaiMax) {
                nilaiMax = angka[i];
            }
            if (angka[i] < nilaiMin) {
                nilaiMin = angka[i];
            }
        }

        System.out.println("Nilai maksimum: " + nilaiMax);
        System.out.println("Nilai minimum: " + nilaiMin);
    }
    
}