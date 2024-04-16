package Pertemuan8_Stack.KelolaGudang;

import java.util.Scanner;
public class Gudang23 {
    Barang23 [] tumpukan;
    int size;
    int top;

    // konstruktor untuk inisialisasi
    public Gudang23 (int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang23[size];
        top = -1;
    }

    // methode untuk mengecek apakah tumpukan didalam gudang masih kosong
    public boolean cekKosong() {
        if (top == -1 ) {
            return true;
        } else {
            return false;
        }
    }

    // methode untuk mengecek apakah tumpukan barang sudah penuh sesuai kapasitas
    public boolean cekPenuh() {
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    // methode yang merepresentasikan push
    public void tambahBarang(Barang23 brg) {
       if (!cekPenuh()) {
        top++;
        tumpukan [top] = brg;
        System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");
       } else {
        System.out.println("Gagal! Tumpukan barag di Gudang sudah penuh");
       }
    }

    // methode yang merepresentasikan pop
    public Barang23 ambilBarang() {
        if (!cekKosong()) {
            Barang23 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang.");
            System.out.println("Kode unik dalam biner: " + konversiDesimalKeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    } 

    // methode yang merpresentasikan peek
    public Barang23 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang23 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " +barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    } 

    // methode untuk menampilkan semua rincian tumpukan barang di Gudang
    public void tampilkanBarang(){
        if(!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang: ");
            for (int i=top; i >= 0; i-- ) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong.");
        }
    }

    // membedakan Stack untuk barang dengan Stack yang digunakan untuk biner
    public String konversiDesimalKeBiner(int kode) {
    StackKonversi23 stack = new StackKonversi23();
    while (kode != 0) {
        int sisa = kode % 2;
        stack.push(sisa);
        kode = kode / 2;
    }
    String biner = new String();
    while (!stack.isEmpty()) {
        biner += stack.pop();
    }
    return biner;
}

// LATIHAN PRAKTIKUM

// lihat Barang Terbawah

    // menambahkan elemen baru kedalam stack (push)
    public void push (Barang23 data) {
        top++;
        tumpukan[top] = data;
    }
    // menghapus elemen teratas/top dari stack (pop)
    public Barang23 pop() {
        Barang23 item = tumpukan[top];
        top--;
        return item;
    }

public Barang23 lihatBarangTerbawah() {
    if (!cekKosong()) {
        Barang23 tumpukanBarang[] = new Barang23[size];
        Barang23 barangTerbawah = null;

        // mengetahui data pertama yang masuk dengan cara di pop
        int i = top;
        while (i >= 0) {
            tumpukanBarang[i] = pop();
            if (i==0) {
                barangTerbawah = tumpukan[i];
            }
        i--;
        }
        // mengembalikan barang yang sudah di pop
        i = 0;
        while (i < tumpukanBarang.length) {
            if (tumpukanBarang[i] !=null) {
                push(tumpukanBarang[i]);
            }
        i++;
        }
        System.out.printf("\nBarang terbawah: %s", barangTerbawah.nama);
        return barangTerbawah;
    } else {
        System.out.println("Tumpukan Barang Kosong");
        return null;
    }
}

// cari barang
public Barang23 cariBarang (int dicari, String namaDicari) {
    if (!cekKosong()) {
        Barang23 tumpukanBarang[] = new Barang23[size];
        Barang23 barangDicari = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("Cari berdasarkan: \n1.\tKode \n2.\tNama");
        System.out.print("Pilihan: ");
        int cari = sc.nextInt();

        switch (cari) {
            case 1:
            System.out.print("Masukkan kode barang yang ingn dicari: ");
            dicari = sc.nextInt();
            for (int i = top; i >= 0; i--) {                
                if (tumpukan[i].kode == dicari) {
                    barangDicari = tumpukan[i];
                    break;
                }
                tumpukanBarang[i] = pop();
            }
            break;
            case 2:
            System.out.print("Masukkan nama Barang yangingin dicari: ");
            namaDicari = sc.nextLine();
            for (int i = top; i >= 0; i--) {               
                if (tumpukan[i].nama.equalsIgnoreCase(namaDicari)) {
                    barangDicari = tumpukan[i];
                    break;
                }
                tumpukanBarang[i] = pop();
            }
            break;
            default:
            System.out.println("Pilihan tidak valid. silahkan coba lagi.");
            break;
        }

        // mengembalikan data yang sudah dihapus (pop)
        for (int i = 0; i < tumpukanBarang.length; i++) {
            if (tumpukanBarang[i] != null) {
                push(tumpukanBarang[i]);
            }
        }
        
        if (barangDicari != null) {
            System.out.println("Barang yang dicari : ");
            System.out.println("Kode     : " + barangDicari.kode);
            System.out.println("Nama     : " + barangDicari.nama);
            System.out.println("Kategori : " +barangDicari.kategori);
            
            return barangDicari;
        } else {
            System.out.println("Data tidak ditemukan!");
            return null;
        }
    } else {
        System.out.println("Tumpukan barang kosong!");
        return null;
    }
    
} 
}
