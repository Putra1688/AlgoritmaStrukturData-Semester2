package Pertemuan4_quiz;
import java.util.Scanner;
public class Latihan {

    // buat atribut dulu
    private int hasil;
    private int sisi;   // private hanya bisa diakses 1 class yang sama, public bisa diakses di semua class
    
    int hitung(int s){
        sisi = s;
         return hasil = s * s;
    } 

    void display(){
        System.out.println("Luas Persegi adalah: " +hasil);
    }   

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    // [ 1. akses objek kedalam setiap methode]    
        // Latihan persegi = new Latihan();
        // System.out.print("Masukkan sisi: ");  // ini apabila inputan
        // int ss = sc.nextInt();  // ini apabila inputan
        // persegi.hitung(ss);
        // persegi.display();

    // [2. instance array of object dan mengakses nilai objeknya]
        // manual
        Latihan persegi[] = new Latihan[2];
        persegi[0] = new Latihan(); // instansiasi per elemen untuk dijadikan objek
        persegi[0].sisi = 10 ;
        System.out.println("Luas pertama : " + persegi[0].hitung(persegi[0].sisi));
            /*  kesalahan instance karena perlemen belum dijadikan objek
            persegi[1].sisi = 12;
            System.out.println("Luas pertama : " + persegi[1].hitung(persegi[1].sisi));
            */
        
        // looping
        for (int i=0; i<persegi.length;i++){
            persegi[i] = new Latihan();
            System.out.print("Masukkan sisi: ");
            persegi[i].sisi = sc.nextInt();
            System.out.println("Luas ke-" + (i+1) + " : " + persegi[i].hitung(persegi[i].sisi));
        }
    }
}
