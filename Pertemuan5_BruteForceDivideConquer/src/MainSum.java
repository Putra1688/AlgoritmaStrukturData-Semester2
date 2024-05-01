package Pertemuan5_BruteForceDivideConquer.src;
import java.util.Scanner;
public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9) : "); 
        System.out.print("Masukkan jumlah perusahaan: ");   
        int jumlah_Prshaan = sc.nextInt();

        System.out.println("=========================");
        Sum23 [] sm = new Sum23[jumlah_Prshaan];
        
        for (int i=1; i < sm.length; i++) {
            sm[i] = new Sum23(i);
            System.out.println("Perusahaan ke-" +i);
            System.out.print("Masukkan jumlah bulan: ");
            sm[i].elemen = sc.nextInt();
            sm[i].keuntungan = new double [sm[i].elemen];
            for (int j=1; j < sm[i].elemen; j++) {
                System.out.println("Masukkan jumlah keuntungan bulan ke-" +j+ ": ");
                sm[i].keuntungan [j] = sc.nextDouble();
            }
        } 

        // output
        System.out.print("===================================\n");
        for (int i = 0; i < sm.length; i++) {
            System.out.println(
                "PERUSAHAAN KE-" + (i + 1) + "\n" +
                "   - Jumlah bulan\t\t: " + sm[i].elemen + "\n" +
                "   - Total Keuntungan: (BRUTE FORCE)\t " + sm[i].totalBF(sm[i].keuntungan) + "\n" +
                "   - Total Keuntungan: (DIVIDE CONQUER)\t " + sm[i].totalDC(sm[i].keuntungan, 0, sm[i].elemen - 1) + "\n"
            );
        }
        

        // kode versi sebelumnya
        /* System.out.println("=========================");
        for (int i=0; i < sm.elemen; i++) {
            System.out.print("Masukkan keuntungan pada bulan ke-" +(i+1)+ " = ");
            sm.keuntungan[i] = sc.nextDouble();
        } 

        System.out.println("=========================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perusahaan selama "+ sm.elemen + " bulan adalah " + sm.totalBF(sm.keuntungan));
        System.out.println("=========================");
        System.out.println("Algoritma Devide Conquer");
        System.out.println("Total keuntungan perusahaan selama "+ sm.elemen + " bulan adalah " + sm.totalDC(sm.keuntungan, 0, sm.elemen-1));
    */
    } 
    
}
