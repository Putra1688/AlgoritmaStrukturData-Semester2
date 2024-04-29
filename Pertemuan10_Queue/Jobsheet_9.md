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

### Pertanyaan
1.  Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size 
bernilai 0? <br>
    *Jawab* :

2.  Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut! `if (rear == max-1) {rear = 0;`<br>
*Jawab* :
3.  Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut! `if (front == max-1) {rear = 0;` <br>
*Jawab* :

4.  Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0), 
melainkan int i=front? <br>
*Jawab* :
5.  Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut! `i = (i + 1) % max;` <br>
*Jawab*:
6.  Tunjukkan potongan kode program yang merupakan queue overflow! <br>
*Jawab* :
7.  Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan 
dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi queue overflow dan queue underflow, program dihentikan! <br>
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
