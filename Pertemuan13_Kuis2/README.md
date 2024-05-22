# Pertemuan 13 : Kuiz 2 Algotitma Struktur Data 
## **-> Proses Klasemen Indonesia Basket League (IBL) berbasis Linked List**
<br>


**Nama : Rangga Dwi Saputra** <br>
**NIM  : 2341720248** <br>
**Kelas : TI-1B**

## A. Implementasi Kode Program
Dalam penghitungan Klasemen Indonesia Basket League (IBL), terdapat data yang menyimpan variabel yang dimiliki oleh masing-masing team yakni;
- Nama Tim
- Total Pertandingan yang dimainkan ( Game )
- Jumlah Menang
- Jumlah Kalah
- Total Point yang didapatkan <br>

Impelemtasi pada kode program :
```java
package Pertemuan13_Kuis2;

public class NodeTim {
    String nama;
    int game, menang, kalah, point;
    NodeTim next;
    NodeTim data;

    NodeTim (String nama, int game, int menang, int kalah, int point, NodeTim next) {
        this.nama = nama;
        this.game = game;
        this.menang = menang;
        this.kalah = kalah;
        this.point = point;
        this.next = next;
    }
}
```
Pengimplementasiannya adalah dengan 
- Menambahkan tim terlebih dahulu
- Membuat methode untuk mencetak hasil pertandingan sebelum dan sesudah update
- Membuat methode untuk mengupdate hasil pertandingan

