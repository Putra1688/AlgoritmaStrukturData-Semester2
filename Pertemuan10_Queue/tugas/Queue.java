package Pertemuan10_Queue.tugas;

public class Queue {
    Pembeli [] antrian;
    int front;
    int rear;
    int size;
    int max;

    public Queue(){

    }
    
    Queue(int n){
        max = n;
        antrian = new Pembeli [max];
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
    public void Enqueue (Pembeli antri) {
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

            antrian [rear] =  antri;
            // menambahkan data ke antrian (array yang sudah ada)
            size++;
        }
    }

    public Pembeli dequeue () {
        Pembeli dt = null;
        if (isEmpty ()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = antrian[front];
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

    public void peekPosition(String nama) {
    
        if (!isEmpty ()) {
                int i = 0;
                while (i < size) {
                    int pcc = (front + i) % max;
                    if (antrian[pcc].nama.equals(nama)) {
                        System.out.println(nama + " berada di posisi " + (i+1));
                        return;
                    }
                    System.out.println(nama + "tidak ditemukan dalam antrian");
                }
            } else {
                System.out.println("Queue masih kososng");
            }
        }

    // menampilkan elemen queue di posisi paling depan
    public void peek () {
        if (!isEmpty ()) {
            System.out.println("Elemen terdepan: " + antrian[front]);
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
                System.out.println(antrian[i] + " ");
                i = (i + 1) % max;
            } 
            System.out.println(antrian[i] + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void peekRear () {
        if (!isEmpty ()) {
            System.out.println("Elemen paling belakang: " + antrian[rear].nama
            + " " + antrian[rear].noHp );
        } else {
            System.out.println("Queue masih kososng");
        }
    }
}
