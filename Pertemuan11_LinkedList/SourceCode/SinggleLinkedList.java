package Pertemuan11_LinkedList.SourceCode;

public class SinggleLinkedList {

    Node22 head, tail;
    
    public boolean isEmpty() {
        return head ==null;
    }
    
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
    /*if (isEmpty()) {
            System.out.println("Isi Linked List");
        } else {
            Node22 tmp = head;
            System.out.println("Linked list kosong");
            while (tmp == null) {
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        }
    } */

    // menambahkan node baru dengan parameter
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

    public void addLast (int input) {
        Node22 ndInput = new Node22();
        if (!isEmpty()) {

            tail.next = ndInput;
            tail = ndInput;
        } else {
            head = ndInput;
            tail = ndInput;
        }
    }

    // memasukkan node yang memiliki data input
    public void insertAfter (int key, int input) {
        Node22 ndInput = new Node22();
        Node22 temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next != null) { // jika tidak ada node selanjutnya
                                            // maka jadikan ndInput sebagai tail
                    tail=ndInput;
                    break;
                }
            }
            temp = temp.next;
        } while (temp == null);
    }

    public void insertAt (int index, int input) {
        Node22 ndInput = new Node22();
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
  