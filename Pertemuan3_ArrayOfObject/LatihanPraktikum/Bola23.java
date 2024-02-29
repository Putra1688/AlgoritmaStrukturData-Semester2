package Pertemuan3_ArrayOfObject.LatihanPraktikum;

public class Bola23 {
    public double jari_jari;

    // Constructor
    public Bola23(double r){
        jari_jari = r;
    }
        
    // Hitung Luas Permukaan Bola
    public double luasPermukaaBola () {
        return Math.PI * 4 * jari_jari * jari_jari;
    }

    // Hitung Volume Bola
    public double volumeBola (){
        return Math.PI * jari_jari * jari_jari * jari_jari * 4 / 3;
    }
}
