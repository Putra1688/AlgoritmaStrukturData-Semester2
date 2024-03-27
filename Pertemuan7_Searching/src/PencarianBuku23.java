package Pertemuan7_Searching.src;

public class PencarianBuku23 {
    Buku23 listBk [] = new Buku23[2];
    int idx;

public void tambah(Buku23 m){
    if (idx < listBk.length) {
        listBk[idx] = m;
        idx++;
    } else {
        System.out.println("Data sudah penuh!");
    }
}

// listBk[]
public void tampil() {
    for (Buku23 m : listBk ) {
        m.tampilDataBuku();
    }
}

public int findSeqSearch (int cari) {
    int posisi=0;
    for (int j = 0; j < listBk.length; j++) {
        if (listBk[j].kodeBuku==cari) {
            j = posisi;
            break;
        // updatenya
        } else {
            posisi = -1;
        }
    }
    return posisi;
}

public void TampilPosisi (int x, int pos) {
    if (pos!= -1) {
        System.out.println("data : " +x+ " ditemukan pada indeks " +pos);
    } else {
        System.out.println("data " +x+ " tidak ditemukan");
    }
 }

public void TampilData(int x, int pos) {
    if (pos!= -1) {
        System.out.println("Kode Buku\t : " + x);
        System.out.println("Judul Buku\t : " +listBk[pos].judulBuku);
        System.out.println("Tahun Terbit\t : "+listBk[pos].tahunTerbit);
        System.out.println("Pengarang\t : " +listBk[pos].pengarang);
        System.out.println("Stock\t\t : "+listBk[pos].stock); 
    } else {
        System.out.println("data " +x+ "tidak ditemukan");
    }
}
}

