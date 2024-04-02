# <p align ="center">  LAPORAN PRAKTIKUM VI </p> 
# <p align ="center">  Searching </p> 
<br><br><br><br>

<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" width="30%"> </p>

<br><br><br><br><br>


<p align = "center"> Nama : Rangga Dwi Saputra </p>
<p align = "center"> NIM  : 2341720248 </p>
<p align = "center"> Prodi: D-IV Teknik Informatika</p>
<p align = "center"> Kelas: 1B / 23 </p>

<br><br><br><br><br>

### Percobaan 1 : Searching / Pencarian Menggunakan Agoritma Sequential Search 
Verifikasi penginputan data <br>
![image](./image/img1.png)
Verifikasi output dan hasil pencarian <br>
![image](./image/img2.png)
Hasil output jika pencarian gagal<br>
![image](./image/img4.png)
Hasil output jika pencarian berhasil
![image](./image/img3.png)

**Pertanyaan**
1.  Jelaskan fungsi break yang ada pada method FindSeqSearch!
    *Jawab* : Menghentikan program apabila data yang dicari sudah ditemukan
2.  Jika Data Kode Buku yang dimasukkan tidak terurut dari kecil ke besar. Apakah program masih dapat berjalan? Apakah hasil yang dikeluarkan benar? Tunjukkan hasil screenshoot untuk bukti dengan kode Buku yang acak. Jelaskan Mengapa hal tersebut bisa terjadi?
    *Jawab* : Bisa, karena dalam sequential search pengecekan nilai berdasarkan indeksnya, bukan urutan nilainya
    ![image](./image/img5.png)
3.  Buat method baru dengan nama FindBuku menggunakan konsep sequential search dengan tipe 
method dari FindBuku adalah BukuNoAbsen. 
    *Jawab*
    ```java
    public Buku23 FindBuku (int cari) {
    int posisi=0;
    for (int j = 0; j < listBk.length; j++) {
        if (listBk[j].kodeBuku==cari) {
            posisi = j; // perbaikan bug
            break;
        // updatenya
        } else {
            posisi = -1;
        }
    }
    return posisi;
    }
    ```

    ```java
    Buku23 dataBuku = data.FindBuku(cari);
    dataBuku.tampilDataBuku();
    ```

### Percobaan 2 : Searching / Pencarian Menggunakan Binary Search 
Verifikasi Hasil <br>
![image](./image/img6.png)
1.  Tunjukkan pada kode program yang mana proses divide dijalankan! 
2.  Tunjukkan pada kode program yang mana proses conquer dijalankan! 
3.  Jika data Kode Buku yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa 
demikian! Tunjukkan hasil screenshoot untuk bukti dengan kode Buku yang acak. Jelaskan 
Mengapa hal tersebut bisa terjadi?  
4.  Jika Kode Buku yang dimasukkan dari Kode Buku terbesar ke terkecil (missal : 20215, 20214, 
20212, 20211, 20210) dan elemen yang dicari adalah 20210. Bagaimana hasil dari binary search? 
Apakah sesuai? Jika tidak sesuai maka ubahlah kode program binary seach agar hasilnya sesuai!

### Percobaan 3 : Percobaan Pengayaan Devide and Conquer
Verifikasi Hasil Percobaan <br>
![image](./image/img7.png)

### Latihan Praktikum
