package Pertemuan12_DoubleLinkedList.Tugas01;
import java.util.Scanner;
public class Main01 {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        DoubleLinkedList01 dll = new DoubleLinkedList01(); 

        while (true) {
            System.out.println("++++++++++++++++++++++++++\n"
                                + "PENGANTRI VAKSIN EKSTRAVAGANZA\n"
                                + "++++++++++++++++++++++++++\n\n"
                                + "1. Tambah Data Penerima Vaksin\n"
                                + "2. Hapus Data Pengantri Vaksin\n"
                                + "3. Tampil Data Penerima Vaksin\n"
                                + "4. Keluar\n"
                                + "++++++++++++++++++++++++++");
             
            int menu = input.nextInt();
            input.nextLine();
            switch (menu) {
            case 1 :
                System.out.print("Masukkan nomor Antrian : ");
                int nomor = input.nextInt();
                input.nextLine();
                System.out.print("Masukkan nama Antrian : ");
                String nama = input.nextLine();
                dll.add(nama, nomor);
                
            break;

            case 2 :
            dll.remove();
            break;

            case 3:
            dll.print();
            break;

            case 4:
            System.exit(0);
            break;
        }
        }
    }
}
