package Pertemuan9_Uts;

public class Rangga23 {
    int nilai;

    public Rangga23(int nilai){
        this.nilai = nilai;
    }

    // Methode untuk menampilkan data array
    public static void tampil(Rangga23[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nilai indeks ke-" + i + ": " + arr[i].nilai);
        }
    }
} 

