public class RoyalGarden {
    public static void main(String[] args) {
        
        int [] bunga [] = new int [][] {
        {10,5, 15,7}, 
        {6, 11, 9, 12}, 
        {2, 10, 10, 5}, 
        {5, 7, 12, 9}
        };

        for (int i=0;i < bunga.length; i++) {

            for (int j=0; j<bunga[i].length; j++) {
                System.out.println("Royal Garden " + (i+1) + " ");
                System.out.println("\tAglonema"+ " : " +" " +(bunga[i][j])) ;
                System.out.println("\tKeladi"+ " : " +" " +(bunga[i][j])) ;
                System.out.println("\tAlocasia" + " : " +" " +(bunga[i][j])) ;
                System.out.println("\tMawar" + " : " +" "+(bunga[i][j]) ) ;

                System.out.println("\n");
            }
        }

    }
    
}
