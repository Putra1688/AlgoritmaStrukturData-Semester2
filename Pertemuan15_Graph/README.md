# Pertemuan 15 : Jobsheet 12
## **-> Graph**
<br>


**Nama : Rangga Dwi Saputra** <br>
**NIM  : 2341720248** <br>
**Kelas : TI-1B**

## Percobaan 1 : Implementasi Graph menggunakan Linked List
**Hasil Running pada langkah 14 ->>**
```java
InDegree dari Gedung A: 0
OutDegree dari Gedung A: 2
Degree dari Gedung A: 2
Gedung A terhubung dengan 
C (100 m, B (50 m, 
Gedung B terhubung dengan 
D (70 m, 
Gedung C terhubung dengan 
D (40 m, 
Gedung D terhubung dengan 
E (60 m, 
Gedung E terhubung dengan 
F (80 m, 

PS D:\POLINEMA\Semester 2\ALGORITMA & STRUKTUR DATA\AlgoritmaStrukturData-Semester2>
```
**Hasil Running pada langkah 17->>**
```java
Gedung A terhubung dengan
C (100 m, B (50 m,
Gedung C terhubung dengan
D (40 m,
Gedung D terhubung dengan
E (60 m,
Gedung E terhubung dengan
F (80 m,
```

**Pertanyaan**
1.  Perbaiki kode program Anda apabila terdapat error atau hasil kompilasi kode tidak sesuai! 
    - *Jawab* : Sejauh ini tidak ada kode program yang eror,sesuai dengan jobsheet
2.  Pada class Graph, terdapat atribut list[] bertipe DoubleLinkedList. Sebutkan tujuan pembuatan variabel tersebut! 
    - *Jawab* : untuk menyimpan nilai asal, tujuan, dan jarak
3.  Jelaskan alur kerja dari method removeEdge! 
4.  Apakah alasan pemanggilan method addFirst() untuk menambahkan data, bukan method add jenis lain saat digunakan pada method addEdge pada class Graph? 
    - *Jawab* : program akan mealkukan perulangan dengan awal i = 0 dan syarat apabila nilai i kurang dari nilai vertex. kemudian dilakukan pengecekan, jika nilai i sama dengan nilai tujuan maka data `asal` yang tersimpan didalam array list akan menghapus nilai `tujuan`
5.  Modifikasi kode program sehingga dapat dilakukan pengecekan apakah terdapat jalur antara suatu node dengan node lainnya, seperti contoh berikut (Anda dapat memanfaatkan Scanner). 

## Percobaan 2 : Impelementasi Graph menggunakan Matriks
**Hasil Percobaan ->>**
```java
Gedung A:
Gedung A (0 m), Gedung B (50 m), Gedung C (0 m), Gedung D (0 m), nilai i :1
Gedung B:
Gedung A (60 m), Gedung B (0 m), Gedung C (70 m), Gedung D (0 m), nilai i :2
Gedung C:
Gedung A (0 m), Gedung B (80 m), Gedung C (0 m), Gedung D (40 m), nilai i :3
Gedung D:
Gedung A (90 m), Gedung B (0 m), Gedung C (0 m), Gedung D (0 m), Hasil setelah penghapusan edge
nilai i :0
Gedung A:
Gedung B:
Gedung A (60 m), Gedung B (0 m), Gedung C (70 m), Gedung D (0 m), nilai i :2
Gedung C:
Gedung A (0 m), Gedung C (0 m), Gedung D (40 m), nilai i :3
Gedung D:
Gedung A (90 m), Gedung B (0 m), Gedung C (0 m), Gedung D (0 m),
PS D:\POLINEMA\Semester 2\ALGORITMA & STRUKTUR DATA\AlgoritmaStrukturData-Semester2>
```
**Pertanyaan** 
1.  Perbaiki kode program Anda apabila terdapat error atau hasil kompilasi kode tidak sesuai! 
    - *Jawab* : sejauh ini kode program yang sesuai dengan jobsheet tidak menimbulkan eror, aman saja
2.  Apa jenis graph yang digunakan pada Percobaan 2? 
    - *Jawab* : Berdasarkan kode tersebut, jenis graph yang digunakan adalah Graph Berarah (Directed Graph) yang mana Metode makeEdge menetapkan nilai jarak dari simpul asal ke simpul tujuan, tetapi tidak menetapkan nilai jarak dari simpul tujuan ke simpul asal. Ini menunjukkan bahwa setiap edge memiliki arah tertentu.


3.  Apa maksud dari dua baris kode berikut? 
    ```java
    gdg.makeEdge(1, 2, 70);
    gdg.makeEdge(2, 1, 80);
    ```
    - *Jawab*:  Menambahkan edge dari simpul 1 ke simpul 2 dengan bobot 70dan Menambahkan edge dari simpul 2 ke simpul 1 dengan bobot 80
4.  Modifikasi kode program sehingga terdapat method untuk menghitung degree, termasuk inDegree dan outDegree!

## Latihan Praktikum
1. Modifikasi kode program pada class GraphMain sehingga terdapat menu program yang bersifat 
dinamis, setidaknya terdiri dari: 
a) Add Edge 
b) Remove Edge 
c) Degree 
d) Print Graph 
e) Cek Edge 
Pengguna dapat memilih menu program melalui input Scanner 
2. Tambahkan method updateJarak pada Percobaan 1 yang digunakan untuk mengubah jarak 
antara dua node asal dan tujuan! 
3. Tambahkan method hitungEdge untuk menghitung banyaknya edge yang terdapat di dalam graf!