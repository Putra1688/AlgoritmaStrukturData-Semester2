# <p align ="center">  LAPORAN PRAKTIKUM V </p> 
# <p align ="center">  Sorting </p> 
<br><br><br><br>

<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" width="30%"> </p>

<br><br><br><br><br>


<p align = "center"> Nama : Rangga Dwi Saputra </p>
<p align = "center"> NIM  : 2341720248 </p>
<p align = "center"> Prodi: D-IV Teknik Informatika</p>
<p align = "center"> Kelas: 1B / 23 </p>

<br><br><br><br><br>

### Percobaan 1 : Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Bubble Sort
Verifikasi Output hasil percobaan <br>
![image](./img/Screenshot%202024-03-20%20121010.png)
![image](./img/Screenshot%202024-03-20%20121035.png)

**Pertanyaan**
1.  Terdapat di method apakah proses bubble sort? <br>
    *Jawab* : proses buble sort ada pada methode `void BubbleSort()`, berikut kodenya <br>
    ```java
    void BubbleSort (){
    for (int i=0; i < listMhs.length ; i++) {
        for (int j=1; j < listMhs.length ; j++) {

            // proses pertukaran urutan
            if (listMhs[j].ipk > listMhs[j-1].ipk) {
                Mahasiswa23 tmp = listMhs[j];
                listMhs[j] = listMhs[j-1];
                listMhs[j-1] = tmp;
            }
        }
    }
    }
    ```
2.  Di dalam method bubbleSort(), untuk apa proses berikut ini?
    ```java
    if (listMhs[j].ipk > listMhs[j-1].ipk) {
                Mahasiswa23 tmp = listMhs[j];
                listMhs[j] = listMhs[j-1];
                listMhs[j-1] = tmp;
            }
    ```
    *Jawab* : mengganti nilai pada n dengan n-1 yang kemudian disimpan dalam variabel tp, jika nilai n lebih besar daripada n-1 <br>
3.  Perhatikan perulangan di dalam bubbleSort() di bawah ini:
    ```java
    for (int i=0; i < listMhs.length-1 ; i++) {
        for (int j=1; j < listMhs.length-i ; j++) {
    ```
    a. Apakah perbedaan antara kegunaan perulangan i dan perulangan j? <br>
    *Jawab* : perulangan `i`, batas atas iterasi yang harus berhenti sebelum elemen terakhir, yaitu pada `listMhs.length - 1`<br>

    b. Mengapa syarat dari perulangan `i` adalah `i<listMhs.length-1 ?` <br>
    *Jawab* : Karena `i` yang digunakan untuk mengakses nilai pada baris dalam array di inisialisasikan mulai dari 0, sehingga untuk mencapai batasan dari kapasitas array yang sudah ditentukan menggunakan -1 agar tidak melebihi batasan

    c. Mengapa syarat dari perulangan `j` adalah `j<listMhs.length-i` ? <br>
    *Jawab* :  setiap iterasi `j` pada iterasi `i` tertentu harus berhenti sebelum elemen terurut terakhir. Oleh karena itu, batas atas iterasi untuk `j` adalah `listMhs.length - i`
    
    d. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akan 
berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh? <br>
*Jawab* : perulangan i akan berlangsung sebanyak 49 kali, dan ada 49 tahap bubble sort yang ditempuh

### Percobaan 2 : Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Selection Sort
Verifikasi Output hasil percobaan <br>
![image](./img/img3.png)

**Pertanyaan**
Didalam methode selection sort, terdapat baris program seperti dibawah ini
```java
 int idxMin = i; 

       for (int j=i+1; j < listMhs.length ; j++) {
        if (listMhs[j].ipk > listMhs[idxMin].ipk) {
            idxMin = j;
         }
       }
```
Untuk apakah proses tersebut, jelaskan! <br>
*Jawab* :
- idxMin adalah indeks dari elemen terkecil yang telah ditemukan di indeks `i` pada iterasi saat ini
- kita mulai mencari elemen terkecil di bagian array yang belum terurut menggunakan perulangan `for (int j = i + 1; j < listMhs.length; j++)`
- menggunakan `if (listMhs[j].ipk > listMhs[idxMin].ipk)` untuk membandingkan nilai ipk dari elemen di indeks `j` dengan nilai ipk dari elemen di indeks `idxMin`. Jika nilai ipk dari elemen di indeks `j` lebih besar dari nilai ipk dari elemen di `indeks idxMin`, maka kita memperbarui idxMin menjadi `j`
-  selesai perulangan for, `idxMin` akan berisi indeks dari elemen terkecil di bagian array yang belum terurut. Kemudian, kita akan menukar elemen di indeks i dengan elemen terkecil

### Percobaan 3 : Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Insertion Sort
Verifikasi Output hasil percobaan <br>
![image](./img/img4.png)

