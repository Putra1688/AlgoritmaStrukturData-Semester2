package Pertemuan6_Sorting.praktikum;
import java.util.Scanner;
public class MainHotel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HotelService23 listHotel = new HotelService23();
        Hotel23 d1 = new Hotel23("Saputra", "Banyuwangi", 13000000, (byte) 4);
        Hotel23 d2 = new Hotel23("Cantika", "Surabaya", 8125000, (byte) 3);
        Hotel23 d3 = new Hotel23("Mewah", "Malang", 2310000, (byte) 4);
        Hotel23 d4 = new Hotel23("Bavana", "Kediri", 800000, (byte) 5);

        listHotel.tambah(d1);
        listHotel.tambah(d2);
        listHotel.tambah(d3);
        listHotel.tambah(d4);

        System.out.println(
            "SELAMAT DATANG DI TRAVELUKA\n" +
            "------------------------------------------------\n" +
            "Berikut adalah daftar hotel yang tersedia: "
        );

        // Menampilkan semua data
        listHotel.tampilAll();

        System.out.print(
            "------------------------------------------------\n" +
            "Filter daftar hotel? (Y/T) : "
        );
        char konfirmasiFilter = input.next().charAt(0);

        if (Character.toUpperCase(konfirmasiFilter) == 'Y') {
            System.out.print(
                "Urutkan berdasarkan: \n" +
                "   1. Harga\n" +
                "   2. Rating\n" +
                "pilih : "
            );
            int pilihanFilter =input.nextInt();
            System.out.println("------------------------------------------------");
            switch (pilihanFilter) {
                case 1:
                    // Mengurutkan berdasarkan data harga termurah ke tertinggi
                    System.out.println("List harga hotel dari yang paling termurah");
                    listHotel.bubbleSort();
                    break;
                case 2:
                    // Mengurutkan berdasarkan data rating tertinggi ke terendah
                    System.out.println("List harga hotel dari rating paling tinggi");
                    listHotel.selectionSort();
                    break;
                default:
                    System.out.println("Input anda salah!");
                    break;
            }

            listHotel.tampilAll();
        }
    }
}

