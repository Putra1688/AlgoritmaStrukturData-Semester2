import java.util.Scanner;
public class Array {

    public static String format(int lebar, String s) {
        return String.format("%-" + lebar + "s", s);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String [] matkul = new String [2];
        String [] huruf = new String [2];
        double [] bobotSks = new double [2];
        double [] nilai = new double [2];
        int jumlahSks = 0;
        double ip = 0;


        for (int i=0; i < matkul.length; i++) {
            System.out.print(i+1 + ". Mata Kuliah     : ");
            matkul [i] = sc.nextLine();
            System.out.print("   Bobot Sks       : ");
            bobotSks [i] = sc.nextDouble();
            System.out.print("   Nilai Huruf (A,B+,B,C,C+,D,E): ");
            huruf [i] = sc.next();
            sc.nextLine();
            System.out.println("----------------------");
            
           
            jumlahSks += bobotSks[i];
        }

        System.out.println("Program Hitung IP Semester");
        System.out.println("==========================");

       
        for (int i=0; i<matkul.length; i++) {   
        
            nilai [i] = huruf [i].equalsIgnoreCase("A")  ? 4.0
                : huruf [i].equalsIgnoreCase("B+")  ? 3.5
                : huruf [i].equalsIgnoreCase("B")  ? 3.0
                : huruf [i].equalsIgnoreCase("C+")  ? 2.5
                : huruf [i].equalsIgnoreCase("C")  ? 2.0
                : huruf [i].equalsIgnoreCase("D")  ? 1.0
                : 0.0;
        }
    

           System.out.println("==========================");
           System.out.println("hasil Konfersi Nilai");
           System.out.println("==========================");

           
            System.out.println(String.format("%-40s %-12s %-12s",
            "MK",
            "Nilai Huruf",
            "Bobot Nilai"
        ));
            for (int i=0; i<matkul.length; i++) {
                System.out.println(String.format("%-40s %-12s %-12s",
                matkul[i],
                huruf[i],
                nilai[i]
                ));
           }

           for (int i=0; i<matkul.length; i++) {
            ip += (nilai[i] * bobotSks[i] )/ jumlahSks;
           }
           
        
        System.out.println("==========================");
        System.out.println("IP : " +ip); 

     }
}
