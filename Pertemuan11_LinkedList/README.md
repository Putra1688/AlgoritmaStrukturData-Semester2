# Pertemuan 11 - Jobsheet 9
## **-> LINKED LIST**
<br>


**Nama&nbsp;: Rangga Dwi Saputra** <br>
**NIM &nbsp; : 2341720248** <br>
**Kelas : TI-1B**

### Praktikum 1 : Pembuatan Singgle Linked List
**Hasil Percobaan ->>** <br>
```java
Linked list kosong
Isi Linked List 890
Isi Linked List 890     760
Isi Linked List 700     890     760
Isi Linked List 700     999     890     760
perbaiki logikanya! kalau indexnya -1 bagaimana?
PS D:\POLINEMA\Semester 2\ALGORITMA & STRUKTUR DATA\AlgoritmaStrukturData-Semester2>
```
<br>

Untuk kode program dari output tersebut bisa dilihat pada link berikut [SourceCode](https://github.com/Putra1688/AlgoritmaStrukturData-Semester2/tree/main/Pertemuan11_LinkedList/SourceCode)

**Pertenyaan**
1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”? <br>
*Jawab* : karena pada classs main, methode yang dipanggil lebih dahulu adalah print. Padahal belum ada data dari methode lain untuk menambhkan data sebelumnya, jadi print akan mencetak linked list yang masih kososng
2. Jelaskan kegunaan variable temp secara umum pada setiap method! <br>
*Jawab* : temp digunakan sebagai pointer atau referensi sementara untuk mengakses node-node dalam linked list tanpa mengganggu struktur dasar linked list itu sendiri. Ini memungkinkan kita untuk melakukan operasi seperti menyisipkan, menghapus, atau mencari node dengan lebih mudah dan efisien.
3. Perhatikan class SingleLinkedList, pada method insertAt Jelaskan kegunaan kode berikut 
	```java
	if (temp.next.next== null) tail=temp.next;
	```
	*Jawab* : digunakan untuk memeriksa apakah node yang dimasukkan akan menjadi node terakhir dalam linked list. Jika kondisi ini terpenuhi, artinya kita telah mencapai node terakhir saat ini dalam iterasi, dan node baru yang dimasukkan akan menjadi node terakhir. Oleh karena itu, kita perlu memperbarui `tail` sehingga menunjuk ke node terakhir yang baru ditambahkan.

### Praktikum 2 : Modifikasi Elemen pada SIngle Linked List
**Hasil Percobaan ->>** <br>

```java
Linked list kosong
Isi Linked List 890
Isi Linked List 890     760
Isi Linked List 700     890     760
Isi Linked List 700     999     890     760
perbaiki logikanya! kalau indexnya -1 bagaimana?
Data pada index ke-1=999
data 3 berada pad indeks ke-1
Isi Linked List 999     890     760
Isi Linked List 890     760
Isi Linked List 760
Isi Linked List 760
PS D:\POLINEMA\Semester 2\ALGORITMA & STRUKTUR DATA\AlgoritmaStrukturData-Semester2>
```

Untuk kode program dari output tersebut bisa dilihat pada link berikut [Source Code](https://github.com/Putra1688/AlgoritmaStrukturData-Semester2/tree/main/Pertemuan11_LinkedList/SourceCode)

**Pertanyaan**
1.	Mengapa digunakan keyword break pada fungsi remove? Jelaskan! <br>
*Jawab* :  untuk menghentikan iterasi melalui linked list setelah operasi penghapusan dilakukan
2.	Jelaskan kegunaan kode dibawah pada method remove
	```java
	else if (temp.nexxt.data == key) {
		temp.next = temp.next.next;
	}
	```
	*Jawab* :  digunakan untuk memeriksa apakah nilai data dari node setelah node yang sedang diproses sama dengan nilai kunci yang ingin dihapus. Jika kondisi ini terpenuhi, artinya kita telah menemukan node yang perlu dihapus, dan kita dapat menghapusnya dengan mengubah referensi next dari node sebelumnya untuk melewatkannya.

### Latihan Tugas
1. Implementasikan ilustrasi Linked List Berikut. Gunakan 4 macam penambahan data yang telah dipelajari sebelumnya untuk menginputkan data. <br>
[image](./image/Screenshot%202024-05-13%20220804.png) <br>
Berikut hasil outputnya :
	```java
	Linked list kosong
	Isi Linked List Anton 111
	Isi Linked List Anton 111       Prita 112
	Isi Linked List Anton 111       Prita 112       Yusuf 113
	Isi Linked List Anton 111       Prita 112       Yusuf 113       Doni 114
	Isi Linked List Anton 111       Prita 112       Yusuf 113       Doni 114        Sari 115
	PS D:\POLINEMA\Semester 2\ALGORITMA & STRUKTUR DATA\AlgoritmaStrukturData-Semester2>  
	```
	Untuk Kode Program dapat dilihat pada <br>

2. Buatlah implementasi program antrian layanan unit kemahasiswaan sesuai dengan kondisi yang ditunjukkan pada soal nomor 1! Ketentuan <br>
	- a. Implementasi antrian menggunakan Queue berbasis Linked List! <br>
	- b. Program merupakan proyek baru, bukan modifikasi dari soal nomor 1! 
	Berikut hasil outputnya :
		```java
		LAYANAN UNIT KEMAHASISWAAN
		==========================
		------------------------------
		1. Tambahkan data antrian
		2. Keluarkan antrian
		3. Hentikan program
		____________________________
		-> 1
		------------------------------
		NIM     : 2341720248
		Nama    : Rangga Dwi Saputra
		------------------------------
		1. Tambahkan data antrian
		2. Keluarkan antrian
		3. Hentikan program
		____________________________
		-> 2
		Data mahasiswa dengan nim: 2341720248 dan nama: Rangga Dwi Saputra telah diselesaikan
		------------------------------
		1. Tambahkan data antrian
		2. Keluarkan antrian
		3. Hentikan program
		____________________________
		-> 3
		PS D:\POLINEMA\Semester 2\ALGORITMA & STRUKTUR DATA\AlgoritmaStrukturData-Semester2> 
		```
		Untuk Kode Program dapat dilihat pada


