package Pertemuan7_Searching.src;

// FUNGSI-FUNGSI

// pembuatan array of object
public class PencarianBuku23 {
    Buku23 listBk [] = new Buku23[3];
    int idx;

// menambahkan buku
public void tambah(Buku23 m) {
    if (idx < listBk.length) {
        listBk[idx] = m;
        idx++;
    } else {
        System.out.println("Data sudah penuh!");
    }
}

// menampilkan semua data buku yang ada di objek m
public void tampil() {
    for (Buku23 m : listBk ) {
        m.tampilDataBuku();
    }
}

// sequential searching ubah posisi
public int findSeqSearch (int cari) {
    int posisi=0;
    for (int j = 0; j < listBk.length; j++) {
        if (listBk[j].kodeBuku==cari) {
            posisi = j; // perbaikan bug
            break;
        // updatenya
        } else {
            posisi = -1;
        }
    }
    return posisi;
}

// menampilkan posisi yang sudah dirubah
public void TampilPosisi (int x, int pos) {
    if (pos!= -1) {
        System.out.println("data : " +x+ " ditemukan pada indeks " +pos);
    } else {
        System.out.println("data " +x+ " tidak ditemukan");
    }
 }
// menampilkan data terbaru setelah posisi dirubah
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


// BINARY SEARCH

public int FindBinarySearch (int cari, int left, int right) {
    int mid;
    if (right >= left) {
        mid = (right + left) / 2;
        if (cari == listBk[mid].kodeBuku) {
            return (mid);
        } else if (listBk[mid].kodeBuku > cari) {
            return FindBinarySearch(cari, left, mid - 1);
        } else {
            return FindBinarySearch(cari, mid + 1, right);
        }   
    }
    return -1;
    }
}