Yang diterapkan dalam kode program pada link class [LinkedList](https://github.com/Putra1688/AlgoritmaStrukturData-Semester2/blob/main/Pertemuan13_Kuis2/LinkedList.java) 

Untuk perhitungan pointnya sendiri adalah menggunakan rumus `2W + L` (Jumlah menang * 2 dan ditambah jumlah kalah). Yang diterapkan dalam salah satu methode dalam class [LinkedList](https://github.com/Putra1688/AlgoritmaStrukturData-Semester2/blob/main/Pertemuan13_Kuis2/LinkedList.java), yakni sebagai berikut :
```java
public void updateMatchResult(String nama, boolean isWin) {
        NodeTim current = head;
        NodeTim previous = null;
        while (current != null && !current.nama.equals(nama)) {
            previous = current;
            current = current.next;
        }
        if (current != null) {
            if (isWin) {
                current.menang++;
            } else {
                current.kalah++;
            }
            current.game++;
            current.point = current.menang*2 + current.kalah;
            // Hapus node dari posisinya saat ini
            if (previous != null) {
                previous.next = current.next;
            } else {
                head = current.next;
            }
            if (current == tail) {
                tail = previous;
            }
            // Masukkan kembali node pada posisi yang benar
            addTim(current.nama, current.game, current.menang, current.kalah, current.point);
        } 
    }
```
Dalam IBL terdapat 2 macam sistem pertandingan Klasemen, yaitu 
- `Round-Robin`, yang mana menunjukkan bahwa setiap tim telah bertanding melawan semua tim lain setidaknya satu kali yang digunakan dalam babak reguler untuk menentukan peringkat tim yang maju ke babak selanjutnya, yaitu
- `Play-Off`, dimana tim-tim yang bertanding akan dieliminasi satu per satu hingga tersisa satu tim juara

Keseluruhan program dapat dijalakan pada class main, yang bisa dilihat pada [Main](https://github.com/Putra1688/AlgoritmaStrukturData-Semester2/blob/main/Pertemuan13_Kuis2/Main.java).

## B. Hasil Output Program
Berikut output setelah program dijalankan
```java
=== Indonesia Basket League ===
1. Lihat Hasil Pertandingan
2. Lihat Tim
3. Hentikan program
____________________________
-> 1
Point Awal : 
| Rank | Team                             | Game    | Win     | Lose    | Points  |
| 1    | Pelita Jaya Jakarta              | 0       | 0       | 0       | 0       |
| 2    | Dewa United Banten               | 0       | 0       | 0       | 0       |
| 3    | Ksatria Bengawan Solo            | 0       | 0       | 0       | 0       |
| 4    | Rajawali Medan                   | 0       | 0       | 0       | 0       |

Klasemen Setelah Update:
| Rank | Team                             | Game    | Win     | Lose    | Points  |
| 1    | Rajawali Medan                   | 4       | 3       | 1       | 7       |
| 2    | Ksatria Bengawan Solo            | 4       | 2       | 2       | 6       |
| 3    | Pelita Jaya Jakarta              | 3       | 2       | 1       | 5       |
| 4    | Dewa United Banten               | 3       | 1       | 2       | 4       |

```
Dapat dilihat kondisi sebelum dan sesudah update hasil pertandingan setiap tim. Saya menggunakan sistem queue pada awal menambahkan tim yang bertanding, tim pertama menggunakan `addFirst()` sedangkan setelahnya meggunakan `InsertAfter()`. <br>
Namun, pada setelah update hasil pertandingan, nama tim diurutkan berdasarkan total point yang didapatkan
```java
=== Indonesia Basket League ===
1. Lihat Hasil Pertandingan
2. Lihat Tim
3. Hentikan program
____________________________
-> 2
Team Yang Bertanding:
| Rank | Team                             |
| 1    | Rajawali Medan                   |
| 2    | Ksatria Bengawan Solo            |
| 3    | Pelita Jaya Jakarta              |
| 4    | Dewa United Banten               |
```
Dalam IBL 2023 tahun lalu, terdapat 14 tim yang bermain dalam babak klasemen, sehingga minimal jumlah pertandingan yang dimainkan setiap tim sebanyak 26 pertandingan. <br> Dalam simulasi ini, saya hanya menambahkan 4 tim saja dikarenakan akan ada banyak sekali nama tim yang ditandingkan sehingga membuat kode program akan sangat panjang dengan sistem dan algoritma yang sama. <br>
Berikut kode program yang saya aplikasikan <br>

```java
    // Menambahkan hasil pertandingan Tim Pelita Jaya Jakarta
                            klasemen.updateMatchResult("Pelita Jaya Jakarta", true); // menang vs Dewa United Banten
                            klasemen.updateMatchResult("Pelita Jaya Jakarta", true); // menang vs Kesatria Bengawan Solo
                            klasemen.updateMatchResult("Pelita Jaya Jakarta", false); // kalah vs Rajawali Medan

                        // Menambahkan hasil pertandingan Tim Dewa United Banten
                            klasemen.updateMatchResult("Dewa United Banten", false); // kalah vs Pelita Jaya Jakarta
                            klasemen.updateMatchResult("Dewa United Banten", true); // menang vs Kesatria Bengawan Solo
                            klasemen.updateMatchResult("Dewa United Banten", false); // kalah vs Rajawali Medan

                        // Menambahkan hasil pertandingan Tim Ksatria Bengawan Solo
                            klasemen.updateMatchResult("Ksatria Bengawan Solo", false); // kalah vs Pelita Jaya Jakarta
                            klasemen.updateMatchResult("Ksatria Bengawan Solo", false); // kalah vs Dewa United Banten
                            klasemen.updateMatchResult("Ksatria Bengawan Solo", true); // menang vs Rajawali medan

                        // Menambahkan hasil pertandingan Tim Rajawali Medan
                            klasemen.updateMatchResult("Rajawali Medan", true); // menang vs Pelita Jaya Jakarta
                            klasemen.updateMatchResult("Rajawali Medan", true); // menang vs Dewa United Banten
                            klasemen.updateMatchResult("Rajawali Medan", false); // kalah vs Bengawan Solo
                        
                        // Menambahkan hasil pertandingan Rajawali Medan vs Pelita Jaya Jakarta
                            klasemen.updateMatchResult("Rajawali Medan", true); // menang vs Pelita Jaya Jakarta

                        // Menambahkan hasil pertandingan Ksatria Bengawan Solo vs Dewa United Banten
                            klasemen.updateMatchResult("Ksatria Bengawan Solo", true); // menang vs United Banten

                            // Mencetak klasemen setelah update hasil pertandingan
                            System.out.println("Klasemen Setelah Update:");
                            klasemen.print();
```

```java
=== Indonesia Basket League ===
1. Lihat Hasil Pertandingan
2. Lihat Tim
3. Hentikan program
____________________________
-> 3 
```
Dan untuk yang terakhir program akan dihentikan. Demikian yang bisa saya usahakan setelah saya research sistem proses klasemen pada pertandingan IBL 2023 lalu dan saya laporkan, kurang lebihnya mohon maaf. Sekian Terimakasih

