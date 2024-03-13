# LAPORAN PRAKTIKUM IV
# Brute Force & Devide Conquer
Nama  : Rangga Dwi Saputra <br>
NIM   : 2341720248 <br>
Kelas : TI - 1B <br>
## Percobaan 1 : Menghitung Nilai Faktorial dengan Algoritma Brute Force dan Divide and Conquer
### 4.1.1 Code: 
```java
package Pertemuan5_BruteForceDivideConquer;
public class Faktorial23 {
    public int nilai;

    public int faktorialBF(int n) {
        int fakto = 1;
        for (int i=1; i < n; i++ ){
            fakto = fakto * i;
        }
        return fakto;
    }

    public int faktorialDC(int n){
        if (n==1){
            return 1;
        } else {
            int fakto = n * faktorialDC(n-1);
            return fakto;
        }
    }
}
```
Class Main: <br>
```java
package Pertemuan5_BruteForceDivideConquer;
import java.util.Scanner;
public class MainFaktorial {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------");
        System.out.print("Masukkan jumlah elemen: ");
        int iJml = sc.nextInt();
        
        Faktorial23 [] fk = new Faktorial23[10];
        for (int i=0; i < iJml; i++){
            fk[i] = new Faktorial23();
            System.out.print("Masukkan nilai data ke-" +(i+1)+ " : ");
            int iNilai = sc.nextInt();
            fk[i].nilai = iNilai; // ini penting
        }

        System.out.println("HASIL - BRUTE FORCE");
        for (int i=0; i < iJml; i++){
        System.out.println("Hasil perhitungan faktorial menggunakan Brute Force adalah: " + fk[i].faktorialBF(fk[i].nilai));
        }

        System.out.println("HASIL - DIVIDE CONQUER");
        for (int i=0; i < iJml; i++){
        System.out.println("Hasil perhitungan faktorial menggunakan Brute Force adalah: " + fk[i].faktorialDC(fk[i].nilai));
        }
    }    
}
```
### 4.1.2 Hasil Compile
![image](./image/img1.png)
### 4.1.3 Pertanyaan
1.  Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan 
perbedaan bagian kode pada penggunaan if dan else! 
2.  Apakah memungkinkan perulangan pada method faktorialBF() dirubah selain menggunakan 
for?Buktikan! 
3.  Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); !
### 4.1.4 Jawaban
1.   Jika memenuhi kondisi if dimana n == 1 maka nilai yang direturnkan adalah 1. Jika kondisinya n bukan 1 (else) maka nilai yang direturnkan nilai fakto dioperasikan terlebih dahulu menggunakan rumus `fakto = n * faktorialDC(n-1);`, nilai n dikali dengan rekursif fungsi itu sendiri yang nilai n nya dikurangi 1
2. 