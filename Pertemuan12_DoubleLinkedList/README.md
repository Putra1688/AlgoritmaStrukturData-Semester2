# Pertemuan 12 : Jobsheet 11
## **-> Double Linked List**
<br>


**Nama : Rangga Dwi Saputra** <br>
**NIM  : 2341720248** <br>
**Kelas : TI-1B**

## Kegiatan Praktikum 1
**Hasil Percobaan ->>**

```java
Linked List Kosong!
Size    : 0
=============================
7       4       3
Berhasil diisi
Size    : 3
=============================
40      7       4       3
Berhasil diisi
Size    : 5
=============================
Linked List Kosong!
Size    : 0
PS D:\POLINEMA\Semester 2\ALGORITMA & STRUKTUR DATA\AlgoritmaStrukturData-Semester2>
```

Untuk kode program dari output tersebut bisa dilihat pada link berikut [Source Code](https://github.com/Putra1688/AlgoritmaStrukturData-Semester2/tree/main/Pertemuan12_DoubleLinkedList)

**Pertanyaan**
1. Jelaskan perbedaan antara single linked list dengan double linked lists! <br>
    *Jawab:* Pada SinggleLinkedList setiap node terhubung ke node setelahnya saja, sedangkan pada DoubleLinkedList juga bisa terhubung ke node sebelumnya.
2.  Perhatikan class Node, di dalamnya terdapat atribut next dan prev. Untuk apakah atribut 
tersebut? <br>
    *Jawab* : Atribut next Menunjuk atau mereferensikan node berikutnya dalam urutan linked list. Sedangkan atribut prev Menunjuk atau mereferensikan node sebelumnya dalam urutan linked list.
3.  Perhatikan konstruktor pada class DoubleLinkedLists. Apa kegunaan inisialisasi atribut head dan size seperti pada gambar berikut ini?
    ```java
    public DoubleLinledList() {
        head = null;
        size = 0;
    }
    ```
    *Jawab:* 
    - Atribut head menunjuk ke node pertama dalam linked list. Dengan menginisialisasinya ke null, kita menyatakan bahwa saat linked list baru dibuat, tidak ada node yang terhubung ke list. Ini adalah langkah penting untuk menghindari referensi yang tidak diinginkan atau error, dan menetapkan kondisi awal dari list yang kosong.

    - Atribut size digunakan untuk melacak jumlah elemen atau node dalam linked list. Dengan menginisialisasinya ke 0, kita menyatakan bahwa saat linked list baru dibuat, tidak ada elemen yang disimpan di dalamnya. Ini memudahkan manajemen dan operasi pada list, karena kita memiliki cara yang langsung untuk mengetahui jumlah elemen yang ada.
4.  Pada method addFirst(), kenapa dalam pembuatan object dari konstruktor class Node prev 
dianggap sama dengan null? <br>

        `Node newNode = new Node(null, item, head);` <br>
    *Jawab* : Menetapkan prev ke null saat membuat newNode dalam kedua kasus tersebut adalah langkah yang logis dan diperlukan untuk menjaga integritas struktur double linked list
5.  Perhatikan pada method addFirst().  Apakah arti statement `head.prev = newNode` ? <br>
    *Jawab* : Statement head.prev = newNode memastikan bahwa referensi prev dari node pertama saat ini diperbarui untuk menunjuk ke node baru yang ditambahkan di depannya. Ini adalah langkah penting untuk mempertahankan struktur dan integritas dari double linked list, memungkinkan navigasi yang benar dalam kedua arah (maju dan mundur) setelah penambahan node baru di awal list.
6.  Perhatikan isi method addLast(), apa arti dari pembuatan object Node dengan mengisikan 
parameter prev dengan current, dan next dengan null? <br>
    `Node newNode = new Node(current, item, null);` <br>
    *Jawab* : Pembuatan objek Node dengan prev diisi current dan next diisi null bertujuan untuk menambahkan node baru di akhir linked list. current adalah node terakhir saat ini, dan dengan mengatur prev dari node baru ke current, serta next dari node baru ke null, program memastikan bahwa node baru menjadi node terakhir yang benar dalam list, terhubung dengan node terakhir sebelumnya. Ini menjaga integritas dari double linked list, memungkinkan traversal yang benar dari node pertama ke node terakhir dan sebaliknya
7.  Pada method add(), terdapat potongan kode program sebagai berikut:
    ```java
    while (i < index) {
                    current = current.next;
                    i++;
                }
                if (current.prev == null) {
                    Node22 newNode = new Node22(null, item, current);
                    current.prev = newNode;
                    head = newNode;
                } else {
                    Node22 newNode = new Node22 (current.prev, item, current);
                    newNode.prev = current.prev;
                    newNode.next = current;
                    current.prev.next = newNode;
                    current.prev = newNode;
                }
    ```
    Jelaskan maksud kode program `if`

    *Jawab:* Jika current adalah node pertama ( ditantai dengan definisi prev == null ), maka Node baru akan menjadi head yang baru. prev dari node yang saat ini menjadi head diperbarui untuk menunjuk ke node baru.

## Kegiatan Praktikum 2
**Hasil Percobaan ->>**

```java
50      40      10      20
Berhasil diisi
Size : 4
==============================
40      10      20
Berhasil diisi
Size : 3
==============================
40      10
Berhasil diisi
Size : 2
==============================
40
Berhasil diisi
Size : 1
PS D:\POLINEMA\Semester 2\ALGORITMA & STRUKTUR DATA\AlgoritmaStrukturData-Semester2>
```
Untuk kode program dari output tersebut bisa dilihat pada link berikut [Source Code](https://github.com/Putra1688/AlgoritmaStrukturData-Semester2/tree/main/Pertemuan12_DoubleLinkedList)

**Pertanyaan**
1.  Apakah maksud statement berikut pada method removeFirst()? 

    head = head.next; 

    head.prev = null; 
    *Jawab* : nilai node yang menjadi head berubah menjadi node seanjutnya head sebelumnya akan bernilai null;
    
2.  Bagaimana cara mendeteksi posisi data ada pada bagian akhir pada method removeLast()? 
3.  Jelaskan alasan potongan kode program di bawah ini tidak cocok untuk perintah remove! 
    Node tmp = head.next;
    head.prev = tmp.next;
    tmp.next.prev = head;
4.  Jelaskan fungsi kode program berikut ini pada fungsi remove!
    current.prev.next = current.next;
    current.next.prev = current.prev;

## Kegiatan Praktikum 3
**Hasil Percobaan ->>**

```java
Linked List Kosong!
Size: 0
==============================
7       3       4
Berhasil diisi
Size: 3
==============================
7       40      3       4
Berhasil diisi
Size: 4
==============================
Data awal pada Linked List adalah: 7
Data akhir pada Linked List adalah: 4
Data indeks ke-1 Linked List adalah: 40
PS D:\POLINEMA\Semester 2\ALGORITMA & STRUKTUR DATA\AlgoritmaStrukturData-Semester2>
```

Untuk kode program dari output tersebut bisa dilihat pada link berikut [Source Code](https://github.com/Putra1688/AlgoritmaStrukturData-Semester2/tree/main/Pertemuan12_DoubleLinkedList)

**Pertanyaan**
1.  Jelaskan method size() pada class DoubleLinkedLists! 
2.  Jelaskan cara mengatur indeks pada double linked lists supaya dapat dimulai dari indeks ke- 
1! 
3.  Jelaskan perbedaan karakteristik fungsi Add pada Double Linked Lists dan Single Linked Lists!  
4.  Jelaskan perbedaan logika dari kedua kode program di bawah ini! 

```java
public boolean isEmpty() {
    if(size ==0) {
        return true;
    } else {
        return false;
    }
    }
```
```java
public boolean isEmpty(){
    return head == null;
}
```

## Tugas Praktikum
1.  Buat program antrian vaksinasi menggunakan queue berbasis double linked list sesuai ilustrasi 
dan menu di bawah ini! (counter jumlah antrian tersisa di menu cetak(3) dan data orang yang 
telah divaksinasi di menu Hapus Data(2) harus ada) <br>
Berikut hasil compile dari praktikum tersebut<br>

    a. Penambahan node baru sebagai antrian
    ```java
    ++++++++++++++++++++++++++
    PENGANTRI VAKSIN EKSTRAVAGANZA
    ++++++++++++++++++++++++++

    1. Tambah Data Penerima Vaksin
    2. Hapus Data Pengantri Vaksin
    3. Tampil Data Penerima Vaksin
    4. Keluar
    ++++++++++++++++++++++++++
    1
    Masukkan nomor Antrian : 123
    Masukkan nama Antrian : Joko
    Nomor antrian : 123 berhasil ditambahkan
    ```
    b. Menampilkan semua daftar antrian

        ++++++++++++++++++++++++++
        PENGANTRI VAKSIN EKSTRAVAGANZA
        ++++++++++++++++++++++++++

        1. Tambah Data Penerima Vaksin
        2. Hapus Data Pengantri Vaksin
        3. Tampil Data Penerima Vaksin
        4. Keluar
        ++++++++++++++++++++++++++
        3
        | No.     | Nama       |
        | 123     | Joko       |
        | 124     | Mely       |
        | 135     | Johan      |
        | 146     | Rosy       |

        Berhasil diisi
        ```
    c. Menghapus antrian
        
        ++++++++++++++++++++++++++
        PENGANTRI VAKSIN EKSTRAVAGANZA
        ++++++++++++++++++++++++++

        1. Tambah Data Penerima Vaksin
        2. Hapus Data Pengantri Vaksin
        3. Tampil Data Penerima Vaksin
        4. Keluar
        ++++++++++++++++++++++++++
        2
        Joko telah selesai divaksinasi
        Sisa Antrian : 3
        ++++++++++++++++++++++++++
        PENGANTRI VAKSIN EKSTRAVAGANZA
        ++++++++++++++++++++++++++

        1. Tambah Data Penerima Vaksin
        2. Hapus Data Pengantri Vaksin
        3. Tampil Data Penerima Vaksin
        4. Keluar
        ++++++++++++++++++++++++++
        

    Untuk kode program dari output tersebut bisa dilihat pada link berikut 
 
2.  Buatlah program daftar film yang terdiri dari id, judul dan rating menggunakan double linked 
lists, bentuk program memiliki fitur pencarian melalui ID Film dan pengurutan Rating secara 
descending. Class Film wajib diimplementasikan dalam soal ini. 
