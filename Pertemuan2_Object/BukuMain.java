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
        System.out.println("\n");

        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();  
        System.out.println("\n");

        Buku23 bk2 = new Buku23("Self Reward", "Maheera Asyafa", 29, 160, 59000);
        bk2.terjual(30);
        bk2.tampilInformasi();
        System.out.println("\n");

        Buku23 Putra = new Buku23("Ayo Berjuang", "Rangga Dwi Saputra", 20, 201, 50000);
        Putra.tampilInformasi();
        System.out.println("\n");
        Putra.terjual(15);
        Putra.hitungHargaTotal();
        Putra.hitungDiskon();
        Putra.hitungHargaBayar();
        Putra.tampilInformasi();
        
    }
}
