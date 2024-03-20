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
### 4.2.1 Code: 
```java
package Pertemuan5_BruteForceDivideConquer;

public class Pangkat23 {
    public int nilai, pangkat;

    int pangkatBF(int a, int n){
        int hasil=1;
        for (int i=0; i < n ; i++){
            hasil *= a;
        }
        return hasil;
    }

    int pangkatDC(int a, int n){
        if (n==0){
            return 1;
        } else {
            if (n%2==1) {
                return ( pangkatDC(a, (n-1)/2) * pangkatDC(a, (n-1)/2) * a);
            } else {
                return (pangkatDC(a, n/2) * pangkatDC(a, n/2));
            }
        }
    }
}

```
Class Main <br>
```java
package Pertemuan5_BruteForceDivideConquer;
import java.util.Scanner;
public class MainPagkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung :"); 
        int elemen = sc.nextInt();

        Pangkat23 [] png = new Pangkat23[elemen];
        for (int i=0; i < elemen; i++){
            png [i] = new Pangkat23();
            System.out.print("Masukkan nilai yang ingin dipangkatkan: ");
            int nilai = sc.nextInt();
            png[i].nilai = nilai;
            System.out.print("Masukkan nilai pemangkatnya: ");
            int pangkat = sc.nextInt();
            png[i].pangkat = pangkat;
        }

        System.out.println("HASIL PANGKAT - BRUTE FORCE");
        for (int i=0; i < elemen; i++) {
        System.out.println("hasil dari "
            +png[i].nilai+ " pangkat "
            +png[i].pangkat+ " adalah "
            +png[i].pangkatBF(png[i].nilai, png[i].pangkat)
            );
        }
        System.out.println("HASIL - DEVIDE AND CONQUER");
        for (int i=0; i < elemen; i++) {
            System.out.println("hasil dari "
                +png[i].nilai+ " pangkat "
                +png[i].pangkat+ " adalah "
                +png[i].pangkatDC(png[i].nilai, png[i].pangkat)
                );
            }
    } 
}
```
### 4.2.2 Hasil Compile
![image](./image/img2.png)
### 4.2.3 Pertanyaan
1.  Jelaskan mengenai perbedaan 2 method yang dibuat yaitu PangkatBF() dan PangkatDC()! 
2.  Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan! 
3.  Modifikasi kode program tersebut, anggap proses pengisian atribut dilakukan dengan 
konstruktor. 
4.  Tambahkan menu agar salah satu method yang terpilih saja yang akan dijalankan menggunakan 
switch-case! 
### 4.2.3 Jawab
1.  