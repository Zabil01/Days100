package days100;

public class harike26 {
    public static void main(String[] args) {
        // Mendefinisikan dua kondisi
        boolean kondisi1 = true;
        boolean kondisi2 = false;

        // Operator Logika: AND
        boolean logikaAnd = kondisi1 && kondisi2; // Hasil akan benar jika kedua kondisi benar
        System.out.println("Logika AND: " + logikaAnd);

        // Mencetak hasil operator AND
        System.out.println("Kedua kondisi adalah true, hasil adalah " + (true && true));
        System.out.println("Salah satu kondisi adalah false, hasil adalah " + (true && false));
        System.out.println("Kedua kondisi adalah false, hasil adalah " + (false && false));
    }
}
