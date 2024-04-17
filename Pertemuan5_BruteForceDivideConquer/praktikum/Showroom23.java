package Pertemuan5_BruteForceDivideConquer.praktikum;

public class Showroom23 {
    String merk, tipe;
    int tahun, top_A, top_P;

    Showroom23 (String merk, String tipe, int tahun, int top_A, int top_P) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.top_A = top_A;
        this.top_P = top_P;
    }

    public static void main(String[] args) {
        // instance array of object
        Showroom23 [] data = new Showroom23[8];

        data[0] = new Showroom23("BMW", "M2 Coupe", 2016, 6816, 728);
        data[1] = new Showroom23("FORD", "Fiesta ST", 2014, 3921, 575);
        data[2] = new Showroom23("Nissan", "370Z", 2009, 4360, 657);
        data[3] = new Showroom23("Subaru", "BRZ", 2014, 4058, 609);
        data[4] = new Showroom23("Subaru", "Impreza WRX STI", 2013, 6255, 703);
        data[5] = new Showroom23("Toyota", "AE86 Trueno", 1986, 3700, 553);
        data[6] = new Showroom23("Toyota", "86/GT86", 2014, 4180, 609);
        data[7] = new Showroom23("Volkswagen", "Golf GTI", 2014, 4180, 631);
    
        // Data top_acceleration
        int[] topAcceleration = new int[data.length];
        for (int i = 0; i < topAcceleration.length; i++) {
            topAcceleration[i] = data[i].top_A;
        }

        // Data top_power
        int[] topPower = new int[data.length];
        for (int i = 0; i < topPower.length; i++) {
            topPower[i] = data[i].top_P;
        }

        // Proses output
        System.out.println(
            "Top Acceleration tertinggi (DIVIDE AND CONQUER): " + cariTopAccelerationTertinggi(topAcceleration, 0, topAcceleration.length - 1) + "\n" +
            "Top Acceleration terendah (DIVIDE AND CONQUER): " + cariTopAccelerationTerendah(topAcceleration, 0, topAcceleration.length - 1) + "\n" +
            "Rata-rata top power (BRUTE FORCE) : " + hitungRataRataTopPower(topPower)
        );
    }

    
    static int cariTopAccelerationTertinggi(int topAccelera[], int l, int r) {
        if (l == r) {
            return topAccelera[l];
        } else {
            int mid = (l + r) / 2;
            int lTop = cariTopAccelerationTertinggi(topAccelera, l, mid);
            int rTop = cariTopAccelerationTertinggi(topAccelera, mid + 1, r);
            if (lTop > rTop) {
                return lTop;
            } else {
                return rTop;
            }
        }
    }

    static int cariTopAccelerationTerendah(int topAccelera[], int l, int r) {
        if (l == r) {
            return topAccelera[l];
        } else {
            int mid = (l + r) / 2;
            int lTop = cariTopAccelerationTerendah(topAccelera, l, mid);
            int rTop = cariTopAccelerationTerendah(topAccelera, mid + 1, r);
            if (lTop < rTop) {
                return lTop;
            } else {
                return  rTop;
            }
        }
    }

    static double hitungRataRataTopPower(int topPower[]) {
        int totalPower = 0;
        for (int i : topPower) {
            totalPower += i;
        }

        return totalPower / topPower.length;
    }
}
    