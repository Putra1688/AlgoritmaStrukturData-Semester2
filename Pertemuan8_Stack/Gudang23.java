package Pertemuan8_Stack;

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
}
