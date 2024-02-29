package Pertemuan3_ArrayOfObject.LatihanPraktikum;

public class Kerucut23 {
    public double jari_jari;
    public double selimut;
    public double tinggi;

    // Construktor
    public Kerucut23(double r, double s, double t){
        jari_jari = r;
        selimut = s;
        tinggi = t;
    }

    // Methode Hitung Luas Permukaan
    public double luasPermukaaKerucut () {
        return Math.PI * jari_jari * (jari_jari+selimut);
    }

    // Methode Hitung Volume Kerucut
    public double volumeKerucut (){
        return Math.PI * jari_jari * jari_jari * tinggi;
    }
}
