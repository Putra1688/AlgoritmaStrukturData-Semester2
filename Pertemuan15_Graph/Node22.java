package Pertemuan15_Graph;

public class Node22 {
    int data;
    Node22 prev, next;
    int jarak;

    Node22 (Node22 prev, int data, int jarak, Node22 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
        this.jarak = jarak;
    }
}
