package days100;
public class harike40 {
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi
        int[] bilangan = {10, 5, 8, 20, 3};

        // Mencari nilai tertentu 
        int nilaiDicari = 6;
        boolean ditemukan = false;

        for (int bil : bilangan) {
            if (bil == nilaiDicari) {
                ditemukan = true;
                break;
            }
        }

        // Menampilkan hasil pencarian
        if (ditemukan) {
            System.out.println("Nilai " + nilaiDicari + " ditemukan.");
        } else {
            System.out.println("Nilai " + nilaiDicari + " tidak ditemukan.");
        }
    }
}