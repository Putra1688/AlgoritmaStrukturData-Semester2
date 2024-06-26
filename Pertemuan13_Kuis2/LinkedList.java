package Pertemuan13_Kuis2;

import Pertemuan11_LinkedList.Tugas.Mahasiswa01;
import Pertemuan11_LinkedList.Tugas.Mahasiswa02;

public class LinkedList {
    NodeTim head, tail;
    
    // mengecek apakah linked list kosong    
    public boolean isEmpty() {
        return head == null;
    }

    // tampilkan tim yang akan bertanding
    public void print(){
        if (!isEmpty()) {
            NodeTim tmp = head;
        
            int nomor = 1;
            System.out.printf("| %-4s | %-32s | %-7s | %-7s | %-7s | %-7s |\n", "Rank", "Team", "Game", "Win", "Lose", "Points");
            while (tmp != null) {
                System.out.printf("| %-4s | %-32s | %-7s | %-7s | %-7s | %-7s |\n", nomor, tmp.nama, tmp.game, tmp.menang, tmp.kalah, tmp.point);
                tmp = tmp.next;
                nomor++;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    // tampilkan semua tim
    public void printTeam (){
        if (!isEmpty()) {
            NodeTim tmp = head;
            int nomor = 1;
            System.out.printf("| %-4s | %-32s |\n", "Rank", "Team");
            while (tmp != null) {
                System.out.printf("| %-4s | %-32s |\n", nomor, tmp.nama);
                tmp = tmp.next;
                nomor++;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    // menambahkan tim dengan mengurutkan berdasarkan poin
    public void addTim(String nama,int game, int menang, int kalah, int point) {
        NodeTim ndInput = new NodeTim(nama, game, menang, kalah, point, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            NodeTim current = head;
            NodeTim previous = null;
            while (current != null && current.point > point) {
                previous = current;
                current = current.next;
            }
            if (previous == null) { // Insert at head
                ndInput.next = head;
                head = ndInput;
            } else {
                ndInput.next = current;
                previous.next = ndInput;
            }
            if (current == null) { // Insert at tail
                tail = ndInput;
            }
        }
    }

    public void insertAfter (String key, String nama, int game, int menang, int kalah, int point) {
        NodeTim ndInput = new NodeTim(nama, game, menang, kalah, point, null);
        NodeTim temp = head;
        do {
            if (temp.nama == key) {
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

    // Memperbarui hasil pertandingan
    public void updateMatchResult(String nama, boolean isWin) {
        NodeTim current = head;
        NodeTim previous = null;
        while (current != null && !current.nama.equals(nama)) {
            previous = current;
            current = current.next;
        }
        if (current != null) {
            if (isWin) {
                current.menang++;
            } else {
                current.kalah++;
            }
            current.game++;
            current.point = current.menang*2 + current.kalah;
            // Hapus node dari posisinya saat ini
            if (previous != null) {
                previous.next = current.next;
            } else {
                head = current.next;
            }
            if (current == tail) {
                tail = previous;
            }
            // Masukkan kembali node pada posisi yang benar
            addTim(current.nama, current.game, current.menang, current.kalah, current.point);
        } 
    }   
}
