package Pertemuan14_Tree;

public class BinaryTreeMain22 {
    public static void main(String[] args) {
        
        BinaryTree22 bt = new BinaryTree22();
    
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);
        System.out.print("PreOrder Traversal: ");

        bt.traversePreOrder(bt.root);
        System.out.println(" ");
        System.out.print("inOrder Traversal: ");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        System.out.print("PostOrder Traversal: ");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find Node: "+bt.find(5));
        System.out.println("Delete Node 8 ");
        bt.delete(8);
        System.out.println("");
        System.out.print("PreOrder Traversal: ");
        bt.traversePreOrder(bt.root);
        System.out.println("");

    bt.root = bt.rekursif(bt.root, 23);
    System.out.print("PreOrder Traversal: ");
    bt.traversePreOrder(bt.root);
    System.out.print("\ninOrder Traversal: ");
    bt.traverseInOrder(bt.root);
    System.out.print("\nPostOrder Traversal: ");
    bt.traversePostOrder(bt.root);

    System.out.println();

        // Menampilkan nilai terkecil dan terbesar
        int minValue = bt.findMin();
        if (minValue == Integer.MIN_VALUE) {
            System.out.println("Pohon kosong, tidak ada nilai terkecil.");
        } else {
            System.out.println("Nilai terkecil: " + minValue);
        }

        int maxValue = bt.findMax();
        if (maxValue == Integer.MAX_VALUE) {
            System.out.println("Pohon kosong, tidak ada nilai terbesar.");
        } else {
            System.out.println("Nilai terbesar: " + maxValue);
        }

    System.out.print("Leaf Nodes : ");
    bt.leafNodes(bt.root);
    System.out.println();
    bt.printLeafCount();
    }
}
