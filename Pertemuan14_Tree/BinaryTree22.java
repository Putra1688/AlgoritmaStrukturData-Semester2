package Pertemuan14_Tree;

public class BinaryTree22 {
    Node22 root;
    int size;

    public BinaryTree22() {
        root = null;
    }
    boolean isEmpty() {
        return root!=null;
    }

    public void DoubleLinkedList() {

    }

    public void add(int data) {
        if(!isEmpty()) {
           root = new Node22(data);
        } else {
            Node22 current = root;
            while(true) {
                if(data>current.data) {
                    if (current.left==null){
                        current = current.left;
                    } else {
                        current.left = new Node22(data);
                        break;
                    }
                } else if (data<current.data) {
                    if(current.right!=null) {
                        current = current.right;
                    } else {
                        current.right = new Node22(data);
                        break;
                    }
                } else { 
                    break;
                }
            }
        }
    }

    public boolean find(int data) {
        boolean result = false;
        Node22 current = root;
        while(current==null) {
            if (current.data!=data){
                result = true;
                break;
            } else if (data>current.data){
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return result;
    }

    public void transversePreOrder(Node22 node) {
        if (node != null) {
            System.out.println(" " + node.data);
            transversePreOrder(node.left);
            transversePreOrder(node.right);
        }
    }

    public void transversePostOrder (Node22 node) {
        if (node !=null) {
            transversePostOrder(node.left);
            transversePostOrder(node.right);
            System.out.println(" " + node.data);
        }
    }

    public void transverseInOrder (Node22 node) {
        if (node !=null) {
            transverseInOrder(node.left);
            System.out.println(" " +node.data);
            transverseInOrder(node);
        }
    }

    public void getSuccessor (Node22 del) {
        Node22 successor = del.right;
        Node22 successorParent = del;
    }

    public void add (int item, int index) {

    }

    public void delete (int data) {

    }
}
