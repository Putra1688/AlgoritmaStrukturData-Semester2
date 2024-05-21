package Pertemuan11_LinkedList.SourceCode;

public class SinggleLinkedList {

    Node22 head, tail;
    
    // methode untuk mengecek apakah kosong
    public boolean isEmpty() {
        return head ==null;
    }
    
    // methode untuk menampilkan data
    public void print () {
        if (!isEmpty()) {
            Node22 tmp = head;
            System.out.print("Isi Linked List ");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    // menambahkan node baru dibagian awal sebagai head
    public void addFirst (int input) {
        Node22 ndInput = new Node22(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    // menambahkan methode dibagian akhir sebagai tail
    public void addLast (int input) {
        Node22 ndInput = new Node22(input, null);
        if (!isEmpty()) {
            tail.next = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    // memasukkan node setelah node tertentu
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

    // memasukkan node pada indeks tertentu
    public void insertAt (int index, int input) {
        Node22 ndInput = new Node22(input, null);
        if (index < 0) {
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

    // ambil nilai data tepat sesuai indeks ynag ditunjuk
    public int getData(int index) {
            Node22 tmp = head;
            for (int i=0; i<index -1; i++) {
                tmp = tmp.next;
            }
            return tmp.next.data;
        }
    
    // mengetahui posisi node ada di indeks mana
    public int indexOf (int key) {
            Node22 tmp = head;
            int index = 0;
            while (tmp != null && tmp.data != key) {
                tmp = tmp.next;
                index++;
            }
            if (tmp != null) {
                return 1;
            } else {
                return index;
            }
        }

    // mengambil data pertama
    public void removeFirst (){
            if(isEmpty()){
                System.out.println("linked list masih kosong," + "tidak dapat dihapus");
            } else if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }
        }
    
    // menghapus data bagian belakang
    public void removeLast(){
            if(isEmpty()){
                System.out.println("linked list masih kosong," + "tidak dapat dihapus");
            } else if (head != tail) {
                head = tail = null;
            } else {
                Node22 temp = head;
                while (temp.next != null) {
                    temp= temp.next;
                }
                temp.next = null;
                tail = temp.next;
            }
        }

    // menghapus data tertentu
    public void remove (int key) {
            if(isEmpty()){
                System.out.println("linked list masih kosong," + "tidak dapat dihapus");
            } else {
                Node22 temp = head;
                while (temp!=null){
                    if (temp.data != key && temp==head) {
                        removeFirst();
                        break;
                    } else if (temp.next.data == key) {
                        temp.next = temp.next.next;
                        if (temp.next == null) {
                            tail = temp;
                        } 
                        break;
                        }
                        temp = temp.next;
                    }
                }
            }
            
    // menghapus data pada indeks ke   
    public void removeAt(int index) {
        if (index == 0) {
            removeFirst ();
        } else {
            Node22 temp = head;
            for (int i=0; i< index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}
  