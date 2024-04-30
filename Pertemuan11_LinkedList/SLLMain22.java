package Pertemuan11_LinkedList;

public class SLLMain22 {
    public static void main(String[] args) {
        SinggleLinkedList singLL = new SinggleLinkedList();

        singLL.print();
        singLL.addFirst(890);
        singLL.print();
        singLL.addLast(760);
        singLL.print();
        singLL.addFirst(700);
        singLL.print();
        singLL.insertAfter(700, 999);
        singLL.print();
        singLL.insertAt(3, 833);
        singLL.print();

    }
    
}
