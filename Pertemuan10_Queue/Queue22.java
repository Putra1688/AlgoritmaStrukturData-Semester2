package Pertemuan10_Queue;

public class Queue22 {

    // atribut
    int [] data;
    int front;
    int rear;
    int size;
    int max;

    // konstruktor 
    public Queue22 (int n) {
        max = n;
        data = new int [max];
        size = 0;
        front = rear = -1;
    }

    public Queue22(){
        // default agar Queue22 bisa diakses classmanapun 
        // sebagai pembuatan object tanpa paramater
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
    public void Enqueue (int dt) {
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

    // mengeluarkan data pada queue di posisi belakang
    public int dequeue () {
        int dt = 0;
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
            System.out.println("Elemen terdepan: " + data[front]);
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
                System.out.println(data[i] + " ");
                i = (i + 1) % max;
            } 
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }

    // mengosongkan queue
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
