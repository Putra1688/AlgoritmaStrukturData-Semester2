package Pertemuan14_Tree;

public class BinaryTreeArray22 {
    int [] data;
    int idxLast;

    public BinaryTreeArray22() {
        data = new int[10];
    }

    public void populateData(int data[], int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    public void traverseInOrder (int idxStart) {
        if(idxStart <= idxLast) {
            traverseInOrder(2 * idxStart+1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 2);
        } 
    }

// ===== [ TUGAS PRAKTIKUM : MODIFIKASI ] =====
    public void add(int newdata) {
        if(idxLast == data.length-1) {
        data[++idxLast] = newdata;
        } else {
            int idx = 0;
            while(true) {
                while (true) {
                    if (newdata > data[idx]) { // Pindah ke kanan
                        idx = 2 * idx + 2;
                        if (idx > idxLast) { // Jika sudah mencapai leaf node
                            data[idx] = newdata;
                            idxLast = idx;
                            break;
                        }
                    } else if (newdata < data[idx]) { // Pindah ke kiri
                        idx = 2 * idx + 1;
                        if (idx > idxLast) { // Jika sudah mencapai leaf node
                            data[idx] = newdata;
                            idxLast = idx;
                            break;
                        }
                    } else { // Jika data sudah ada dalam pohon
                        System.out.println("Data sudah ada dalam pohon.");
                        break;
                }
            }
        }
    }
    }
}
