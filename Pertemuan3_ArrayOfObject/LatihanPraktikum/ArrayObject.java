package Pertemuan3_ArrayOfObject.LatihanPraktikum;

import java.util.Scanner;

import Pertemuan3_ArrayOfObject.PersegiPanjang23;
public class ArrayObject {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Looping Kerucut
        int kc;
        System.out.print("Masukkan jumlah kerucut yang ingin dihitung: ");
        kc = sc.nextInt();
        
        Kerucut23 [] kerucutArray = new Kerucut23[kc];

        for (int i=0; i < kerucutArray.length;i++){
            kerucutArray[i] = new Kerucut23(i, kc, i);
            System.out.println("Kerucut ke-"+(i+1));
            System.out.print("Masukkan jari-jari: ");
            kerucutArray[i].jari_jari = sc.nextInt();
            System.out.print("Masukkan sisi selimut: ");
            kerucutArray[i].selimut = sc.nextInt();
            System.out.print("Masukkan tinggi: ");
            kerucutArray[i].tinggi = sc.nextInt();
        }

        for (int i=0;i<kerucutArray.length;i++){
            System.out.println("Kerucut yang ke-"+(i+1));
            System.out.println("Luas Permukaan : "+ kerucutArray[i].luasPermukaaKerucut());
            System.out.println("Volume Kerucut : "+ kerucutArray[i].volumeKerucut());
        }
        
        System.out.println("\n");
        // Looping Limas Persegi
        int p;
        System.out.print("Masukkan jumlah Limas Persegi yang ingin dihitung: ");
        p = sc.nextInt();
        
        LimasPersegi [] limasArray = new LimasPersegi[p];

        for (int i=0; i < limasArray.length;i++){
            limasArray[i] = new LimasPersegi(p, i);
            System.out.println("Limas ke-"+(i+1));
            System.out.print("Masukkan sisi : ");
            limasArray[i].sisi = sc.nextInt();
            System.out.print("Masukkan tinggi: ");
            limasArray[i].tinggi = sc.nextInt();
        }

        for (int i=0;i<limasArray.length;i++){
            System.out.println("Limas Persegi yang ke-"+(i+1));
            System.out.println("Luas Permukaan : "+ limasArray[i].luasPermukaaLimas());
            System.out.println("Volume Kerucut : "+ limasArray[i].volumeLimas());
        }

        System.out.println("\n");
        // Looping Bola
        int bola;
        System.out.print("Masukkan jumlah Limas Persegi yang ingin dihitung: ");
        bola = sc.nextInt();
        
        Bola23 [] bolaArray = new Bola23[bola];

        for (int i=0; i < bolaArray.length;i++){
            bolaArray[i] = new Bola23(i);
            System.out.println("Bola ke-"+(i+1));
            System.out.print("Masukkan jari -jari : ");
            bolaArray[i].jari_jari = sc.nextInt();
           
        }

        for (int i=0;i<bolaArray.length;i++){
            System.out.println("Bola yang ke-"+(i+1));
            System.out.println("Luas Permukaan : "+ bolaArray[i].luasPermukaaBola());
            System.out.println("Volume Kerucut : "+ bolaArray[i].volumeBola());
        }
    }
}
