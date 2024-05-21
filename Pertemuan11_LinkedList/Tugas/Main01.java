package Pertemuan11_LinkedList.Tugas;

public class Main01 {
    public static void main(String[] args) {
        Methode01 methode = new Methode01();

        methode.print();
        methode.addFirst("Anton", 111);
        methode.print();
        methode.addLast("Prita", 112);
        methode.print();
        methode.insertAt(1, 113, "Yusuf");
        methode.print();
        methode.insertAfter(113, "Yusuf", 114, "Doni");
        methode.print();
        methode.addLast("Sari", 115);
        methode.print();

    }
}
