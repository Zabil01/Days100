package days100;

import java.util.Scanner;

public class harike53 {
    public static void main(String[] args) {

        // membuat variabel dan Scanner
        String lampu;
        Scanner scanner = new Scanner(System.in);

        // mengambil input
        System.out.print("Inputkan nama warna: ");
        lampu = scanner.nextLine();

        switch(lampu){
            case "merah":
                System.out.println("Lampu merah, berhenti!");
                break;
            case "kuning":
                System.out.println("Lampu kuning, harap hati-hati!");
                break;
            case "hijau":
                System.out.println("Lampu hijau, silahkan jalan!");
                break;
            default:
                System.out.println("Warna lampu salah!");
        }
    }
}