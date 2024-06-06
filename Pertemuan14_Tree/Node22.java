package Pertemuan14_Tree;

public class Node22 {
    int data;
    Node22 left, right;

    Node22 (Node22 left, int data, Node22 right) {
        this.left = null;
        this.data = data;
        this.right = null;
    }

    Node22 (int data) {
        this.data = data;
    }
}
