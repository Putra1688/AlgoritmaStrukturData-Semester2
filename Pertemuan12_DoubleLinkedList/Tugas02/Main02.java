package Pertemuan12_DoubleLinkedList.Tugas02;
import java.util.Scanner;


public class Main02 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        DoubleLinkedList02 dll = new DoubleLinkedList02(); 

        while (true) {
            System.out.println("====================================\n"
                                + " DATA FILM LAYAR LEBAR \n"
                                + "====================================\n\n"
                                + "1. Tambah Data Awal\n"
                                + "2. Tambah Data Akhir\n"
                                + "3. Tambah Data Index Tertentu\n"
                                + "4. Hapus Data Pertama\n"
                                + "5. Hapus Data Akhir\n"
                                + "6. Hapus Data Index Tertentu\n"
                                + "7. Cetak\n"
                                + "8. Cari ID Film\n"
                                + "9. Urut Data Rating Film-DSC\n"
                                + "10. Keluar\n"
                                + "++++++++++++++++++++++++++");
             
            int menu = input.nextInt();
            input.nextLine();
            switch (menu) {
            case 1 :
                System.out.print("Masukkan ID Film : ");
                int id = input.nextInt();
                input.nextLine();
                System.out.print("Masukkan Judul Film : ");
                String judul = input.nextLine();
                System.out.print("Masukkan Rating Film : ");
                Float rate = input.nextFloat();
                dll.addFirst(id, judul, rate );
                
            break;

            case 2 :
            System.out.print("Masukkan ID Film : ");
                id = input.nextInt();
                input.nextLine();
                System.out.print("Masukkan Judul Film : ");
                judul = input.nextLine();
                System.out.print("Masukkan Rating Film : ");
                rate = input.nextFloat();
                dll.addLast(id, judul, rate );
            break;

            case 3:
                System.out.print("Tambahkan data pada indeks ke-");
                int index = input.nextInt();
                input.nextLine();
                System.out.print("Masukkan nomor Antrian : ");
                id = input.nextInt();
                input.nextLine();
                System.out.print("Masukkan nama Antrian : ");
                judul = input.nextLine();
                System.out.print("Masukkan Rating Film : ");
                rate = input.nextFloat();
                dll.add(id, judul, rate, index );
            break;

            case 4:
            dll.removeFirst();;
            break;

            case 5 :
            dll.removeLast();
            break;

            case 6:
            System.out.print("Hapus Data pada indeks ke-");
            index = input.nextInt();
            dll.remove(index);;
            break;

            case 7:
            dll.print();
            break;

            case 8 :
            System.out.print("Masukkan ID Film : ");
            id = input.nextInt();
            dll.get(id);
            break;

            case 9:
            dll.print();
            break;

            case 10:
            System.exit(0);
            break;
        }
        }
        
    }
}
