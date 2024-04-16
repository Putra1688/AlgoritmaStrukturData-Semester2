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
                        System.out.println("Barang teratas: " + barangTeratas.nama);
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

### Percobaan 2 : Konversi Kode Barang ke Biner
Verifikasi hasil percobaan <br>
```java
Masukkan kapasitas Gudang: 1
Menu:
1.  Tambah Barang
2.  Ambil Barang
3.  Tampilkan tumpukan barang
4.  Lihat Barang teratas
5.  Keluar
Pilih operasi: 1
Masukkan kode barang: 13
Masukkan nama barang: Setrika
Masukkan nama kategori: Elektronik
Barang Setrika berhasil ditambahkan ke Gudang
Menu:
1.  Tambah Barang
2.  Ambil Barang
3.  Tampilkan tumpukan barang
4.  Lihat Barang teratas
5.  Keluar
Pilih operasi: 2
Barang Setrika diambil dari Gudang.
Kode unik dalam biner: 1101
```
**Pertanyaan**
1.  Pada method konversiDesimalKeBiner, ubah kondisi perulangan menjadi while (kode!=0), 
bagaimana hasilnya? Jelaskan alasannya!
*Jawab* : Tidak ada perbedaanya, karena persyaratan perulangan berjalan masih tetap sama yaitu kode lebih dari 0 atau selama kode bukan 0 
2.  Jelaskan alur kerja dari method konversiDesimalKeBiner!
*Jawab* : <br>
    - Diberikan sebuah bilangan desimal (kode), yang akan dikonversi menjadi bilangan biner.
    - Program membuat sebuah objek StackKonversi23 yang digunakan untuk menyimpan sisa pembagian bilangan desimal dengan 2 (untuk mendapatkan bit biner).
    - Selama kode tidak sama dengan 0, program akan melakukan langkah-langkah berikut:
        - Menghitung sisa pembagian (sisa) dari kode dengan 2.
        - Memasukkan sisa ke dalam stack menggunakan metode push.
        - Memperbarui nilai kode dengan hasil pembagian kode dengan 2.
    - Setelah perulangan selesai, program membuat string kosong biner untuk menyimpan hasil konversi biner.
    - Program melakukan perulangan selama stack tidak kosong, dan pada setiap iterasi:
        - Mengeluarkan (pop) elemen dari stack dan menambahkannya ke string biner.
    - Setelah perulangan selesai, program mengembalikan string biner yang berisi representasi biner dari bilangan desimal awal.

