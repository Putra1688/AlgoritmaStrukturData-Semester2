package Pertemuan10_Queue.tugas;

import Pertemuan10_Queue.Nasabah;
import Pertemuan10_Queue.Queue22;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // membuat object sebagai perantara untuk mengakses class lain
        Queue rangga = new Queue();

        

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah antrian pelanggan: ");
        
        int pilih;
    
        do {
            System.out.println( "Pilih Menu :");
            System.out.println("1. Antrian baru");
            System.out.println("2. Antrian Keluar");
            System.out.println("3. Cek Antrian terdepan");
            System.out.println("4. Cek Semua Antrian");
            System.out.println("5. Cek Antrian paling belakang");
            System.out.println("6. Cek Antrian");
            System.out.println("------------------------------------");
            pilih =input.nextInt();
            input.nextLine();
            switch (pilih) {
                case 1 :
                
                System.out.print("Nama Pelanggan: ");
                String nama = input.nextLine();
                System.out.print("No.HP: ");
                int noHp= input.nextInt();
                
                
                Pembeli pelangganBaru = new Pembeli (nama, noHp);
                input.nextLine();
                rangga.Enqueue(pelangganBaru);
                break;

                case 2 :
                Pembeli data = rangga.dequeue();
                if (data != null && !"".equals(data.nama) && data.noHp != 0) {
                    System.out.println("Antrian yang keluar: " + data.nama + " " + data.noHp );
                }
                break;
                case 3 :
                rangga.peek();
                break;
                case 4 :
                rangga.print();
                break;
                case 5 :
                rangga.peekRear();
                break;
                case 6 :
                System.out.print("Antrian dari : ");
                nama = input.nextLine();
                rangga.peekPosition(nama);

            }
        } while ( pilih == 1 || pilih == 2 || pilih ==3 || pilih == 4);
    }
}
    

