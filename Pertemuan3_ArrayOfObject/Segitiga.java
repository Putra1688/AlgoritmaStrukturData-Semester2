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
    public double hitungKeliling(int a, int t, double sisimiring){
        sisimiring = Math.sqrt((a*a) +  (t*t));
        int x =  alas + tinggi;
        double y = (double) x;
        return y + sisimiring;
    }

    public static void main(String[] args) {
        Segitiga [] sgArray = new Segitiga[4];
        sgArray [0] = new Segitiga(10, 4);
        sgArray [1] = new Segitiga(20, 10);
        sgArray [2] = new Segitiga(15, 6);
        sgArray [3] = new Segitiga(25, 10);

        for (int i=0; i<sgArray.length; i++){
            System.out.println("Luas Segitiga ke-"+i+ " : " + sgArray[i].hitungLuas(i, i));
        }
        for (int i=0; i<sgArray.length; i++){
        System.out.println("Keliling Segitiga ke-"+i+ " : " + sgArray[i].hitungKeliling(i, i, i));
        }
    }
}
