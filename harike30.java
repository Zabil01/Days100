package days100;

public class harike30 {
    public static void main(String[] args) {
        int hari = 25;
        int Gajikotor = 1200000;
        int makan = 15000;
        int total1 = hari * Gajikotor;
        int total2 = hari * makan;
        int total3 = total1 - total2;
        

        System.out.println("Jumlah Hari Kerja  :"+hari+ "Hari");
        System.out.println("Gaji Perhari       :"+Gajikotor);
        System.out.println("Uang Makan Perhari :" +makan);
        System.out.println("Gaji Kotor         :"+total1);
        System.out.println("Total Uang Makan   :"+total2);
        System.out.println("Gaji Bersih        :"+total3);
    }
}