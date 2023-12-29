package days100;

public class harike82 {

    public static void main(String[] args) {
        int tahun = 2020;

        if ((tahun % 4 == 0 && tahun % 100 != 0) || tahun % 400 == 0) {
            System.out.println(tahun + " adalah tahun kabisat");
        } else {
            System.out.println(tahun + " bukan tahun kabisat");
        }
    }
}