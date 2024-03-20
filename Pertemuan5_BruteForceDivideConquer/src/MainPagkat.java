package Pertemuan5_BruteForceDivideConquer.src;
import java.util.Scanner;
public class MainPagkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung :"); 
        int elemen = sc.nextInt();

        Pangkat23 [] png = new Pangkat23[elemen];
        for (int i=0; i < elemen; i++){
            png [i] = new Pangkat23();
            System.out.print("Masukkan nilai yang ingin dipangkatkan: ");
            int nilai = sc.nextInt();
            png[i].nilai = nilai;
            System.out.print("Masukkan nilai pemangkatnya: ");
            int pangkat = sc.nextInt();
            png[i].pangkat = pangkat;
        }

        System.out.println("HASIL PANGKAT - BRUTE FORCE");
        for (int i=0; i < elemen; i++) {
        System.out.println("hasil dari "
            +png[i].nilai+ " pangkat "
            +png[i].pangkat+ " adalah "
            +png[i].pangkatBF(png[i].nilai, png[i].pangkat)
            );
        }
        System.out.println("HASIL - DEVIDE AND CONQUER");
        for (int i=0; i < elemen; i++) {
            System.out.println("hasil dari "
                +png[i].nilai+ " pangkat "
                +png[i].pangkat+ " adalah "
                +png[i].pangkatDC(png[i].nilai, png[i].pangkat)
                );
            }
    }
    
}
