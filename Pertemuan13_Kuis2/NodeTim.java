package Pertemuan13_Kuis2;

public class NodeTim {
    String nama;
    int game, menang, kalah, point;
    NodeTim next;
    NodeTim data;

    NodeTim (String nama, int game, int menang, int kalah, int point, NodeTim next) {
        this.nama = nama;
        this.game = game;
        this.menang = menang;
        this.kalah = kalah;
        this.point = point;
        this.next = next;
    }
}
