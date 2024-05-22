package Pertemuan13_Kuis2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Membuat objek LinkedList
        LinkedList klasemen = new LinkedList();

        // Menambahkan tim-tim ke dalam klasemen
        klasemen.addTim("Pelita Jaya Jakarta", 0, 0, 0, 0);
        klasemen.insertAfter("Pelita Jaya Jakarta", "Dewa United Banten", 0, 0, 0, 0);
        klasemen.insertAfter("Dewa United Banten", "Ksatria Bengawan Solo", 0, 0, 0, 0);
        klasemen.insertAfter("Ksatria Bengawan Solo", "Rajawali Medan", 0, 0, 0, 0);

        // Mencetak klasemen sebelum update hasil pertandingan
        
        while (true) {
            System.out.println("=== Indonesia Basket League ===");
            System.out.println(
                "1. Lihat Hasil Pertandingan\n" +
                "2. Lihat Tim\n" +
                "3. Hentikan program\n" +
                "____________________________");
                System.out.print("-> ");
                
                int pilih = input.nextInt();
                input.nextLine();
                switch (pilih) {
                    case 1:
                    System.out.println("Point Awal : ");
                    klasemen.print();
                    
                    // Menambahkan hasil pertandingan Tim Pelita Jaya Jakarta
                        klasemen.updateMatchResult("Pelita Jaya Jakarta", true); // menang vs Dewa United Banten
                        klasemen.updateMatchResult("Pelita Jaya Jakarta", true); // menang vs Kesatria Bengawan Solo
                        klasemen.updateMatchResult("Pelita Jaya Jakarta", false); // kalah vs Rajawali Medan

                    // Menambahkan hasil pertandingan Tim Dewa United Banten
                        klasemen.updateMatchResult("Dewa United Banten", false); // kalah vs Pelita Jaya Jakarta
                        klasemen.updateMatchResult("Dewa United Banten", true); // menang vs Kesatria Bengawan Solo
                        klasemen.updateMatchResult("Dewa United Banten", false); // kalah vs Rajawali Medan

                    // Menambahkan hasil pertandingan Tim Ksatria Bengawan Solo
                        klasemen.updateMatchResult("Ksatria Bengawan Solo", false); // kalah vs Pelita Jaya Jakarta
                        klasemen.updateMatchResult("Ksatria Bengawan Solo", false); // kalah vs Dewa United Banten
                        klasemen.updateMatchResult("Ksatria Bengawan Solo", true); // menang vs Rajawali medan

                    // Menambahkan hasil pertandingan Tim Rajawali Medan
                        klasemen.updateMatchResult("Rajawali Medan", true); // menang vs Pelita Jaya Jakarta
                        klasemen.updateMatchResult("Rajawali Medan", true); // menang vs Dewa United Banten
                        klasemen.updateMatchResult("Rajawali Medan", false); // kalah vs Bengawan Solo
                    
                    // Menambahkan hasil pertandingan Rajawali Medan vs Pelita Jaya Jakarta
                        klasemen.updateMatchResult("Rajawali Medan", true); // menang vs Pelita Jaya Jakarta

                    // Menambahkan hasil pertandingan Ksatria Bengawan Solo vs Dewa United Banten
                        klasemen.updateMatchResult("Ksatria Bengawan Solo", true); // menang vs United Banten

                        // Mencetak klasemen setelah update hasil pertandingan
                        System.out.println("Klasemen Setelah Update:");
                        klasemen.print();
                break;

                case 2:
                    System.out.println("Team Yang Bertanding:");
                    klasemen.printTeam();
                break;

                case 3: 
                System.exit(0);

                default:
                break;
            }
    }
}
}