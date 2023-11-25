package days100;

public class harike48 {
    public static void main(String[] args){ 
        
        //Deklarasi dan inisialisasi array:
        String[][] kontak = {{ "bahar","0852", }, {"saldi","0812"},{"addu ","0877"}};
        
        // Loop for untuk menampilkan informasi kontak:
        for(int x=0; x < kontak.length; x++){
            
            
            // Menampilkan nama dan nomor telepon:
           System.out.print("\nNama: " + kontak[x][0]);
           System.out.print("\nNomor: " + kontak[x][1]);
           System.out.print("-------------------");
        }
    }
}