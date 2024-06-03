package Pertemuan12_DoubleLinkedList.Tugas02;

public class Node02 { // 01 menunjukkan tugas1, bukan no absen, 
    String judul;
    int id;
    float rate;

    Node02 prev, next;

    Node02 (Node02 prev, int id, String judul,float rate, Node02 next) {
        this.prev = prev;
        this.id = id;
        this.judul = judul;
        this.rate = rate;
        this.next = next;
    }
}

