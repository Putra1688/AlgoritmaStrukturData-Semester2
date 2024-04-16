package Pertemuan8_Stack.KelolaGudang;

import java.util.Scanner;
public class Utama23 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        System.out.print("Masukkan kapasitas Gudang: ");
        int capacity = scanner.nextInt();
        Gudang23 gudang = new Gudang23(capacity);

        int kode=0;
        String nama="";

        while (true) {
            System.out.println("Menu:");
            System.out.println("1.  Tambah Barang");
            System.out.println("2.  Ambil Barang");
            System.out.println("3.  Tampilkan tumpukan barang");
            System.out.println("4.  Lihat Barang teratas");
            System.out.println("5.  Lihat Barang terbawah");
            System.out.println("6.  Cari Barang");
            System.out.println("7.  Keluar");
            System.out.print("Pilih operasi: ");
            int pilihan = scanner.nextInt();
            

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    nama = scanner.nextLine();
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
                        System.out.println("Barang teratas: " + barangTeratas.nama);
                    } else {
                        System.out.println("Gudang kosong.");
                    }
                    break;
                case 5:
                    Barang23 barangTerbawah = gudang.lihatBarangTerbawah();
                    if (barangTerbawah !=null) {
                        System.out.println("Barang terbawah: " + barangTerbawah.nama);
                    } else {
                        System.out.println("Gudang Kosong");
                    }
                    break;
                case 6 :
                    gudang.cariBarang(kode, nama);
                    break;
                case 7:
                    System.exit(0);
                    break;
                default :
                    System.out.println("Pilihan tidak valid. silahkan coba lagi.");
                    break;
            }
        }
    }
}
