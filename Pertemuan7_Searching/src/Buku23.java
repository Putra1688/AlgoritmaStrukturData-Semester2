package Pertemuan7_Searching.src;

public class Buku23 {
    int kodeBuku;
    String judulBuku;
    int tahunTerbit;
    String pengarang;
    int stock; 

public Buku23 (int kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stock) {
    this.kodeBuku = kodeBuku;
    this.judulBuku = judulBuku;
    this.tahunTerbit = tahunTerbit;
    this.pengarang = pengarang;
    this.stock = stock;
}

public void tampilDataBuku(){
System.out.println("===========================");
System.out.println("Kode Buku : " + kodeBuku);
System.out.println("Judul Buku : "+judulBuku);
System.out.println("Tahun Terbit : " +tahunTerbit);
System.out.println("engarang : " +pengarang);
System.out.println("Stock : "+stock);   
}


}
