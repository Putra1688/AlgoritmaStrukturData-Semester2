package Pertemuan2_Object;

public class Buku23 {
    
    String judul, pengarang;
    int halaman, stock, harga;
    int sold;
    
    
    void tampilInformasi() {
        System.out.println("Judul : " +judul);
        System.out.println("Pengarang : " +pengarang);
        System.out.println("Halaman Buku : " +halaman);
        System.out.println("Sisa stock : " +stock);
        System.out.println("Harga : Rp " +harga);
    }

    void terjual(int jml) {
        if  (stock > 0) {
        stock -= jml;
        sold += jml;
        } else { System.out.println("Stock sudah habis");}
    }

    void restock(int jml) {
        stock += jml;
    }

    void gantiHarga(int hrg ) {
        harga = hrg;
    }

    public Buku23(){}
    public Buku23 (String jdl, String pg, int stock, int hal, int hrg) {
        judul = jdl;
        pengarang = pg;
        this.stock = stock;
        halaman = hal;
        harga = hrg;
    }
    
    
    int hitungHargaTotal() {
        this.harga = harga * stock;
        return harga; 
    }
    
    int hitungDiskon () {
        int hargaDiskon;
        int harga = hitungHargaTotal();
        if (harga > 150000) {
            hargaDiskon = harga * 12/100;
        } else if (75000 < harga && harga < 150000) {
            hargaDiskon = harga * 5/100; 
        } else { hargaDiskon = harga; }
        return hargaDiskon;
    }

    int hitungHargaBayar() {
            harga = hitungHargaTotal() - hitungDiskon();
        return harga;
    }
        
    
}
