# Pertemuan 10 - Jobsheet 10
## **-> QUEUE**
<br>

**Nama&nbsp;: Rangga Dwi Saputra** <br>
**NIM &nbsp; : 2341720248** <br>
**Kelas : TI-1B**

### Praktikum 1
**Hasil Percobaan ->>**
```java
PS D:\POLINEMA\Semester 2\ALGORITMA & STRUKTUR DATA\AlgoritmaStrukturData-Semester2>  & 'C:\Program Files\Java\jdk-17\bin\java.exe' '-XX:+ShowCodeDetailsInExceptionMessages' '-cp' 'C:\Users\Rangga Dwi Saputra\AppData\Roaming\Code\User\workspaceStorage\5af40744b181229fd2904db21f5f351e\redhat.java\jdt_ws\AlgoritmaStrukturData-Semester2_d524005e\bin' 'Pertemuan10_Queue.QueueMain'
Masukkan kapasitas queue: 4
Masukkan operasi yang di inginkan :
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
------------------------------------
1
Masukkan data baru: 
15
Masukkan operasi yang di inginkan :
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
------------------------------------
1
Masukkan data baru:
31
Masukkan operasi yang di inginkan :
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
------------------------------------
4
Elemen terdepan: 15
Masukkan operasi yang di inginkan :
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
------------------------------------ 
``` 
Untuk kode program dari hasil compile tersebut bisa dilihat pada link berikut untuk kode program [class main](https://github.com/Putra1688/AlgoritmaStrukturData-Semester2/blob/main/Pertemuan10_Queue/QueueMain.java) dan [class atribut & methode](https://github.com/Putra1688/AlgoritmaStrukturData-Semester2/blob/main/Pertemuan10_Queue/Queue22.java)

**Pertanyaan**
1.  Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size 
bernilai 0? <br>
    *Jawab* : `front = rear = -1` digunakan untuk menunjukkan bahwa tidak ada elemen di dalam antrian. Sedangkan untuk `size = 0` menunjukkan bahwa dalam keadaan awal antrian masih kosong

2.  Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut! `if (rear == max-1) {rear = 0;`<br>
*Jawab* : `rear == max-1` diartikan bahwa antrian telah mencapai batas maksimalnya. Jika antrian masih memiliki ruang kosong setelah elemen terakhir, `rear = 0` akan mengatur ulang bahwa elemen baru akan ditambahkan di awal array. Karena sstelah indeks terakhir aka dilanjutkan kembali ke awal array.
3.  Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut! `if (front == max-1) {rear = 0;` <br>
*Jawab* : `front == max-1` menunjukkan bahwa sudah mencapai batas maksimum yang artinya elemen terakhir telah dikeluarkan dari antrian, `rear = 0` memastikan bahwa saat antrian kosong, rear akan selalu menunjuk ke awal array, sehingga ketika ada elemen baru ditambahkan melalui operasi Enqueue, elemen tersebut akan dimulai dari indeks 0. 

4.  Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0), 
melainkan int i=front? <br>
*Jawab* : ketika kita mencapai batas akhir array, kita kembali ke awal array untuk menyimpan elemen baru, sehingga membentuk lingkaran. front adalah posisi paling awal dalam array setelah elemen ditambahkan yang tidak selalu berada di indeks 0, jadi i dimulai dari posisi paling depan
5.  Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut! `i = (i + 1) % max;` <br>
*Jawab*: Kode itu digunakan untuk menggerakkan variabel iterasi i melalui array. Operasi % max akan menghasilkan sisa pembagian dari i + 1 terhadap max. variabel i akan bergerak dari front hingga rear, dan kemudian kembali ke awal array, menangkap semua elemen dalam antrian sirkular.
6.  Tunjukkan potongan kode program yang merupakan queue overflow! <br>
*Jawab* : antrian overflow terjadi ketika mencoba menambahkan elemen ke dalam antrian yang sudah penuh, yang ditunjukkan dalam kode program berikut:
```java
if (isEmpty ()) {
                front = rear = 0;
            } else if ( rear == max -1 ) {
                rear = 0;
            } else {
                rear++;
            }

            data[rear] = dt;
            size++;
```
7.  Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi queue overflow dan queue underflow, program dihentikan! <br>
*Jawab* : 

### Praktikum 2
**Hasil Percobaan ->>**
```java
PS D:\POLINEMA\Semester 2\ALGORITMA & STRUKTUR DATA\AlgoritmaStrukturData-Semester2>  & 'C:\Program Files\Java\jdk-17\bin\java.exe' '-XX:+ShowCodeDetailsInExceptionMessages' '-cp' 'C:\Users\Rangga Dwi Saputra\AppData\Roaming\Code\User\workspaceStorage\5af40744b181229fd2904db21f5f351e\redhat.java\jdt_ws\AlgoritmaStrukturData-Semester2_d524005e\bin' 'Pertemuan10_Queue.NasabahMain' 
Masukkan kapasitas queue: 8
Pilih Menu :
1. Antrian baru
2. Antrian Keluar
3. Cek Antrian terdepan
4. Cek Semua Antrian
------------------------------------
1
No Rekening: 12345
Nama: Dewi
Alamat: Malang
Umur: 23
Saldo: 1300000
Pilih Menu :
1. Antrian baru
2. Antrian Keluar
3. Cek Antrian terdepan
4. Cek Semua Antrian
------------------------------------
1
No Rekening: 32940
Nama: Susan
Alamat: Surabaya
Umur: 39
Saldo: 42000000
Pilih Menu :
1. Antrian baru
2. Antrian Keluar
3. Cek Antrian terdepan
4. Cek Semua Antrian
------------------------------------
4
12345 Dewi Malang 231300000.0
32940 Susan Surabaya 394.2E7
Jumlah elemen = 2
Pilih Menu :
1. Antrian baru
2. Antrian Keluar
3. Cek Antrian terdepan
4. Cek Semua Antrian
------------------------------------
```
Untuk kode program dari hasil compile tersebut bisa dilihat pada link berikut untuk kode program [Nasabah class Main](https://github.com/Putra1688/AlgoritmaStrukturData-Semester2/blob/main/Pertemuan10_Queue/NasabahMain.java) dan [Nasabah class Methode](https://github.com/Putra1688/AlgoritmaStrukturData-Semester2/blob/main/Pertemuan10_Queue/Nasabah.java)

**Pertanyaan**
1.  Pada Class main, jelaskan fungsi IF pada potongan kode program berikut!
```java
if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat)
                        && data.umur !=0 && data.saldo !=0) {
                    System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama + " " + data.alamat + " " + data.umur + "" + data.saldo);
                    break;
                }
```
*Jawab* : <br>

2.  Lakukan modifikasi program dengan menambahkan method baru bernama peekRear pada class 
Queue yang digunakan untuk mengecek antrian yang berada di posisi belakang! Tambahkan pula 
daftar menu 5. Cek Antrian paling belakang pada class QueueMain sehingga method peekRear 
dapat dipanggil!

*Jawab* : 

### Latihan Tugas





