import java.util.Scanner;
public class TugasFungsi {

    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        String lanjut;
        do {
        System.out.println("=== RUMUS APA YANG INGIN KAMU HITUNG ===");
        System.out.println("1. Kecepatan");
        System.out.println("2. Waktu");
        System.out.println("3. Jarak");
        System.out.print("Masukan pilihan: ");
        int opsi = input.nextInt();

        switch (opsi) {
            case 1:
                System.out.println(kecepatan() + " Km/Jam");
                break;

            case 2:
                System.out.println(waktu() + " Jam");
                break;

            case 3:
            System.out.println(jarak() + " Km");
                break;

            default:
                System.out.println("Opsi tidak Valid!");
                break;
        }

        System.out.print("Apakah ingin menghitung rumus yang lain? (y/n) : ");
        lanjut =input.next();
        System.out.println("\n");
    } while (lanjut.equalsIgnoreCase("y"));
    System.out.println("Program dihentikan. Terimakasih sudah mencoba"); 
    }

    public static double kecepatan (){
        double kecepatan;
        System.out.println("=== MENCARI NILAI KECEPATAN ===");
        System.out.print("Masukkan nilai jarak (Km) : ");
        double s= input.nextDouble();
        System.out.print("Masukkan nilai waktu (Jam) : ");
        double t = input.nextDouble();
        
        kecepatan = s / t;
        return kecepatan;
    }

    public static double waktu () {
        double waktu;
        System.out.println("=== MENCARI NILAI WAKTU ===");
        System.out.println("Masukkan nilai jarak (Km) : ");
        double s = input.nextDouble();
        System.out.println("Masukkan nilai kecepatan (Km/Jam) : ");
        double v = input.nextDouble();

        waktu = s / v;
        return waktu;
    }

    public static double jarak () {
        double jarak;
        System.out.println("=== MENCARI NILAI JARAK ===");
        System.out.print("Masukkan nilai kecepatan (km/jam) : ");
        double v = input.nextDouble();
        System.out.print("Masukkan nilai waktu (Jam) : ");
        double t = input.nextDouble();

        jarak = v * t;
        return jarak;
    }
}
