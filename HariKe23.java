package days100;

public class HariKe23 {
    public static void main(String[] args) {
        int batasAtas = 100;
        System.out.println("Bilangan prima antara 1 dan " + batasAtas + ":");
        
        for (int i = 2; i <= batasAtas; i++) {
            boolean isPrima = true;
            
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrima = false;
                    break;
                }
            }
            
            if (isPrima) {
                System.out.print(i + " ");
            }
        }
    }
}
