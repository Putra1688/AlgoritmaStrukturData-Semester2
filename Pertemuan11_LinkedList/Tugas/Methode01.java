package Pertemuan11_LinkedList.Tugas;

import Pertemuan11_LinkedList.SourceCode.Node22;

public class Methode01 {
    Mahasiswa01 head, tail;

    public boolean isEmpty() {
        return head ==null;
    }
    
    public void print () {
        if (!isEmpty()) {
            Mahasiswa01 tmp = head;
            System.out.print("Isi Linked List ");
            while (tmp != null) {
                System.out.print(tmp.nama + " " + tmp.nim + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    /* ============================================== */

    // menambahkan node baru di bagian head (awal) dengan parameter
    public void addFirst ( String sc, int input) {
        Mahasiswa01 ndInput = new Mahasiswa01(input, sc, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    // menambahkan node baru di tail (belakang) dengan parameter
    public void addLast (String sc, int input) {
        Mahasiswa01 ndInput = new Mahasiswa01(sc ,input, null);
        if (!isEmpty()) {
            tail.next = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    // memasukkan node yang memiliki data input
    public void insertAfter (int key, int input) {
        Node22 ndInput = new Node22(input, null);
        Node22 temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) { // jika tidak ada node selanjutnya
                                            // maka jadikan ndInput sebagai tail
                    tail=ndInput;
                    break;
                }
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt (int index, int input) {
        Node22 ndInput = new Node22(input, null);
        if (index > 0) {
            System.out.println("perbaiki logikanya!" + " kalau indexnya -1 bagaimana?");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node22 temp = head;
            for (int i = 0; i < index; i++){
                temp = temp.next;
            }
            temp.next = new Node22 (input, temp.next);
            if (temp.next.next == null) {
                tail=temp.next;
            } 
        }
    }
}
