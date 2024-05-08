package Pertemuan10_Queue;

public class Nasabah {

    // atribut
    String norek, nama, alamat;
    int umur;
    double saldo;

    // kosntruktor
    Nasabah (String norek, String nama, String alamat, int umur, double saldo) {
        this.norek = norek;
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
        this.saldo = saldo;
    }

    // atribut modifikasi
    Nasabah [] data;
    int front;
    int rear;
    int size;
    int max;

    // konstruktor modifikasi
    public Nasabah (int n) {
        max = n;
        data = new Nasabah [max];
        size = 0;
        front = rear = -1;
    }

    // mengecek apakah queue kosong
    public boolean isEmpty () {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    // mengecek apakah queue sudah penuh
    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    // menambah isi queue dengan parameter dt
    public void Enqueue (Nasabah dt) {
        if (isFull ()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (isEmpty ()) {
                front = rear = 0;
            } else if ( rear == max -1 ) {
                rear = 0;
            } else {
                rear++;
            }

            data[rear] = dt;
            size++;
        }
    }

    // konstruktor default
    public Nasabah () {
        // untuk membuat objek Nasabah baru tanpa parameter, 
        // yang mengimplikasikan penggunaan konstruktor default
    }

    // mengeluarkan data pada queue di posisi belakang
    public Nasabah dequeue () {
        
        Nasabah dt = new Nasabah() ; // eror jika tanpa konstruktor default

        if (isEmpty ()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = data[front];
            size--;
            if (isEmpty ()) {
                front = rear = -1;
            } else {
                if (front == max -1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

    // menampilkan elemen queue di posisi paling depan
    public void peek () {
        if (!isEmpty ()) {
            System.out.println("Elemen terdepan: " + data[front].norek + " " + data[front].nama
            + " " + data[front].alamat + " " + data[front].umur + data[front].saldo );
        } else {
            System.out.println("Queue masih kososng");
        }
    }

    // menampilkan elemen queue di posisi paling belakang
    public void peekRear () {
        if (!isEmpty ()) {
            System.out.println("Elemen paling belakang: " + data[rear].norek + " " + data[rear].nama
            + " " + data[rear].alamat + " " + data[rear].umur + data[rear].saldo );
        } else {
            System.out.println("Queue masih kososng");
        }
    }

    // menampilkan seluruh elemen pada queue posisi front - rear
    public void print () {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i].norek + " " + data[i].nama
                + " " + data[i].alamat + " " + data[i].umur + data[i].saldo);
                i = (i + 1) % max;
            } 
            System.out.println(data[i].norek + " " + data[i].nama
            + " " + data[i].alamat + " " + data[i].umur + data[i].saldo);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear () {
        if (isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }
}
