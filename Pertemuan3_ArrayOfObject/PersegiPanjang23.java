package Pertemuan3_ArrayOfObject;
import java.util.Scanner;

public class PersegiPanjang23 {
    public int panjang;
    public int lebar;

    public static void main(String[] args) {
        int x;
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Kapasitas Array: ");
        x = sc.nextInt();

        PersegiPanjang23 [] ppArray = new PersegiPanjang23[x];

        for (int i=0; i<ppArray.length;i++){
            ppArray[i] = new PersegiPanjang23();
            System.out.println("Persegi panjang yang ke-"+i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        for (int i=0;i<ppArray.length;i++){
            System.out.println("Persegi panjang yang ke-"+i);
            System.out.println("Panjang: "+ppArray[i].panjang + ", Lebar: " +ppArray[i].lebar);
        } 

        /* ppArray [0] = new PersegiPanjang23();
        ppArray [0].panjang = 110 ;
        ppArray [0].lebar  = 30;

        ppArray [1] = new PersegiPanjang23();
        ppArray [1].panjang = 80 ;
        ppArray [1].lebar  = 40;

        ppArray [2] = new PersegiPanjang23();
        ppArray [2].panjang = 100 ;
        ppArray [2].lebar  = 20; 

        System.out.println("Persegi panjang ke-0, panjang: " +ppArray[0].panjang+ " ,lebar" + ppArray[0].lebar);
        System.out.println("Persegi panjang ke-1, panjang: " +ppArray[1].panjang+ " ,lebar" + ppArray[1].lebar);
        System.out.println("Persegi panjang ke-2, panjang: " +ppArray[2].panjang+ " ,lebar" + ppArray[2].lebar); */
    }
}
