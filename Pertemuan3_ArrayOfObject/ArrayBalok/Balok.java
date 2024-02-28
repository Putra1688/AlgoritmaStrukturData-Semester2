package Pertemuan3_ArrayOfObject.ArrayBalok;

public class Balok {
    public int panjang;
    public int lebar;
    public int tinggi;

    public Balok(int p, int l, int t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public int HitungVolume(){
        return panjang * lebar * tinggi;
    }
}
