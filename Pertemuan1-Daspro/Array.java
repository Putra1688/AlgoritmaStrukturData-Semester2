import java.util.Scanner;
public class Array {

    public static String format(int lebar, String s) {
        return String.format("%-" + lebar + "s", s);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String [] matkul = new String [2];
        double [] nilai = new double [2];
        String [] huruf = new String [2];
        double [] bobotSks = new double [2];
        String [] message = new String [2];



        for (int i=0; i < matkul.length; i++) {
            System.out.print(i+1 + ". Mata Kuliah     : ");
            matkul [i] = sc.nextLine();
            System.out.print("   Bobot Sks       : ");
            bobotSks [i] = sc.nextDouble();
            System.out.print("   Nilai Index     : ");
            huruf [i] = sc.next();
            sc.nextLine();
            System.out.println("----------------------");
        }

        System.out.println("Program Hitung IP Semester");
        System.out.println("==========================");

        for (int i=0; i<matkul.length ; i++) {
            System.out.print("masukkan nilai angka untuk MK "+ matkul[i] + ": ");
            nilai [i] = sc.nextDouble();
            sc.nextLine();
           }

        for (int i=0; i<matkul.length; i++) {   
        if (nilai[i] >= 0 && nilai [i] <= 100) {
        
            message [i] = 80 < nilai [i] && nilai [i] <= 100 ? "4.00"
                : 72 < nilai [i] && nilai [i] <= 80 ? "3.50"
                : 65 < nilai [i] && nilai [i] <= 72 ? "3.00"
                : 60 < nilai [i] && nilai [i] <= 65 ? "2.50"
                : 50 < nilai [i] && nilai [i] <= 60 ? "2.00"
                : 29 < nilai [i] && nilai [i] <= 50 ? "1.00"
                : "0.00";
        }
    }

           System.out.println("==========================");
           System.out.println("hasil Konfersi Nilai");
           System.out.println("==========================");
           System.out.println(format(50, "MK" + format(5, "Nilai Angka") + format(5,"Nilai Huruf") + format(5, "Bobot Nilai")));

           for (int i=0; i<matkul.length; i++) {
            System.out.printf(" %-30s %-15s %15s %-15s", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
            System.out.printf(" %-30s %-15s %15s %-15s", String.valueOf(matkul[i]), String.valueOf(nilai[i]), String.valueOf(huruf[i]), String.valueOf(message[i]));
           }

        
        /* double ip = 
        System.out.println("==========================");
        System.out.println("IP : "); */

     }
}
