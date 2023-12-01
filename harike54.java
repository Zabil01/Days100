package days100;

import java.util.Scanner;

public class harike54 {
    public static void main(String[] args) {

        // membuat variabel dan scanner
        int nilai;
        String grade;
        Scanner scanner = new Scanner(System.in);

        // mengambil input
        System.out.print("Inputkan nilai: ");
        nilai = scanner.nextInt();

        // mengitung grade
        if ( nilai >= 90 ) {
            grade = "A";
        } else if ( nilai >= 80 ){
            grade = "B+";
        } else if ( nilai >= 70 ){
            grade = "B";
        } else if ( nilai >= 60 ){
            grade = "C+";
        } else if ( nilai >= 50 ){
            grade = "C";
        } else if ( nilai >= 40 ){
            grade = "D";
        } else {
            grade = "E";
        }

        // mencetak hasil
        System.out.println("Grade: " + grade);
    }
}