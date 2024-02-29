package Pertemuan3_ArrayOfObject.LatihanPraktikum;

public class LimasPersegi {
    public double sisi;
    public double tinggi;

    // Constructor 
    public LimasPersegi(double s, double t){
        sisi = s;
        tinggi = t;
    }

    // Methode Hitung Luas Permukaan
    public double luasPermukaaLimas (){
        return (sisi * sisi) + (4 * (sisi/2 * tinggi));
    }

    // Methode Hitung Volume Limas Persegi
    public double volumeLimas(){
        return ((sisi*sisi) * tinggi) / 3;
    }
}
