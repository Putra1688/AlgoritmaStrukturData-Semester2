package Pertemuan5_BruteForceDivideConquer.src;
public class Sum23 {

    int elemen;
    double keuntungan[], total;
    
    Sum23(int elemen){
        this.elemen = elemen; // inisialisasi atributnya
        this.keuntungan = new double[elemen]; // instansiasi objek
        this.total = 0;
    }

    // kosntruktor default
    Sum23 () {

    }

    double totalBF(double arr[]){
        for (int i=0; i < elemen; i++ ){
            total = total + arr[i];
        }
        return total;
    }

    double totalDC(double arr[], int l, int r){
        if (l==r) {
            return arr[l];
        } else if ( l < r ){
            int mid = (l + r ) / 2;
            double lsum = totalDC(arr,l, mid );
            double rsum = totalDC(arr, mid+1, r);
            return lsum + rsum;
        }
        return 0;
    }
}

