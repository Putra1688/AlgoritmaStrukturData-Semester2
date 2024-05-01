# <p align ="center">  LAPORAN PRAKTIKUM IV </p> 
# <p align ="center">  Brute Force Devide Conquer </p> 
<br><br><br><br>

<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" width="30%"> </p>

<br><br><br><br><br>


<p align = "center"> Nama : Rangga Dwi Saputra </p>
<p align = "center"> NIM  : 2341720248 </p>
<p align = "center"> Prodi: D-IV Teknik Informatika</p>
<p align = "center"> Kelas: 1B / 23 </p>

<br><br><br><br><br> 

## Percobaan 1 : Menghitung Nilai Faktorial dengan Algoritma Brute Force dan Divide and Conquer
Kode program dari percobaan ini bisa diihat pada link berikut untuk [Class Methode ](https://github.com/Putra1688/AlgoritmaStrukturData-Semester2/blob/main/Pertemuan5_BruteForceDivideConquer/src/Faktorial23.java) dan untuk [Class Main](https://github.com/Putra1688/AlgoritmaStrukturData-Semester2/blob/main/Pertemuan5_BruteForceDivideConquer/src/MainFaktorial.java)

### 4.1.2 Hasil Compile
Didapatkan output sebagai berikut
![image](./image/img1.png)
### 4.1.3 Pertanyaan
1.  Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan 
perbedaan bagian kode pada penggunaan if dan else!  
2.  Apakah memungkinkan perulangan pada method faktorialBF() dirubah selain menggunakan 
for?Buktikan! 
3.  Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); !
### 4.1.4 Jawaban
1.   Jika memenuhi kondisi if dimana n == 1 maka nilai yang direturnkan adalah 1. Jika kondisinya n bukan 1 (else) maka nilai yang direturnkan nilai fakto dioperasikan terlebih dahulu menggunakan rumus `fakto = n * faktorialDC(n-1);`, nilai n dikali dengan rekursif fungsi itu sendiri yang nilai n nya dikurangi 1
2.  Tentu saja, bisa menggunakan perulangan while atau do while. Berikut contoh menggunakan while: <br>
    ```java
    public int faktorialBF(int n) {
        int fakto = 1;
        int i=1;
        while (i<n) {
            fakto = fakto * i;
            i++;
        }
        return fakto;
    }
    ```
