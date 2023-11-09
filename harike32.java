package days100;

public class harike32 {
    public static void main(String[] args) {
        // Deklarasi variabel
        int gajiPokok = 5000000;
        int tunjangan = 1000000;
        int bonus = 500000;
        int potongan = 750000;
        
        // Menghitung gaji bersih
        int gajiBersih = gajiPokok + tunjangan + bonus - potongan;
        
        // Menampilkan hasil
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Tunjangan: " + tunjangan);
        System.out.println("Bonus: " + bonus);
        System.out.println("Potongan: " + potongan);
        System.out.println("Gaji Bersih: " + gajiBersih);
    }
}