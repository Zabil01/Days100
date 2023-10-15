public class HariKe07 {
    public static void main(String[] args) {
        // Membuat array integer dengan panjang 5
        int[] angkaArray = new int[5];
        
        // Mengisi array dengan angka
        angkaArray[0] = 10;
        angkaArray[1] = 20;
        angkaArray[2] = 30;
        angkaArray[3] = 40;
        angkaArray[4] = 50;
        
        // Mencetak isi array
        for (int i = 0; i < angkaArray.length; i++) {
            System.out.println("Angka ke-" + i + ": " + angkaArray[i]);
        }
    }
}
