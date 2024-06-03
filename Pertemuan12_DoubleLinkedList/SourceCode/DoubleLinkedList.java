package Pertemuan12_DoubleLinkedList.SourceCode;

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
        if (isEmpty()) {
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
        if (isEmpty()) {
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
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil diisi");
        } else {
            System.out.println("Linked List Kosong!");
        }

    }

// ======= [ PRAKTIKUM 2 : PENGHAPUSAN NODE ] =======

    // meghapus node pertama
    public void removeFirst() throws Exception{
        if (isEmpty()) {
            throw new Exception ("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // menghapus node terakhir
    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception ("Linked List masih kosong, tidak dapat dihapus!"); 
        } else if ( head.next == null) {
            head = null;
        } else {
            Node22 current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        } size--;
    }

    // menghapus node dengan indes tertentu
    public void remove (int index) throws Exception {
        if (isEmpty() || index >= size ) {
            throw new Exception("Nilai indeks diluar batas");
        } else if (index == 0 ) {
            removeLast();
        } else {
            Node22 current = head;
            int i = 0;
            while (i<index) {
                current = current.next;
                i++;
            } 
            if (current.next == null ) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

// ======= [ PRAKTIKUM 3 : PENGAMBILAN NODE ] =======

    // mendapatkan node pertama
    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception ("Linked List kosong");
        }
        return head.data;
    }

    // mendapatkan node terakhir
    public int getLast() throws Exception {
        if (isEmpty()){
        throw new Exception ("Linked List Kosong");
        }
        Node22 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        } 
        return tmp.data;
        }

    // mendapatkan node dengan index tertentu
    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } 
        Node22 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
}

