package Pertemuan5_BruteForceDivideConquer.src;
import java.util.Scanner;
public class MainFaktorial {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------");
        System.out.print("Masukkan jumlah elemen: ");
        int iJml = sc.nextInt();
        
        Faktorial23 [] fk = new Faktorial23[10];
        for (int i=0; i < iJml; i++){
            fk[i] = new Faktorial23();
            System.out.print("Masukkan nilai data ke-" +(i+1)+ " : ");
            int iNilai = sc.nextInt();
            fk[i].nilai = iNilai; // ini penting
        }

        System.out.println("HASIL - BRUTE FORCE");
        for (int i=0; i < iJml; i++){
        System.out.println("Hasil perhitungan faktorial menggunakan Brute Force adalah: " + fk[i].faktorialBF(fk[i].nilai));
        }

        System.out.println("HASIL - DIVIDE CONQUER");
        for (int i=0; i < iJml; i++){
        System.out.println("Hasil perhitungan faktorial menggunakan Brute Force adalah: " + fk[i].faktorialDC(fk[i].nilai));
        }
    }
    
}
