package Pertemuan7_Searching.src;
import java.util.Scanner;

public class MainBuku23 {
public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in); //int
    Scanner s1 = new Scanner(System.in); //String
    
    PencarianBuku23 data = new PencarianBuku23();
    int jumBuku = 3;

    System.out.println("------------------------------");
    System.out.println("Masukkan data Buku secara Urut dari KodeBuku terkecil");
    for (int i=0; i < jumBuku; i++) {
        System.out.println("------------------------------");
        System.out.print("Kode Buku \t: ");
        int kodeBuku = s.nextInt(); 
        System.out.print("Judul buku \t: ");
        String judulBuku = s1.nextLine();
        System.out.print("Tahun Terbit \t: ");
        int tahunTerbit = s.nextInt();
        System.out.print("Pengarang \t: ");
        String pengarang = s1.nextLine();
        System.out.print("Stock \t\t: ");
        int stock = s.nextInt();

        Buku23 m = new Buku23(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
        data.tambah(m);
    }

    System.out.println("--------------------------------");
    System.out.println( "Data keseluruhan Mahasisiswa: ");
    System.out.println("Data keseluruhan Buku : ");
    data.tampil();

System.out.print("___________________________________________");
System.out.println("___________________________________________");
System.out.println("Pencarian Data: ");
System.out.println("Masukkan Kode Buku yang dicari:");
System.out.print("Kode Buku : ");
int cari = s.nextInt();
System.out.println("menggunakan sequential Search");
int posisi = data.findSeqSearch(cari);

data.TampilPosisi(cari, posisi);
data.TampilData(cari, posisi);

System.out.println("\n=============================");
System.out.println("Menggunakan Binary Search");
posisi = data.FindBinarySearch(cari, 0, jumBuku - 1);
data.TampilPosisi(cari, posisi);
data.TampilData(cari, posisi);
}
}
