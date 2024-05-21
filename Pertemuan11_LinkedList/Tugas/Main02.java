package Pertemuan11_LinkedList.Tugas;
import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        Methode02 methode = new Methode02();
        System.out.println("LAYANAN UNIT KEMAHASISWAAN");
        System.out.println("==========================");
        while (true) {
            System.out.println("------------------------------");
            System.out.println(
                "1. Tambahkan data antrian\n" +
                "2. Keluarkan antrian\n" +
                "3. Hentikan program\n" +
                "____________________________");
            System.out.print("-> ");
            
            int pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("------------------------------");
                    System.out.print("NIM\t: ");
                    String nim = input.nextLine();
                    input.nextLine();
                    System.out.print("Nama\t: ");
                    String nama = input.nextLine();
                    methode.addData(nim, nama);
                break;

                case 2:
                String [] done = methode.getData(0);
                    methode.removeData();
                    System.out.println("Data mahasiswa dengan nim: " + done[0] + " dan nama: " +done[1] + " telah diselesaikan");
                break;

                case 3:
                System.exit(0);
                break;

                default:
                break;
            }
        }
    }
}
