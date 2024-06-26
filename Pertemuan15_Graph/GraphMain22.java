package Pertemuan15_Graph;
import java.util.Scanner;;
public class GraphMain22 {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Fitur Graph :\n"
                            + "1. Add Edge\n"
                            + "2. Remove Edge\n"
                            + "3. Degree\n"
                            + "4. Print Graph\n"
                            + "5. Cek Edge\n"
                            + "----------------\n"
                            + "-> Jalankan kode program : ");
        
        int menu = input.nextInt();
        

        }
        /* 
        Graph22 gedung = new Graph22(6);
        
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();
        
        gedung.removeEdge(1, 3);
        gedung.printGraph();
        */

        GraphMatriks22 gdg = new GraphMatriks22(4);
        gdg.makeEdge(0, 1, 50);
        gdg.makeEdge(1, 0, 60);
        gdg.makeEdge(1, 2, 70);
        gdg.makeEdge(2, 1, 80);
        gdg.makeEdge(2, 3, 40);
        gdg.makeEdge(3, 0, 90);
        gdg.printGraph();
        System.out.println("Hasil setelah penghapusan edge");
        gdg.removeEdge(2, 1);
        gdg.printGraph();
    }
}
