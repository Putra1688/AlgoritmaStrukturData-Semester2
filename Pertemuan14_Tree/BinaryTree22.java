package Pertemuan14_Tree;

import org.w3c.dom.Node;

public class BinaryTree22 {
    Node22 root;
    // int size;

    public BinaryTree22() {
        root = null;
    }
    boolean isEmpty() {
        return root==null;
    }

    public void DoubleLinkedList() {

    }

    public void add(int data) {
        if(isEmpty()) {
           root = new Node22(data);
        } else {
            Node22 current = root;
            while(true) {
                if(data > current.data) {
                    if (current.right == null){
                        current.right = new Node22(data);
                        break;
                    } else {
                        current = current.right;
                    }
                } else if (data < current.data) {
                    if(current.left == null) {
                        current.left = new Node22(data);
                        break;
                    } else {
                        current = current.left;
                    }
                } else { 
                    break;
                }
            }
        }
    }

    public void traversePreOrder(Node22 node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traversePostOrder (Node22 node) {
        if (node !=null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    public void traverseInOrder (Node22 node) {
        if (node !=null) {
            traverseInOrder(node.left);
            System.out.print(" " +node.data);
            traverseInOrder(node.right);
        }
    }

   Node22 getSuccessor (Node22 del) {
        Node22 successor = del.right;
        Node22 successorParent = del;
        while(successor.left!=null) {
            successorParent = successor;
            successor= successor.left;
        }
        if (successor!=del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }
/* 
    public void add (int item, int index) {
        if(isEmpty()) {}
    }
*/
    public void delete (int data) {
        if(isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        // temukan node (current) yang akan dihapus
        Node22 parent = root;
        Node22 current = root;
        boolean isLeftChild = false;
        while(current!=null) {
            if(current.data==data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        // deletion
        if (current==null) {
            System.out.println("Couldn't find data!");
            return;
        } else { // jika tidak ada child
            if(current.left == null && current.right==null) {
                if (current==root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) { // jika ada 1 child tersisa di sisi kanan
                if(current==root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
                    } else if (current.right == null) { // jka ada 1 child tersisa
                        if (current==root) {
                            root = current.left;
                        } else {
                            if (isLeftChild) {
                                parent.left = current.left;
                            } else {
                                parent.right = current.left;
                            }
                        }
                    } else { // jika ada 2 child tersisa
                        Node22 successor = getSuccessor(current);
                        if (current == root) {
                            root = successor;
                        } else { 
                            if(isLeftChild) {
                                parent.left = successor;
                            } else {
                                parent.right = successor;
                            }
                            successor.left = current.left;
                        }
                    }
                }
    }

    // ======== [ TUGAS PRAKTIKUM : MODIFIKASI KODE PROGRAM ] ========
        public Node22 rekursif(Node22 current, int data) {
            // jika current node adalah null, maka buat node baru
            if (current ==null) {
                return new Node22(data);
            } else if (data < current.data) { // maka posisinya ditaruh di kiri
                current.left = rekursif(current.left, data);
            } else { // maka posisinya ditaruh di kanan
                current.right = rekursif(current.right, data);
            }
            return current;
        }

        public int findMin(){
            if (isEmpty()) {
                System.out.println("Tree kosong");
                return Integer.MIN_VALUE;
            } else {
                Node22 current = root;
                while (current.left!= null) {
                    current = current.left;
                }
                return current.data;
            }
        }

        public int findMax(){
            if (isEmpty()) {
                System.out.println("Tree kosong");
                return Integer.MIN_VALUE;
            } else {
                Node22 current = root;
                while (current.right!= null) {
                    current = current.right;
                }
                return current.data;
            }
        }

        public boolean find(int data) {
            boolean result = false;
            Node22 current = root;
            while(current!=null) {
                if (current.data==data){
                    result = true;
                    break;
                } else if (data>current.data){
                    current = current.right;
                } else {
                    current = current.left;
                }
            }
            return result;
        }

    // methode untuk menampilkan data di leaf/daun
    public void leafNodes (Node22 node) {
        if (node == null) {
            return;
        } else if (node.left == null && node.right == null) {
            System.out.print(node.data + " ");
        }

        leafNodes(node.left);
        leafNodes(node.right);
    }

    // Menghitung jumlah leaf nodes
    public int countLeafNodes(Node22 node) {
        if (node == null) {
            return 0;
        } else if (node.left == null && node.right == null) {
            return 1;
        } else {
        // Rekursif untuk menghitung jumlah leaf nodes pada child nodes
        int leftCount = countLeafNodes(node.left);
        int rightCount = countLeafNodes(node.right);

        // Jumlah leaf nodes adalah jumlah leaf nodes dari child nodes kiri dan kanan
        return leftCount + rightCount;
        }
    }
    public void printLeafCount() {
        int count = countLeafNodes(root);
        System.out.println("Jumlah Leaf Nodes: " + count);
    }

}




