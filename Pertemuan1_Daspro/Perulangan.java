package Pertemuan1_Daspro;
import java.util.Scanner;
public class Perulangan {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String nim;

        System.out.print("Masukkan NIM : ");
        nim = sc.nextLine();
        System.out.println("==========================");

            String duaDigitString = nim.substring(nim.length() - 2);
            int n = Integer.parseInt(duaDigitString);
        
        if (n<10) {
            n +=10;
        System.out.println("Syarat perulangan: " +n);
        for (int i = 1; i < n; i++) {
            if (i==6 || i==10) {
                continue;
            } else if ( i % 2 == 0){
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        } 
        } else {
        System.out.println("Syarat perulangan: " +n);
        for (int i = 1; i < n; i++) {
            if (i==6 || i==10) {
                continue;
            } else if ( i % 2 == 0){
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }
    }
    }
}

