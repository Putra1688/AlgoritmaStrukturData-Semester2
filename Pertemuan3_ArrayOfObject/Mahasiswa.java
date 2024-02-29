package Pertemuan3_ArrayOfObject; 

import java.util.Scanner;
public class Mahasiswa {
    public String nama, nim;
    public char kelamin;
    public double ipk;

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        Mahasiswa [] data = new Mahasiswa[3];
        for (int i=0; i < data.length; i++){
            data[i] = new Mahasiswa();
            System.out.println("Masukkan data Mahasiswa ke-"+ (i+1));
            System.out.print("Masukkan nama: ");
            data[i].nama = input.nextLine();
            System.out.print("Masukkan NIM: ");
            data[i].nim = input.nextLine();
            System.out.print("Masukkan jenis kelamin (l/p): ");
            data[i].kelamin = input.next().charAt(0);
            System.out.print("Masukkan IPK: ");
            data[i].ipk = input.nextDouble();
            input.nextLine();
        }

        System.out.println("\n");
        for (int i=0; i<data.length; i++){
            System.out.println("Data Mahasiswa ke-" + (i+1));
            System.out.println("Nama     : " +data[i].nama);
            System.out.println("NIM      : " +data[i].nim);
            System.out.println("Kelamin  : " +data[i].kelamin);
            System.out.println("Nilai    : " + data[i].ipk);
        }

        // Memanggil metode HitungRataIPK
        double rataIpk = data[0].HitungRataIPK(data);
        System.out.println("\nRata-rata IPK: " + rataIpk);

        // Memanggil metode TampilMhsIpkTertinggi
        data[0].TampilMhsIpkTertinggi(data);
    }

    double HitungRataIPK(Mahasiswa[] mhsArr) {
        double totalIpk = 0;
    
        for (Mahasiswa mhs : mhsArr) {
            totalIpk += mhs.ipk;
        }
    
        return totalIpk / mhsArr.length;
    }
    
    void TampilMhsIpkTertinggi(Mahasiswa[] mhsArr) {
        double ipkTertinggi = 0;
        Mahasiswa mhsIpkTertinggi = null;
    
        for (Mahasiswa mhs : mhsArr) {
            if (mhs.ipk > ipkTertinggi) {
                ipkTertinggi = mhs.ipk;
                mhsIpkTertinggi = mhs;
            }
        }
    
        System.out.println("\nData Mahasiswa dengan IPK Tertinggi:");
        System.out.println("Nama: " + mhsIpkTertinggi.nama);
        System.out.println("NIM: " + mhsIpkTertinggi.nim);
        System.out.println("Jenis Kelamin: " + mhsIpkTertinggi.kelamin);
        System.out.println("Nilai IPK: " + mhsIpkTertinggi.ipk);
    }
}