package Pertemuan3_ArrayOfObject.ArrayBalok;

public class ArrayBalok {
    public static void main(String[] args) {
        
        Balok [] blArray = new Balok [3];
        for (int i=0; i<blArray.length; i++) {
            blArray[i] = new Balok(100,30,12);
        }
       
       /*  blArray [0] = new Balok(100, 30, 12);
        blArray [1] = new Balok(120, 40, 15);
        blArray [2] = new Balok(210, 50, 25); */

        for (int i=0; i<blArray.length; i++) {
            System.out.println("Volume Balok ke-"+i+ " : " + blArray[i].HitungVolume() );
        }
    }
}
