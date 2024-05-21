package Pertemuan11_LinkedList.Tugas;

import Pertemuan11_LinkedList.Tugas.Mahasiswa01;

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
    public void addFirst ( String nama, int nim) {
        Mahasiswa01 ndInput = new Mahasiswa01(nim, nama, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    // menambahkan node baru di tail (belakang) dengan parameter
    public void addLast (String nama, int nim) {
        Mahasiswa01 ndInput = new Mahasiswa01(nim, nama, null);
        if (!isEmpty()) {
            tail.next = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    // memasukkan node stelah node tertentu (key)
    public void insertAfter (int key, String kunci, int nim, String nama) {
        Mahasiswa01 ndInput = new Mahasiswa01(nim, nama, null);
        Mahasiswa01 temp = head;
        do {
            if (temp.nim == key || temp.nama == kunci) {
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

    // menambahkan Node baru pada posisi tertentu
    public void insertAt (int index, int nim, String nama) {
        // Mahasiswa01 ndInput = new Mahasiswa01(nim, nama, null );
        if (index < 0) {
            System.out.println("perbaiki logikanya!" + " kalau indexnya -1 bagaimana?");
        } else if (index == 0) {
            addFirst(nama, nim);
        } else {
            Mahasiswa01 temp = head;
            for (int i = 0; i < index; i++){
                temp = temp.next;
            }
            temp.next = new Mahasiswa01 (nim, nama, temp.next);
            if (temp.next.next == null) {
                tail=temp.next;
            } 
        }
    }
}
