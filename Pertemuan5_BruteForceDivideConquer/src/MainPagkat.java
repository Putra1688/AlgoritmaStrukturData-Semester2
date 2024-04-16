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
            // png [i] = new Pangkat23();
            System.out.print("Masukkan nilai yang ingin dipangkatkan: ");
            int nilai = sc.nextInt();
            // png[i].nilai = nilai;
            System.out.print("Masukkan nilai pemangkatnya: ");
            int pangkat = sc.nextInt();
            // png[i].pangkat = pangkat; 
            png[i] = new Pangkat23(nilai, pangkat);
        }
        
        System.out.println("Methode perhitungan :");
        System.out.println("1.\tBrute Force\n2.\tDevide and Conquer");
        int pilih = sc.nextInt();

        switch (pilih) {
            case 1 :
            System.out.println("HASIL PANGKAT - BRUTE FORCE");
            for (int i=0; i < elemen; i++) {
            System.out.println("hasil dari "
                +png[i].nilai+ " pangkat "
                +png[i].pangkat+ " adalah "
                +png[i].pangkatBF(png[i].nilai, png[i].pangkat)
                );
            }
            break;
            case 2:
            System.out.println("HASIL - DEVIDE AND CONQUER");
            for (int i=0; i < elemen; i++) {
                System.out.println("hasil dari "
                    +png[i].nilai+ " pangkat "
                    +png[i].pangkat+ " adalah "
                    +png[i].pangkatDC(png[i].nilai, png[i].pangkat)
                    );
                }
            break;
            default :
            System.out.println("pilihan invalid");
            break;
            }
        
        }
    }
    

