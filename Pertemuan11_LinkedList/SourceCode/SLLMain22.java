package Pertemuan11_LinkedList.SourceCode;

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

        System.out.println("Data pada index ke-1=" +singLL.getData(1));
        System.out.println("data 3 berada pad indeks ke-"+singLL.indexOf(760));

        singLL.remove(999);
        singLL.print();
        singLL.removeAt(0);
        singLL.print();
        singLL.removeFirst();
        singLL.print();
        singLL.removeLast();
        singLL.print();
    }
}
