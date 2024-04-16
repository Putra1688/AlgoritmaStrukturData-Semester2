package Pertemuan4_quiz;
public class Manusia {
    // atribut yang dapat diakses di semua methode
    float Bmi; 

    // methode menghitung Bmi
    float hitungBmi(float tinggi, float berat){
    return Bmi = berat * berat / tinggi;
    }

    public static void main(String[] args) {
        
        // instance array of object
        Manusia data[] = new Manusia[2];
        data[0] = new Manusia();
        System.out.println("contoh 1: "+data[0].hitungBmi(2, 3));
        data[1] = new Manusia();
        System.out.println("contoh 2: "+data[1].hitungBmi(5, 7));
        /* for (int i=0; i< data.length; i++){
            data[i] = new Manusia();
            data[i].hitungBmi(i, i);
        } */
    }
}