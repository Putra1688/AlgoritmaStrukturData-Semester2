package Pertemuan9_Uts;
import java.util.Scanner;

public class MainRangga23 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Rangga23 nilai[] = new Rangga23[17];
            nilai[0]  = new Rangga23(44);
            nilai[1]  = new Rangga23(34);
            nilai[2]  = new Rangga23(3);
            nilai[3]  = new Rangga23(29);
            nilai[4]  = new Rangga23(20);
            nilai[5]  = new Rangga23(5);
            nilai[6]  = new Rangga23(0);
            nilai[7]  = new Rangga23(24);
            nilai[8]  = new Rangga23(25);
            nilai[9]  = new Rangga23(18);
            nilai[10] = new Rangga23(18);
            nilai[11] = new Rangga23(5);
            nilai[12] = new Rangga23(39);
            nilai[13] = new Rangga23(9);
            nilai[14] = new Rangga23(6);
            nilai[15] = new Rangga23(45);
            nilai[16] = new Rangga23(40);

            
            // memanggil methode tampil
            Rangga23.tampil(nilai);
            
    System.out.println("===================");
    System.out.println("SEARCHING");
            SearchingSorting pencarian = new SearchingSorting(nilai);

            System.out.print("Nilai yang ingin dicari: ");
            int cari = input.nextInt();
            
            int ketemu = pencarian.FindBinarySearch(cari, 0, nilai.length - 1); 
            // pencarian adalah objeknya, `ketemu` adalah atribut yang dicari
            pencarian.TampilPosisi(cari, ketemu);

    System.out.println("========================");
    System.out.println("Sorting Ascending");

        // Sorting data
        pencarian.SortingAscending();
        pencarian.TampilNilai();

        System.out.print("Nilai yang ingin dicari: ");
        cari = input.nextInt();
        ketemu = pencarian.FindSortingAscending(cari, 0, nilai.length - 1);
        pencarian.TampilPosisi(cari, ketemu);
        

    System.out.println("========================");
    System.out.println("Sorting Descending");
        // Sorting data
        pencarian.SortingDescending();
        pencarian.TampilNilai(); 

        System.out.print("Nilai yang ingin dicari: ");
        cari = input.nextInt();
        ketemu = pencarian.FindBinarySearch(cari, 0, nilai.length - 1);
        pencarian.TampilPosisi(cari, ketemu);
    }
}