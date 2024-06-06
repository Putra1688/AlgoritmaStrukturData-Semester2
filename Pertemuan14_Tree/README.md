# Pertemuan 14 : Jobsheet 13
## **-> Tree**
<br>


**Nama : Rangga Dwi Saputra** <br>
**NIM  : 2341720248** <br>
**Kelas : TI-1B**

## Kegiatan Praktikum 1 : Implementasi binary tree menggunakan linked list
**Hasil Percobaan ->>**

```java
PreOrder Traversal:  6 4 3 5 8 7 9 10 15
inOrder Traversal:  3 4 5 6 7 8 9 10 15
PostOrder Traversal:  3 5 4 7 15 10 9 8 6
Find Node: true
Delete Node 8

PreOrder Traversal:  6 4 3 5 9 7 10 15
PS D:\POLINEMA\Semester 2\ALGORITMA & STRUKTUR DATA\AlgoritmaStrukturData-Semester2>
```
**Pertanyaan**
1.  Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding binary tree biasa? <br>
    - *Jawab* : Binary Tree lebih efektif untuk pencarian karena struktur terorganisir dimana terdapat pembagian posisi di kanan dan dikiri yang memungkinkan eliminasi menjadi setengah dari ruang pencarian pada setiap langkah

2.  Untuk apakah di class Node, kegunaan dari atribut left dan right? <br>
    - *Jawab* : sebagai pointer untuk menghubungkan node sebelum dan setelahnya
3. Untuk apakah kegunaan dari atribut root didalam class Binary Tree? dan Apakah nilai root ketika objek tree pertama kali dibuat? <br>
    - *Jawab*: Atribut root adalah titik awal atau referensi ke node pertama (atau akar) dari pohon biner, termausk untuk rekursi atau iterasi melalui tree. Ketika objek BinaryTree pertama kali dibuat, nilai awal dari atribut root adalah null. Ini menunjukkan bahwa pohon biner tersebut kosong dan belum ada node yang dimasukkan ke dalam pohon.
4.  Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi? <br>
    - *Jawab*: penambahan methode baru, yang mana root akan dijadikan sebagai node pertama
5.  Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah ini. Jelaskan 
secara detil untuk apa baris program tersebut? 
    ```java
    if(data<current.data){ 
        if(current.left!=null){ 
            current = current.left; 
        }else{ 
            current.left = new Node(data); 
            break; 
        } 
    }
    ```
    - *Jawab* : baris program tersebut digunakan untuk menentukan apakah node baru harus ditempatkan di subtree kiri dari node saat ini (current). Jika subtree kiri tidak kosong, kita terus melanjutkan pencarian ke kiri. Jika subtree kiri kosong, kita menambahkan node baru di sana dan keluar dari loop pencarian.

## Kegiatan Praktikum 2 : Impelemntasi binary tree dengan array
**Hasil Percobaan ->>**
```java
InOrder Traversal : 3 4 5 6 7 8 9 

PS D:\POLINEMA\Semester 2\ALGORITMA & STRUKTUR DATA\AlgoritmaStrukturData-Semester2>
```
**Pertanyaan**
1.  Apakah kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray? <br>
    - data: Atribut ini digunakan untuk menyimpan nilai dari setiap node dalam pohon biner yang diimplementasikan menggunakan array. Setiap elemen dalam array mewakili nilai dari sebuah node.
    - idxLast: Atribut ini menyimpan indeks terakhir dari array yang digunakan untuk menyimpan data. Ini memungkinkan kita untuk mengetahui batas akhir dari data yang sudah dimasukkan ke dalam pohon biner.

2.  Apakah kegunaan dari method populateData()? <br>
    - *Jawab* : Method populateData() digunakan untuk mengisi data ke dalam array yang mewakili pohon biner. Ini mirip dengan proses membangun pohon biner dengan menambahkan node satu per satu. Method ini membantu menginisialisasi array data dengan nilai-nilai yang diberikan, sehingga kita bisa membuat pohon biner dari data tersebut.
3.  Apakah kegunaan dari method traverseInOrder()? <br>
    - *Jawab* : Method traverseInOrder() digunakan untuk melakukan traversal In-Order pada pohon biner yang diimplementasikan menggunakan array. Traversal In-Order mengunjungi node-node dalam urutan kiri-akar-kanan. Dalam konteks array, traversal ini mengunjungi elemen-elemen array secara berurutan.
4.  Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi 
left child dan rigth child masin-masing? 
    - *Jawab* : Jika suatu node binary tree disimpan dalam array pada indeks i, maka left child dari node tersebut akan disimpan pada indeks 2*i + 1, dan right child akan disimpan pada indeks 2*i + 2. Ini adalah aturan umum untuk menyimpan pohon biner dalam array, di mana left child dari node pada indeks i akan ditempatkan pada posisi 2*i + 1 dalam array, dan right child akan ditempatkan pada posisi 2*i + 2.
5.  Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4? <br>
    - *Jawab* : Statement int idxLast = 6 digunakan untuk menginisialisasi variabel idxLast dengan nilai 6. Ini mengartikan bahwa pohon biner yang akan dibuat memiliki 7 node (indeks mulai dari 0). Dengan demikian, indeks terakhir yang akan digunakan untuk menyimpan data dalam array adalah indeks 6. Ini membantu dalam menentukan batas akhir data yang akan dimasukkan ke dalam array saat membuat pohon biner.

