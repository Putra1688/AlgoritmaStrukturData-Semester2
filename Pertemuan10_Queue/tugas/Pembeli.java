package Pertemuan10_Queue.tugas;

import Pertemuan10_Queue.Nasabah;

public class Pembeli {
    String nama;
    Pembeli [] antrian;
    int noHp;
    int front;
    int rear;
    int size;
    int max;

    Pembeli (String nama, int noHp){
        this.nama = nama;
        this.noHp = noHp;
    }

    public Pembeli (){

    }

    public Pembeli (int n) {
        max = n;
        antrian = new Pembeli [max];
        size = 0;
        front = rear = -1;
    }
}
