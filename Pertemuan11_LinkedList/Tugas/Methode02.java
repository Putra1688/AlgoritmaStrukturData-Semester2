package Pertemuan11_LinkedList.Tugas;
import Pertemuan11_LinkedList.SourceCode.Node22;
import Pertemuan11_LinkedList.Tugas.Mahasiswa02;

public class Methode02 {
    Mahasiswa02 head, tail;

    public boolean isEmpty() {
        return head == null;
    }

    // tampilkan antrian
    public void print(){
        if (!isEmpty()) {
            Mahasiswa02 tmp = head;
            System.out.println("Isi antrian: ");
            int nomor = 1;
            while (tmp != null) {
                System.out.print(tmp.nama + " - " + tmp.nim + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    // menambahkan data
    public void addData ( String nim, String nama) {
        Mahasiswa02 ndInput = new Mahasiswa02(nim, nama, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    // Mengambil data
    // ambil nilai data tepat sesuai indeks ynag ditunjuk
    public String[] getData(int index) {
        if (isEmpty()) {
            System.out.println("Linked list kosong, tidak ada data yang bisa diambil");
        }

        Mahasiswa02 tmp = head;
        for (int i=0; i<index -1; i++) {
            if(tmp.next != null) {
                tmp = tmp.next;
            } else {
                System.out.println("Indeks diluar batas");
            }
        }
        String [] data = {String.valueOf(tmp.nim), tmp.nama} ;
        return data;
    }

        
    // mengetahui posisi node ada di indeks mana
    public int indexOf (int key) {
        Mahasiswa02 tmp = head;
        int index = 0;
        while (tmp != null && tmp.nim != key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp != null) {
            return index;
        } else {
            return -1;
        }
    }

    // mengambil data
    public void removeData (){
        if(isEmpty()){
            System.out.println("linked list masih kosong," + "tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }
}
