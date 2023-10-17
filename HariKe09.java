package days100;

import java.util.Scanner;

public class HariKe09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan pertama (a): ");
        int a = input.nextInt();
        System.out.print("Masukkan bilangan kedua (b): ");
        int b = input.nextInt();
        
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        
        System.out.println("Nilai MIN: " + min);
        System.out.println("Nilai MAX: " + max);
        
        input.close();
    }
}
