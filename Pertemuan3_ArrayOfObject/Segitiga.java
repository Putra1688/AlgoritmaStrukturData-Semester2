package Pertemuan3_ArrayOfObject;

public class Segitiga {
    public int alas;
    public int tinggi;

    // Konstruktor
    public Segitiga (int a, int t){
        alas = a;
        tinggi = t;
    }
    // Methode hitung Luas
    public int hitungLuas(int a, int t){
        return (alas * tinggi) / 2;
    }
    // Methode hitung Keliling
    public int hitungKeliling(int a, int t){
        return alas + tinggi;
    }

    public static void main(String[] args) {
        Segitiga [] sgArray = new Segitiga[4];
        sgArray [0] = new Segitiga(10, 4);
        sgArray [1] = new Segitiga(20, 10);
        sgArray [2] = new Segitiga(15, 6);
        sgArray [3] = new Segitiga(25, 10);
    }
}
