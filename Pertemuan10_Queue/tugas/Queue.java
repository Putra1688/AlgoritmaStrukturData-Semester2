package Pertemuan10_Queue.tugas;

import Pertemuan10_Queue.Queue22;

public class Queue {
    Pembeli [] antrian;
    int front;
    int rear;
    int size;
    int max;

    Queue22 anu = new Queue22();
    // pembuatan object sebagai perantara agar seluruh methode yang ada di Queue22
    // bisa diakses

    public Queue(){

    }
    
    Queue(int n){
        max = n;
        antrian = new Pembeli [max];
        size = 0;
        front = rear = -1;
    }

    // menambah isi queue dengan parameter dt
    public void Enqueue (Pembeli antri) {
        if (anu.isFull ()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (anu.isEmpty ()) {
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
        if (anu.isEmpty ()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = antrian[front];
            size--;
            if (anu.isEmpty ()) {
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
            if (!anu.isEmpty ()) {
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
}
