package days100;
public class harike57 {
    public static void main(String[] args) {
        // Mendeklarasikan dan menginisialisasi array dua dimensi
        int[][] array2D = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Menampilkan isi array dua dimensi
        System.out.println("Isi Array 2D:");
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
