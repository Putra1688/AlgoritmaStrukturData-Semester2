import java.util.Scanner;
public class Pemilihan {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        float tugas, kuiz, uts, uas ;
        double nilaiAkhir;
    
        System.out.println("Program Menghitung Nilai Akhir");

        System.out.println("==============================");
        System.out.print("Masukkan Nilai Tugas: ");
        tugas = input.nextFloat();
        System.out.print("Masukkan Nilai Kuiz: ");
        kuiz = input.nextFloat();
        System.out.print("Masukkan Nilai UTS: ");
        uts = input.nextFloat();
        System.out.print("Masukkan Nilai UAS: ");
        uas = input.nextFloat();
        System.out.println("==============================");
        System.out.println("==============================");

        if (tugas >= 0 && tugas <= 100 && kuiz >= 0 && kuiz <= 100 &&
        uas >= 0 && uts <= 100 && uas >= 0 && uas <= 100) {
            
            nilaiAkhir = ( (tugas * 0.2) + (kuiz * 0.2) + (uts * 0.3) + (uas * 0.4)) ;
            String message = 80 < nilaiAkhir && nilaiAkhir <= 100 ? "4:Sangat Baik (A)"
                : 73 < nilaiAkhir && nilaiAkhir <= 80 ? "3.5:Lebih Baik (B+)"
                : 65 < nilaiAkhir && nilaiAkhir <= 73 ? "3:Baik (B)"
                : 60 < nilaiAkhir && nilaiAkhir <= 65 ? "2.5:Lebih dari Cukup (C+)"
                : 50 < nilaiAkhir && nilaiAkhir <= 60 ? "2:Cukup (C)"
                : 39 < nilaiAkhir && nilaiAkhir <= 50 ? "1.5:Kurang (D)"
                : "Gagal (E)";
            
                System.out.println("Nilai Akhir : " +nilaiAkhir);
                System.out.println("Kualifikasi : " +message);
                System.out.println("==============================");
                
                if ((39 < nilaiAkhir && nilaiAkhir <= 50) || nilaiAkhir > 39 ) {
                    System.out.println("ANDA TIDAK LULUS !");
                } else {
                    System.out.println("SELAMAT ANDA LULUS !");
                }
        } else { 
            System.out.println("Nilai Tidak Valid ! ");
            System.out.println("==============================");
            
        }

        
        

    }
}