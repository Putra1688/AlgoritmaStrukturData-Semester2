# LAPORAN PRAKTIKUM II
# ALGORITMA & STRUKTUR DATA (OBJECT)
Nama  : Rangga Dwi Saputra <br>
NIM   : 2341720248 <br>
Kelas : TI - 1B <br>
## 2. Praktikum
### 2.1 Percobaan 1: Deklarasi Class, Atribut dan Method
Code :
```
package Pertemuan2_Object;

public class Buku23 {
    
    String judul, pengarang;
    int halaman, stock, harga;
    
    void tampilInformasi() {
        System.out.println("Judul : " +judul);
        System.out.println("Pengarang : " +pengarang);
        System.out.println("Halaman Buku : " +halaman);
        System.out.println("Sisa stock : " +stock);
        System.out.println("Harga : Rp " +harga);
    }
    void terjual(int jml) {
        stock -= jml;
    }
    void restock(int jml) {
        stock += jml;
    }
    void gantiHarga(int hrg ) {
        harga = hrg;
    }
}
```
#### 2.1.1 Verifikasi Hasil Percobaan
Dari compline code tersebut akan eror<br>
![image](./image/img1.png)
