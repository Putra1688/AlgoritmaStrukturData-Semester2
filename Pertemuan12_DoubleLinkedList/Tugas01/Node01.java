package Pertemuan12_DoubleLinkedList.Tugas01;

public class Node01 { // 01 menunjukkan tugas1, bukan no absen, 
    String nama;
    int nomor;
    Node01 prev, next;

    Node01 (Node01 prev, String nama, int nomor, Node01 next) {
        this.prev = prev;
        this.nama = nama;
        this.nomor = nomor;
        this.next = next;
    }
}
