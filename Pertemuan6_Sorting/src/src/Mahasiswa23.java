package Pertemuan6_Sorting.src.src;

public class Mahasiswa23 {
    String nama;
    int thnMsk, umur;
    double ipk;

    Mahasiswa23 (String n, int t, int u, double i) {
        nama = n;
        thnMsk = t;
        umur = u;
        ipk = i;
    }

    void tampil (){
        System.out.println("Nama = " +nama);
        System.out.println("Tahun Masuk = " +thnMsk);
        System.out.println("Umur = " +umur);
        System.out.println("IPK = " +ipk);
    }
}