3.  `fakto *= i;` nilai fakto langsung dikali dengan nilai i. Sedangkan `int fakto = n * faktorialDC(n-1);` nilai fakto yang tersimpan dalam tipe data int dioperasikan terlebih dahulu, nilai n dikali dengan rekursif fungsi itu sendiri yang nilai n nya dikurangi 1
## Percobaan 2 : Menghitung Hasil Pangkat dengan Algoritma Brute Force dan Divide and Conquer
Kode program dari percobaan ini bisa diihat pada link berikut untuk [Class Methode ](https://github.com/Putra1688/AlgoritmaStrukturData-Semester2/blob/main/Pertemuan5_BruteForceDivideConquer/src/Pangkat23.java) dan untuk [Class Main](https://github.com/Putra1688/AlgoritmaStrukturData-Semester2/blob/main/Pertemuan5_BruteForceDivideConquer/src/MainPagkat.java)

### 4.2.2 Hasil Compile
Hasil compile didapatkan output sebagai berikut: <b>
![image](./image/img2.png)
### 4.2.3 Pertanyaan
1.  Jelaskan mengenai perbedaan 2 method yang dibuat yaitu PangkatBF() dan PangkatDC()! 
2.  Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan! 
3.  Modifikasi kode program tersebut, anggap proses pengisian atribut dilakukan dengan 
konstruktor. 
4.  Tambahkan menu agar salah satu method yang terpilih saja yang akan dijalankan menggunakan switch-case! 
### 4.2.3 Jawab
1.  Metode Brute Force menggunakan pendekatan iteratif dengan melakukan perkalian sebanyak `n` kali, di mana `n` adalah pangkat yang diinginkan.
Pada setiap iterasi, nilai `a` akan dikalikan dengan dirinya sendiri sebanyak `n` kali <br>
Metode Devide and Conquer menggunakan pendekatan rekursif untuk membagi masalah menjadi submasalah yang lebih kecil, membagi pangkat `n` menjadi dua bagian, sehingga kompleksitas waktu dapat berkurang
2.  tahap *combine* tidak diekspresikan secara langsung dalam kode tersebut. Tahap *combine* dalam algoritma Divide and Conquer umumnya mengacu pada penggabungan (combine) hasil dari submasalah yang lebih kecil untuk membentuk solusi dari masalah asli, dalam kode pangkatDC, penggabungan nilai-nilai submasalah yang lebih kecil telah terjadi secara implisit melalui operasi perkalian (*). Saat kita memanggil `pangkatDC(a, n/2)` untuk memperoleh hasil pangkat dari nilai setengah n, kedua hasil tersebut akan digabungkan melalui operasi perkalian pada ekspresi `pangkatDC(a, (n-1)/2) * pangkatDC(a, (n-1)/2) * a` atau `pangkatDC(a, n/2) * pangkatDC(a, n/2)` tergantung pada nilai n (genap atau ganjil).
3.  Ini adalah modifikasi pengisian atribut dengan konstruktor <br>
```java
Pangkat23 [] png = new Pangkat23[elemen];
        for (int i=0; i < elemen; i++){
            // png [i] = new Pangkat23();
            System.out.print("Masukkan nilai yang ingin dipangkatkan: ");
            int nilai = sc.nextInt();
            // png[i].nilai = nilai;
            System.out.print("Masukkan nilai pemangkatnya: ");
            int pangkat = sc.nextInt();
            // png[i].pangkat = pangkat; 
            png[i] = new Pangkat23(nilai, pangkat);
        }
```
di class Pangkat23 ditambahkan konstruktor yang menerima nilai dan pangkat sebagai variabel <br>
```java
 public Pangkat23(int nilai, int pangkat) {
        this.nilai = nilai;
        this.pangkat = pangkat;
    }
```
4.  Berikut modifikasi agar salah satu method yang terpilih saja yang akan dijalankan menggunakan switch-case!  <br>
```java
System.out.println("Methode perhitungan :");
        System.out.println("1.\tBrute Force\n2.\tDevide and Conquer");
        int pilih = sc.nextInt();

        switch (pilih) {
            case 1 :
            System.out.println("HASIL PANGKAT - BRUTE FORCE");
            for (int i=0; i < elemen; i++) {
            System.out.println("hasil dari "
                +png[i].nilai+ " pangkat "
                +png[i].pangkat+ " adalah "
                +png[i].pangkatBF(png[i].nilai, png[i].pangkat)
                );
            }
            break;
            case 2:
            System.out.println("HASIL - DEVIDE AND CONQUER");
            for (int i=0; i < elemen; i++) {
                System.out.println("hasil dari "
                    +png[i].nilai+ " pangkat "
                    +png[i].pangkat+ " adalah "
                    +png[i].pangkatDC(png[i].nilai, png[i].pangkat)
                    );
                }
            break;
            default :
            System.out.println("pilihan invalid");
            break;
            }
```

## Percobaan 3 : Menghitung Hasil Pangkat dengan Algoritma Brute Force dan Divide and Conquer
Kode program dari percobaan ini bisa diihat pada link berikut untuk [Class MainSum](https://github.com/Putra1688/AlgoritmaStrukturData-Semester2/blob/main/Pertemuan5_BruteForceDivideConquer/src/MainSum.java) dan untuk [Class Sum](https://github.com/Putra1688/AlgoritmaStrukturData-Semester2/blob/main/Pertemuan5_BruteForceDivideConquer/src/Sum23.java)
### 4.3.1 Hasil Compile
```java
=========================
Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9) : Masukkan jumlah bulan: 5    
=========================
Masukkan keuntungan pada bulan ke-1 = 8.5
Masukkan keuntungan pada bulan ke-2 = 9.54
Masukkan keuntungan pada bulan ke-3 = 7.2
Masukkan keuntungan pada bulan ke-4 = 9.1
Masukkan keuntungan pada bulan ke-5 = 6
=========================
Algoritma Brute Force
Total keuntungan perusahaan selama 5 bulan adalah 40.339999999999996
=========================
Algoritma Devide Conquer
Total keuntungan perusahaan selama 5 bulan adalah 40.339999999999996
PS D:\POLINEMA\Semester 2\ALGORITMA & STRUKTUR DATA\AlgoritmaStrukturData-Semester2>
```
### 4.3.2 Pertanyaan
1.  Mengapa terdapat formulasi return value `return lsum+rsum+arr[mid];`?Jelaskan! <br>
*Jawab* : Formulasi return value return lsum + rsum + arr[mid]; muncul saat ingin menghitung total dari seluruh elemen dalam array yang dipisahkan menjadi dua bagian saat menggunakan algoritma Divide and Conquer<br>
2.  Kenapa dibutuhkan variable `mid` pada method `TotalDC()`? <br>
*Jawab* : untuk menjadi titik yang membagi semua nilai menjadi 2 bagian. dan variabel `mid` menjadi penengah dari nilai yang dikelompokkan di kanan dan dikirinya <br>
3. Program perhitungan keuntungan suatu perusahaan ini hanya untuk satu perusahaan saja. 
Bagaimana cara menghitung sekaligus keuntungan beberapa bulan untuk beberapa 
perusahaan.(Setiap perusahaan bisa saja memiliki jumlah bulan berbeda-beda)? Buktikan 
dengan program! <br>
*Jawab* : Modifikasi program bisa dilihat pada link ini untuk [Class MainSum](https://github.com/Putra1688/AlgoritmaStrukturData-Semester2/blob/main/Pertemuan5_BruteForceDivideConquer/src/MainSum.java) dan untuk [Class Sum](https://github.com/Putra1688/AlgoritmaStrukturData-Semester2/blob/main/Pertemuan5_BruteForceDivideConquer/src/Sum23.java)

## Latihan Praktikum
[image](./image/img3) <br>
Tentukan: <br> 
a) top_acceleration tertinggi menggunakan Divide and Conquer! <br>
b) top_acceleration terendah menggunakan Divide and Conquer! <br>
c) Rata-rata top_power dari seluruh mobil menggunakan Brute Force! <br> 

Berikut kode program yang digunakan bisa dilihat pada [Showroom](https://github.com/Putra1688/AlgoritmaStrukturData-Semester2/blob/main/Pertemuan5_BruteForceDivideConquer/praktikum/Showroom23.java)
   
### Hasil Compile
```java
PS D:\POLINEMA\Semester 2\ALGORITMA & STRUKTUR DATA\AlgoritmaStrukturData-Semester2>  & 'C:\Program Files\Java\jdk-17\bin\java.exe' '-XX:+ShowCodeDetailsInExceptionMessages' '-cp' 'C:\Users\Rangga Dwi Saputra\AppData\Roaming\Code\User\workspaceStorage\5af40744b181229fd2904db21f5f351e\redhat.java\jdt_ws\AlgoritmaStrukturData-Semester2_d524005e\bin' 'Pertemuan5_BruteForceDivideConquer.praktikum.Showroom23'
Top Acceleration tertinggi (DIVIDE AND CONQUER): 6816
Top Acceleration terendah (DIVIDE AND CONQUER): 3700
Rata-rata top power (BRUTE FORCE) : 633.0
```
