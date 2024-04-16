package Pertemuan8_Stack;

import java.util.Scanner;
public class Utama23 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        System.out.print("Masukkan kapasitas Gudang: ");
        int capacity = scanner.nextInt();
        Gudang23 gudang = new Gudang23(capacity);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1.  Tambah Barang");
            System.out.println("2.  Ambil Barang");
            System.out.println("3.  Tampilkan tumpukan barang");
            System.out.println("4.  Lihat Barang teratas");
            System.out.println("5.  Keluar");
            System.out.print("Pilih operasi: ");
            int pilihan = scanner.nextInt();
            

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = scanner.nextLine();
                    Barang23 barangBaru = new Barang23(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    Barang23 barangTeratas = gudang.lihatBarangTeratas();
                    if (barangTeratas != null) {
                        System.out.println("Barang teratas: " + barangTeratas.getnama());
                    } else {
                        System.out.println("Gudang kosong.");
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default :
                    System.out.println("Pilihan tidak valid. silahkan coba lagi.");
                    break;
            }
        }
    }
}
