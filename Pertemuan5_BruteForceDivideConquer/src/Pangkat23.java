package Pertemuan5_BruteForceDivideConquer.src;

public class Pangkat23 {
    public int nilai, pangkat;

    // Modifikasi = ditambahin konstruktor yang menerima nilai dan pangkat sebagai variabel
    public Pangkat23(int nilai, int pangkat) {
        this.nilai = nilai;
        this.pangkat = pangkat;
    }

    int pangkatBF(int a, int n){
        int hasil=1;
        for (int i=0; i < n ; i++){
            hasil *= a;
        }
        return hasil;
    }

    int pangkatDC(int a, int n){
        if (n==0){
            return 1;
        } else {
            if (n%2==1) {
                return ( pangkatDC(a, (n-1)/2) * pangkatDC(a, (n-1)/2) * a);
            } else {
                return (pangkatDC(a, n/2) * pangkatDC(a, n/2));
            }
        }
    }
}
