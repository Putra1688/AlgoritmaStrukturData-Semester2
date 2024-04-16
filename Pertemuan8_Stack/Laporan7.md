# <p align ="center">  LAPORAN PRAKTIKUM VII </p> 
# <p align ="center">  Stack </p> 
<br><br><br><br>

<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" width="30%"> </p>

<br><br><br><br><br>


<p align = "center"> Nama : Rangga Dwi Saputra </p>
<p align = "center"> NIM  : 2341720248 </p>
<p align = "center"> Prodi: D-IV Teknik Informatika</p>
<p align = "center"> Kelas: 1B / 23 </p>

<br><br><br><br><br>

### Percobaan 1 : Penyimpanan Tumpukan Barang dalam Gudang
Verifikasi hasil percobaan <br>
```java
Menu:
1.  Tambah Barang
2.  Ambil Barang
3.  Tampilkan tumpukan barang
4.  Keluar
Pilih operasi: 1
Masukkan kode barang: 21
Masukkan nama barang: Majalah
Masukkan nama kategori: Buku
Barang Majalah berhasil ditambahkan ke Gudang
Menu:
1.  Tambah Barang
2.  Ambil Barang
3.  Tampilkan tumpukan barang
4.  Keluar
Pilih operasi: 1
Masukkan kode barang: 23
Masukkan nama barang: Novel
Masukkan nama kategori: Buku\
Barang Novel berhasil ditambahkan ke Gudang
Menu:
1.  Tambah Barang
2.  Ambil Barang
3.  Tampilkan tumpukan barang
4.  Keluar
Pilih operasi: 2
Barang Novel diambil dari Gudang.
Menu:
1.  Tambah Barang
2.  Ambil Barang
3.  Tampilkan tumpukan barang
4.  Keluar
Pilih operasi: 1
Masukkan kode barang: 22
Masukkan nama barang: Mie ayam
Masukkan nama kategori: makanan
Barang Mie ayam berhasil ditambahkan ke Gudang
Menu:
1.  Tambah Barang
2.  Ambil Barang
3.  Tampilkan tumpukan barang
4.  Keluar
Pilih operasi: 3
Rincian tumpukan barang di Gudang:
Kode 22: Mie ayam (Kategori makanan)
Kode 21: Majalah (Kategori Buku)
Menu:
1.  Tambah Barang
2.  Ambil Barang
3.  Tampilkan tumpukan barang
4.  Keluar
Pilih operasi: 4
PS D:\POLINEMA\Semester 2\ALGORITMA & STRUKTUR DATA\AlgoritmaStrukturData-Semester2> 
```
**Pertanyaan** 
1.  Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi 
hasil percobaan! Bagian mana saja yang perlu diperbaiki? <br>
*Jawab* : <br>
    - langkah ke 11; bagian kondisi `!isEmpty` tidak di intansiasi sebelumnya, jadi tidak terbaca. Maka dari itu diganti dengan `cekKosong()` <br>
    - langkah ke 12; terdapat 2 syntaks perulangan yang salah satunya dikomen. Saya menggunakan syntaks perulangan ynag dikomen 
    - langkah ke 17; pada bagian `scanner.nextLine()` sesudah menginput pilihan, tidak diperlukan. Oleh karena itu, dihilangkan saja agar tidak terjadi input 2 kali ketika program dijalankan
    - pada case 4 ditambahkan `System.exit(0)` untuk menghentikan program
2.  Berapa banyak data barang yang dapat ditampung di dalam tumpukan? Tunjukkan potongan kode 
programnya! <br>
*Jawab* : Terdapat 7 data yang dapat ditampung dalam tumpukan. Yang mana ditunjukkan dalam kode `Gudang23 gudang = new Gudang23(7);`
3.  Mengapa perlu pengecekan kondisi !cekKosong() pada method tampilkanBarang? Kalau kondisi 
tersebut dihapus, apa dampaknya? <br>
*Jawab* : Sebagai syarat kondisi pemilihan, bahwa program akan berjalan apabila tumpukan kosong melalui `!cekKosong`, dengan menampilkan rincian tumpukan barang dengan kode, nama, dan kategori 
4.  Modifikasi kode program pada class Utama sehingga pengguna juga dapat memilih operasi lihat 
barang teratas, serta dapat secara bebas menentukan kapasitas gudang!
*Jawab* : 
```java
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
```