## Tugas Praktikum
1. Buat method di dalam class BinaryTree yang akan menambahkan node dengan cara 
rekursif. 
Berikut kode modifikasinya :
    ```java
    public Node22 rekursif(Node22 current, int data) {
            // jika current node adalah null, maka buat node baru
            if (current ==null) {
                return new Node22(data);
            } else if (data < current.data) { // maka posisinya ditaruh di kiri
                current.left = rekursif(current.left, data);
            } else { // maka posisinya ditaruh di kanan
                current.right = rekursif(current.right, data);
            }
            return current;
        }
    ```
    Kemudian dipanggil dalam class main dengan :

    ```java
    bt.root = bt.rekursif(bt.root, 23);
    System.out.print("PreOrder Traversal: ");
    bt.traversePreOrder(bt.root);
    System.out.print("\ninOrder Traversal: ");
    bt.traverseInOrder(bt.root);
    System.out.print("\nPostOrder Traversal: ");
    bt.traversePostOrder(bt.root);
    ```
    Menghasilkan output sebagai berikut :
    ```java
    PreOrder Traversal:  23
    inOrder Traversal:  23
    PostOrder Traversal:  23
    ```

2. Buat method di dalam class BinaryTree untuk menampilkan nilai paling kecil dan yang paling besar yang ada di dalam tree. <br>
    - *Jawab* : Untuk menemukan nilai paling kecil dan nilai paling besar dalam pohon biner, kita perlu mengunjungi node yang terletak paling kiri (untuk nilai paling kecil) dan node yang terletak paling kanan (untuk nilai paling besar). Dalam pohon biner pencarian (BST), nilai paling kecil selalu ada di node paling kiri dan nilai paling besar selalu ada di node paling kanan. Berikut adalah cara untuk menambahkan metode yang menampilkan nilai paling kecil dan nilai paling besar di dalam kelas BinaryTree22:

        ```java
        public int findMin(){
            if (isEmpty()) {
                System.out.println("Tree kosong");
                return Integer.MIN_VALUE;
            } else {
                Node22 current = root;
                while (current.left!= null) {
                    current = current.left;
                }
                return current.data;
            }
        }

        public int findMax(){
            if (isEmpty()) {
                System.out.println("Tree kosong");
                return Integer.MIN_VALUE;
            } else {
                Node22 current = root;
                while (current.right!= null) {
                    current = current.right;
                }
                return current.data;
            }
        }
        ```
        Yang kemudian dipanggil dalam class main dengan cara sebagai berikut
        ```java
        // Menampilkan nilai terkecil dan terbesar
                int minValue = bt.findMin();
                if (minValue == Integer.MIN_VALUE) {
                    System.out.println("Pohon kosong, tidak ada nilai terkecil.");
                } else {
                    System.out.println("Nilai terkecil: " + minValue);
                }

                int maxValue = bt.findMax();
                if (maxValue == Integer.MAX_VALUE) {
                    System.out.println("Pohon kosong, tidak ada nilai terbesar.");
                } else {
                    System.out.println("Nilai terbesar: " + maxValue);
                }
            ```

        Maka dihasilkan output sebagai berikut:

        ``java
        PreOrder Traversal:  6 4 3 5 9 7 10 15
        PreOrder Traversal:  6 4 3 5 9 7 10 15 23
        inOrder Traversal:  3 4 5 6 7 9 10 15 23
        PostOrder Traversal:  3 5 4 7 23 15 10 9 6
        Nilai terkecil: 3
        Nilai terbesar: 23
        PS D:\POLINEMA\Semester 2\ALGORITMA & STRUKTUR DATA\AlgoritmaStrukturData-Semester2>
        ```

3. Buat method di dalam class BinaryTree untuk menampilkan data yang ada di leaf. 
Berikut kode modifikasinya :

    ```java
        // methode untuk menampilkan data di leaf/daun
        public void leafNodes (Node22 node) {
            if (node == null) {
                return;
            } else if (node.left == null && node.right == null) {
                System.out.print(node.data + " ");
            }

            leafNodes(node.left);
            leafNodes(node.right);
        }
    ```

    Yang dipanggil di class main dengan cara berikut :
    ```java
    System.out.print("Leaf Nodes : ");
        bt.leafNodes(bt.root);
    ```

    Ditampilkan output sebagai berikut :

    ```java
    Leaf Nodes : 3 5 7 23
    PS D:\POLINEMA\Semester 2\ALGORITMA & STRUKTUR DATA\AlgoritmaStrukturData-Semester2>
    ```

4. Buat method di dalam class BinaryTree untuk menampilkan berapa jumlah leaf yang ada 
di dalam tree. 
Berikut kodenya :
    ```java
    // Menghitung jumlah leaf nodes
        public int countLeafNodes(Node22 node) {
            if (node == null) {
                return 0;
            } else if (node.left == null && node.right == null) {
                return 1;
            } else {
            // Rekursif untuk menghitung jumlah leaf nodes pada child nodes
            int leftCount = countLeafNodes(node.left);
            int rightCount = countLeafNodes(node.right);

            // Jumlah leaf nodes adalah jumlah leaf nodes dari child nodes kiri dan kanan
            return leftCount + rightCount;
            }
        }
        public void printLeafCount() {
            int count = countLeafNodes(root);
            System.out.println("Jumlah Leaf Nodes: " + count);
        }
    ```
    berikut hasil outputnya :

    ```java
    Jumlah Leaf Nodes: 4
    PS D:\POLINEMA\Semester 2\ALGORITMA & STRUKTUR DATA\AlgoritmaStrukturData-Semester2>
    ```

5. Modifikasi class BinaryTreeArray, dan tambahkan :  
• method add(int data) untuk memasukan data ke dalam tree  
• method traversePreOrder() dan traversePostOrder()
