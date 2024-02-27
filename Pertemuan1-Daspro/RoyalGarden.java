public class RoyalGarden {
    public static void main(String[] args) {
        
        int [] bunga [] = new int [][] {
        {10,5, 15,7}, 
        {6, 11, 9, 12}, 
        {2, 10, 10, 5}, 
        {5, 7, 12, 9}
        };

        for (int i=0;i < bunga.length; i++) {
            System.out.println("Cabang toko " +(i+1)+ ": ");
            for (int j=0; j<bunga[i].length; j++) {
                System.out.println("\t" +bunga[i][j] + ", ");
            }
        }

    }
    
}