### Percobaan 3 : Konversi Notasi Infix ke Postfix
Verifikasi hasil percobaan <br>
```java
Masukkan ekspresi matematika (infix) : a+b* (c+d-e) / f
Postfix: ab cd+e- * f/+
PS D:\POLINEMA\Semester 2\ALGORITMA & STRUKTUR DATA\AlgoritmaStrukturData-Semester2>
```
**Pertanyaan**
1.  Pada method derajat, mengapa return value beberapa case bernilai sama? Apabila return 
value diubah dengan nilai berbeda-beda setiap case-nya, apa yang terjadi? <br>
*Jawab* : karena angka tersebut menunjukkan prioritas nilai dari yang tertinggi ke terendah. Apabila dirubah, maka prioritas tertinggi akan mengikuti angka yang terbesar
2.  Jelaskan alur kerja method konversi! <br>
*Jawab* : <br>
- Metode konversi menerima sebuah string Q yang merupakan ekspresi dalam notasi infix.
- Sebuah string kosong p digunakan untuk menyimpan ekspresi postfix yang dihasilkan.
- Program melakukan iterasi melalui setiap karakter dalam string Q menggunakan loop for.
- Pada setiap iterasi, program memeriksa apakah karakter saat ini adalah operand atau operator:
    - Jika karakter adalah operand, yaitu merupakan angka atau huruf, karakter tersebut langsung ditambahkan ke string p.
    - Jika karakter adalah tanda kurung buka (, maka karakter tersebut dimasukkan ke dalam stack menggunakan metode push.
    - Jika karakter adalah tanda kurung tutup ), maka program akan melakukan loop untuk mengeluarkan operator-operator dari stack dan menambahkannya ke string p hingga bertemu dengan tanda kurung buka (. Tanda kurung buka tersebut juga dihapus dari stack menggunakan metode pop.
    - Jika karakter adalah operator (+, -, *, /, %, ^), program akan memeriksa prioritas operator dengan membandingkannya dengan operator-operator yang ada di dalam stack:
        -   Selama stack tidak kosong dan prioritas operator di puncak stack lebih besar atau sama dengan prioritas operator saat ini, operator di puncak stack akan dihapus dan ditambahkan ke string p. Ini dilakukan dengan menggunakan loop while.
        - Setelah tidak ada lagi operator yang harus dihapus dari stack, operator saat ini ditambahkan ke stack menggunakan metode push.
- Setelah loop selesai, program mengembalikan string p yang merupakan representasi postfix dari ekspresi infix awal.
3.  Pada method konversi, apa fungsi dari potongan kode `c = Q.charAt(i);`?

### Latihan Praktikum
Pada Percobaan 1, tambahkan dua method berikut pada class Gudang:
- Method lihatBarangTerbawah digunakan untuk mengecek barang pada tumpukan terbawah
- Method cariBarang digunakan untuk mencari ada atau tidaknya barang berdasarkan kode barangnya atau nama barangnya

A. Methode Lihat Barang Terbawah <br>
Code: <br>
```java
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
```
Verifikasi Hasil Percobaan <br>
```java
Masukkan kapasitas Gudang: 3
Menu:
1.  Tambah Barang
2.  Ambil Barang
3.  Tampilkan tumpukan barang
4.  Lihat Barang teratas
5. Lihat Barang terbawah
6.  Keluar
Pilih operasi: 1
Masukkan kode barang: 21
Masukkan nama barang: Kaos
Masukkan nama kategori: Pakaian
Barang Kaos berhasil ditambahkan ke Gudang
Menu:
1.  Tambah Barang
2.  Ambil Barang
3.  Tampilkan tumpukan barang
4.  Lihat Barang teratas
5. Lihat Barang terbawah
6.  Keluar
Pilih operasi: 1
Masukkan kode barang: 23
Masukkan nama barang: Kacamata
Masukkan nama kategori: aksesoris
Barang Kacamata berhasil ditambahkan ke Gudang
Menu:
1.  Tambah Barang
2.  Ambil Barang
3.  Tampilkan tumpukan barang
4.  Lihat Barang teratas
5. Lihat Barang terbawah
6.  Keluar
Pilih operasi: 1
Masukkan kode barang: 22
Masukkan nama barang: Celana 
Masukkan nama kategori: pakaian
Barang Celana  berhasil ditambahkan ke Gudang
Menu:
1.  Tambah Barang
2.  Ambil Barang
3.  Tampilkan tumpukan barang
4.  Lihat Barang teratas
5. Lihat Barang terbawah
6.  Keluar
Pilih operasi: 3
Rincian tumpukan barang di Gudang:
Kode 22: Celana  (Kategori pakaian)
Kode 23: Kacamata (Kategori aksesoris)
Kode 21: Kaos (Kategori Pakaian)
Menu:
1.  Tambah Barang
2.  Ambil Barang
3.  Tampilkan tumpukan barang
4.  Lihat Barang teratas
5. Lihat Barang terbawah
6.  Keluar
Pilih operasi: 4
Barang teratas: Celana
Barang teratas: Celana
Menu:
1.  Tambah Barang
2.  Ambil Barang
3.  Tampilkan tumpukan barang
4.  Lihat Barang teratas
5. Lihat Barang terbawah
6.  Keluar
Pilih operasi: 5

Barang terbawah: KaosBarang terbawah: Kaos
Menu:
1.  Tambah Barang
2.  Ambil Barang
3.  Tampilkan tumpukan barang
4.  Lihat Barang teratas
5. Lihat Barang terbawah
6.  Keluar
Pilih operasi:
```

B. Methode Cari Barang
Code : <br>
```java
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
```
Hasil Percoban: <br>
```java
Masukkan kapasitas Gudang: 3       
Menu:
1.  Tambah Barang
2.  Ambil Barang
3.  Tampilkan tumpukan barang
4.  Lihat Barang teratas
5.  Lihat Barang terbawah
6.  Cari Barang
7.  Keluar
Pilih operasi: 1
Masukkan kode barang: 23
Masukkan nama barang: Kaos
Masukkan nama kategori: Pakaian
Barang Kaos berhasil ditambahkan ke Gudang
Menu:
1.  Tambah Barang
2.  Ambil Barang
3.  Tampilkan tumpukan barang
4.  Lihat Barang teratas
5.  Lihat Barang terbawah
6.  Cari Barang
7.  Keluar
Pilih operasi: 1
Masukkan kode barang: 21
Masukkan nama barang: Celana
Masukkan nama kategori: Pakaian
Barang Celana berhasil ditambahkan ke Gudang
Menu:
1.  Tambah Barang
2.  Ambil Barang
3.  Tampilkan tumpukan barang
4.  Lihat Barang teratas
5.  Lihat Barang terbawah
6.  Cari Barang
7.  Keluar
Pilih operasi: 1
Masukkan kode barang: 22
Masukkan nama barang: Sepatu
Masukkan nama kategori: Pakaian
Barang Sepatu berhasil ditambahkan ke Gudang
Menu:
1.  Tambah Barang
2.  Ambil Barang
3.  Tampilkan tumpukan barang
4.  Lihat Barang teratas
5.  Lihat Barang terbawah
6.  Cari Barang
7.  Keluar
Pilih operasi: 3
Rincian tumpukan barang di Gudang:
Kode 22: Sepatu (Kategori Pakaian)
Kode 21: Celana (Kategori Pakaian)
Kode 23: Kaos (Kategori Pakaian)
Menu:
1.  Tambah Barang
2.  Ambil Barang
3.  Tampilkan tumpukan barang
4.  Lihat Barang teratas
5.  Lihat Barang terbawah
6.  Cari Barang
7.  Keluar
Pilih operasi: 6
Cari berdasarkan:
1.      Kode
2.      Nama
Pilihan: 1
Masukkan kode barang yang ingn dicari: 23
Barang yang dicari :
Kode     : 23
Nama     : Kaos
Kategori : Pakaian
Menu:
1.  Tambah Barang
2.  Ambil Barang
3.  Tampilkan tumpukan barang
4.  Lihat Barang teratas
5.  Lihat Barang terbawah
6.  Cari Barang
7.  Keluar
Pilih operasi: 6
Cari berdasarkan:
1.      Kode
2.      Nama
Pilihan: 2
Masukkan nama Barang yangingin dicari: Data tidak ditemukan!
```