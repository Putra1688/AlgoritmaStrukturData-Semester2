package Pertemuan12_DoubleLinkedList.Tugas01;

public class DoubleLinkedList01 {
    Node01 head;
    int size = 1;

    // konstruktor
    public DoubleLinkedList01() {
        head = null;
        int size;
    }

    // mengecek apakah antrian kososng
    public boolean isEmpty() {
        return head == null;
    }

    // menambahkan antrian baru = addlast (Queue)
    public void add(String nama, int nomor) {
        Node01 newNode = new Node01(null, nama ,nomor, null);
        if (head == null) {
            head = newNode;
            System.out.println("Nomor antrian : " + nomor + " berhasil ditambahkan");
        } else {
           Node01 current = head;
           while (current.next != null ) {
            current = current.next;
           }
           
           current.next = newNode;
           size++;
           System.out.println("Nomor antrian : " + nomor + " berhasil ditambahkan");
        }
    }

    // menghapus antrian terdepan = removeFirst (Queue)
    public void remove() throws Exception{
        if (isEmpty()) {
            throw new Exception ("Linked List masih kosong, tidak dapat dihapus!");
        } else {
            Node01 toRemove = head;
            String removed = toRemove.nama;

            head = head.next;
            if (head != null) {
            head.prev = null;
        }
            size--;
            System.out.println(removed + " telah selesai divaksinasi");
        }
        System.out.println("Sisa Antrian : " +size);
    }

    // mencetak isi antrian
    public void print(){
        if (!isEmpty()) {
            Node01 tmp = head;
            System.out.printf("| %-7s | %-10s |\n", "No.", "Nama");
            while (tmp != null) {
                System.out.printf("| %-7s | %-10s |\n", tmp.nomor, tmp.nama);
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil diisi");
        } else {
            System.out.println("Antrian Kosong!");
        }

    }

}