**Pertanyaan** <br>
Ubahlah fungsi pada InsertionSort sehingga fungsi ini dapat melaksanakan proses sort dengan cara descending <br>
*Jawab* : Berikut modifikasinya <br>
```java
void InsertionSort (){
    for (int i=1; i < listMhs.length ; i++) { // pada indeks 0 data sudah dianggap terurut
        Mahasiswa23 tmp = listMhs[i];
        int j = i;
        
        while (j > 0 && listMhs[j-1].ipk < tmp.ipk) {
            listMhs[j] = listMhs[j-1];
            j--;
        }
    listMhs[j] = tmp;
    }
}
```

Berikut hasil compilenya:
```java
Data mahasiswa sebelum sorting = 
Nama = Nusa
Tahun Masuk = 2017
Umur = 25
IPK = 3.0
-------------------
Nama = Rara
Tahun Masuk = 2012
Umur = 19
IPK = 4.0
-------------------
Nama = Dompu
Tahun Masuk = 2018
Umur = 19
IPK = 3.5
-------------------
Nama = Abdul
Tahun Masuk = 2017
Umur = 23
IPK = 2.0
-------------------
Nama = Ummi
Tahun Masuk = 2019
Umur = 21
IPK = 3.75
-------------------
Data mahasiswa steelah sorting asc berdasarkan ipk
Nama = Rara
Tahun Masuk = 2012
Umur = 19
IPK = 4.0
-------------------
Nama = Ummi
Tahun Masuk = 2019
Umur = 21
IPK = 3.75
-------------------
Nama = Dompu
Tahun Masuk = 2018
Umur = 19
IPK = 3.5
-------------------
Nama = Nusa
Tahun Masuk = 2017
Umur = 25
IPK = 3.0
-------------------
Nama = Abdul
Tahun Masuk = 2017
Umur = 23
IPK = 2.0
-------------------
PS D:\POLINEMA\Semester 2\ALGORITMA & STRUKTUR DATA\AlgoritmaStrukturData-Semester2> 
```

## Latihan Praktikum
[image](./img/img5.png) <br>
Untuk kode bisa dilihat pada link berikut [praktikum]()

Berikut hasil compilenya <br>
```java
SELAMAT DATANG DI TRAVEL PHOENIX
===============================================
Berikut adalah daftar hotel yang tersedia: 
- Hotel : SAVANA
- Kota : Bandung
- Harga : Rp12.000.000,00
- Bintang : 4
===============================================      
- Hotel : Cemara
- Kota : Surabaya
- Harga : Rp9.125.000,00
- Bintang : 3
===============================================      
- Hotel : Mawar
- Kota : Semarang
- Harga : Rp3.210.000,00
- Bintang : 4
===============================================      
- Hotel : Bunga
- Kota : Blitar
- Harga : Rp800.000,00
- Bintang : 5
===============================================      
===============================================      
Filter daftar hotel? (Y/T) >>> y
Urutkan berdasarkan: 
   1. Harga
   2. Rating
>>> 1
===============================================
List harga hotel dari yang paling termurah
- Hotel : Bunga
- Kota : Blitar
- Harga : Rp800.000,00
- Bintang : 5
===============================================
- Hotel : Mawar
- Kota : Semarang
- Harga : Rp3.210.000,00
- Bintang : 4
===============================================
- Hotel : Cemara
- Kota : Surabaya
- Harga : Rp9.125.000,00
- Bintang : 3
===============================================
- Hotel : SAVANA
- Kota : Bandung
- Harga : Rp12.000.000,00
- Bintang : 4
===============================================
SELAMAT DATANG DI TRAVEL PHOENIX
===============================================
Berikut adalah daftar hotel yang tersedia: 
- Hotel : SAVANA
- Kota : Bandung
- Harga : Rp12.000.000,00
- Bintang : 4
===============================================      
- Hotel : Cemara
- Kota : Surabaya
- Harga : Rp9.125.000,00
- Bintang : 3
===============================================      
- Hotel : Mawar
- Kota : Semarang
- Harga : Rp3.210.000,00
- Bintang : 4
===============================================      
- Hotel : Bunga
- Kota : Blitar
- Harga : Rp800.000,00
- Bintang : 5
===============================================      
===============================================      
Filter daftar hotel? (Y/T) >>> y
Urutkan berdasarkan: 
   1. Harga
   2. Rating
>>> 1
===============================================
List harga hotel dari yang paling termurah
- Hotel : Bunga
- Kota : Blitar
- Harga : Rp800.000,00
- Bintang : 5
===============================================
- Hotel : Mawar
- Kota : Semarang
- Harga : Rp3.210.000,00
- Bintang : 4
===============================================
- Hotel : Cemara
- Kota : Surabaya
- Harga : Rp9.125.000,00
- Bintang : 3
===============================================
- Hotel : SAVANA
- Kota : Bandung
- Harga : Rp12.000.000,00
- Bintang : 4
===============================================
```