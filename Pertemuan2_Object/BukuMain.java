package Pertemuan2_Object;
public class BukuMain {
    public static void main(String[] args) {
        Buku23 bk1  = new Buku23 ();   
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Putri";
        bk1.halaman = 198;
        bk1.stock = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();  

        Buku23 bk2 = new Buku23("Self Reward", "Maheera Asyafa", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();
    }
}
