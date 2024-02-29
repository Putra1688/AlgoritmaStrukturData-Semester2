package Pertemuan1_Daspro;

public class RoyalGarden {

    static int [] jml_bunga [] = new int [][] {
        {10,5, 15,7}, 
        {6, 11, 9, 12}, 
        {2, 10, 10, 5}, 
        {5, 7, 12, 9}
        };

    static String [] bunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};

    public static void main(String[] args) {
        displayPendapatan();
        RoyalGarden4(); 
    }

    static void displayPendapatan() {
        System.out.printf("%-14s %-9s %-7s %-9s %-6s %-10s \n", "Cabang", "Aglonema", "Keladi", "Alocasia", "Mawar",
                "Pendapatan");

        for (int i=0;i < jml_bunga.length; i++) {
            int pendapatan = 0;
            pendapatan += jml_bunga[i][0] * 75000;
            pendapatan += jml_bunga[i][1] * 50000;
            pendapatan += jml_bunga[i][2] * 60000;
            pendapatan += jml_bunga[i][3] * 10000;

            System.out.printf("%-14s %-9s %-7s %-9s %-6s %-10s \n", "Royal Garden" +(i+1),  jml_bunga[i][0], jml_bunga[i][1], jml_bunga[i][2], jml_bunga[i][3],
                pendapatan);
        }
    }
    
   static void RoyalGarden4() {
        System.out.println("=== Data Stok bunga pada Royal Garden 4 === ");
        for (int i = 0; i<bunga.length; i++) {
            System.out.println(bunga[3] +" : "+ jml_bunga[3][i]);
        }
        System.out.println("\n");
        System.out.println("Laporan bunga mati:");
        
            System.out.println(bunga[0] +" : "+ 1);
            System.out.println(bunga[1] +" : "+ 2);
            System.out.println(bunga[2] +" : "+ 0);
            System.out.println(bunga[3] +" : "+ 5);
            System.out.println("\n");
            System.out.println("=== Data Stock bunga terbaru: ");

            System.out.println(bunga[0] +" : "+ (jml_bunga[3][0]-1));
            System.out.println(bunga[1] +" : "+ (jml_bunga[3][1]-2));
            System.out.println(bunga[2] +" : "+ (jml_bunga[3][2]));
            System.out.println(bunga[3] +" : "+ (jml_bunga[3][3]-5));
    }
}
