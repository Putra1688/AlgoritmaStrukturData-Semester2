package Pertemuan6_Sorting.src.src;

public class DaftarMhsBerprestasi {
    Mahasiswa23 listMhs [] = new Mahasiswa23[5];
    int idx;

// Methode untuk menambahkan
void tambah (Mahasiswa23 m) { // parameter m bertipe objek `Mahasiswa23`
    if (idx < listMhs.length) {
        listMhs[idx] = m;
        idx ++;
    } else {
        System.out.println("Data sudah penuh!!");
    }
}

// Methode untuk menampilkan
void tampil(){
    for (Mahasiswa23 m : listMhs){
        m.tampil();
        System.out.println("-------------------");
    }
}

// Methode BubbleSort
void BubbleSort (){
    for (int i=0; i < listMhs.length ; i++) {
        for (int j=1; j < listMhs.length ; j++) {

            // proses pertukaran urutan
            if (listMhs[j].ipk > listMhs[j-1].ipk) {
                Mahasiswa23 tmp = listMhs[j];
                listMhs[j] = listMhs[j-1];
                listMhs[j-1] = tmp;
            }
        }
    }
}

//=========================================================
// PERCOBAAN II
// Methode SelectionSort
void  selectionSort() {
    for (int i=0; i < listMhs.length-1 ; i++) {
       int idxMin = i; 

       for (int j=i+1; j < listMhs.length ; j++) {
        if (listMhs[j].ipk > listMhs[idxMin].ipk) {
            idxMin = j;
         }
       }
    Mahasiswa23 tmp = listMhs[idxMin];
    listMhs[idxMin] = listMhs[i];
    listMhs[i] = tmp;
    }
    
}

//=========================================================
// PERCOBAAN III
// Methode InsertionSort
void InsertionSort (){
    for (int i=1; i < listMhs.length ; i++) { // pada indeks 0 data sudah dianggap terurut
        Mahasiswa23 tmp = listMhs[i];
        int j = i;
        while (j > 0 && listMhs[j-1].ipk > tmp.ipk) {
            listMhs[j] = listMhs[j-1];
            j--;
        }
    listMhs[j] = tmp;
    }
}
}
