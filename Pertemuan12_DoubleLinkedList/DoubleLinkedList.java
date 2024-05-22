package Pertemuan12_DoubleLinkedList;

import org.w3c.dom.Node;

public class DoubleLinkedList {
    Node22 head;
    int size;

    // konstruktor
    public DoubleLinkedList() {
        head = null;
        int size;
    }

    // mengecek apakah antrian kososng
    public boolean isEmpty() {
        return head == null;
    }

    // menambahkan node dibagian depan
    public void addFirst(int item) {
        if (!isEmpty()) {
            Node22 newNode = new Node22 (null, item, head);
            head.prev = newNode;
            head = newNode;
        } else {
            head = new Node22(null, item, null);
        }
        size++;
    }

    // menambahkan node dibagian belakang
    public void addLast(int item) {
        if (!isEmpty()) {
            addFirst(item);
        } else {
           Node22 current = head;
           while (current.next != null ) {
            current = current.next;
           }
           Node22 newNode = new Node22(current, item, null);
           current.next = newNode;
           size++;
        }
    }

    // menambahkan data pada indeks/posisi yang telah ditentukan
    public void add (int item,int index) throws Exception{
        if (!isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size ) {
            throw new Exception ("Nilai indeks di luar batas");
        } else {
            Node22 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node22 newNode = new Node22(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node22 newNode = new Node22 (current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    // mendapatkan nilai size setelah linked list diperbarui otomatis
    public int size() {
        return size;
    }

    // menghapus semua linked list
    public void clear () {
        head = null;
        size = 0;
    }

    // mencetak isi linked list
    public void print(){
        if (!isEmpty()) {
            Node22 tmp = head;
            while (tmp !=null ) {
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil diisi");
        } else {
            System.out.println("Linked List Kosong!");
        }

    }
}
