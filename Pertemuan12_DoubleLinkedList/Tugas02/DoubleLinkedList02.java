package Pertemuan12_DoubleLinkedList.Tugas02;

import org.w3c.dom.Node;

import Pertemuan12_DoubleLinkedList.Tugas01.Node01;

public class DoubleLinkedList02 {
    Node02 head;
    int size;

    // konstruktor
    public DoubleLinkedList02() {
        head = null;
    }

    // mengecek apakah antrian kososng
    public boolean isEmpty() {
        return head == null;
    }

    // menambahkan node dibagian depan
    public void addFirst(int id, String judul, float rate) {
        
        Node02 newNode = new Node02 (null,id, judul, rate, head);
        if (!isEmpty()) {
            head.prev = newNode;
        } else {
            head = newNode;
        }
        size++;
    }

    // menambahkan node dibagian belakang
    public void addLast(int id, String judul, float rate) {
        if (isEmpty()) {
            addFirst(id, judul, rate);
        } else {
           Node02 current = head;
           while (current.next != null ) {
            current = current.next;
           }
           Node02 newNode = new Node02(null,id, judul, rate, null);
           current.next = newNode;
           size++;
        }
    }

    // menambahkan data pada indeks/posisi yang telah ditentukan
    public void add (int id, String judul, float rate, int index) throws Exception{
        if (isEmpty()) {
            addFirst(id, judul, rate);
        } else if (index < 0 || index > size ) {
            throw new Exception ("Nilai indeks di luar batas");
        } else {
            Node02 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node02 newNode = new Node02(null,id, judul, rate, null);
                current.prev = newNode;
                head = newNode;
            } else {
                Node02 newNode = new Node02 (null,id, judul, rate, null);
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
            Node02 tmp = head;
            int nomor=1;
            System.out.println("Cetak Data");
            System.out.printf("| %-4s | %-7s | %-20s | %-10s |\n", "No.","ID", "Judul", "Rating");
            while (tmp != null) {
                System.out.printf("| %-4s | %-7s | %-20s | %-10s |\n", nomor, tmp.id, tmp.judul, tmp.rate);
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil diisi");
        } else {
            System.out.println("Linked List Kosong!");
        }

    }

// ======= [ PENGHAPUSAN NODE ] =======

    // meghapus node pertama
    public void removeFirst() throws Exception{
        if (isEmpty()) {
            throw new Exception ("Linked List masih kosong, tidak dapat dihapus!");
        } else {
            Node02 toRemove = head;
            int removedID = toRemove.id;
            String removedJudul = toRemove.judul;

            head = head.next;
            if (head != null) {
            head.prev = null;
        }
            size--;
            System.out.println(removedID + " : " + removedJudul + " telah dihapus");
        }
        System.out.println("Sisa Antrian : " +size);
    }

    // menghapus node terakhir
    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception ("Linked List masih kosong, tidak dapat dihapus!"); 
        } else if ( head.next == null) {
            head = null;
        } else {

            Node02 current = head;
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
            Node02 current = head;
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

// ======= [ PENGAMBILAN NODE ] =======

    // mendapatkan node dengan index tertentu
    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } 
        Node02 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.id;
    }
}

