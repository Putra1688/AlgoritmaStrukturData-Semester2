package Pertemuan2_Object;

public class Dragon23 {
     int x, y, width, height;

     public Dragon23(){}
     public Dragon23(int startX, int startY, int gameWidth, int gameHeight) {
        x = startX;
        y = startY;
        width = gameWidth;
        height = gameHeight;
    }

     void moveLeft(){
        if (x > 0) {
        x--;
        } else { detectCollision(x, y);}
     }

     void moveRight(){
        if (x < width) {
        x++;    
        } else { detectCollision(x, y);}
     }

     void moveUp(){
        if (y < height) {
        y++;
        } else { detectCollision(x, y);}
     }
     
     void moveDown(){
        if (y > 0) {
        y--;
        } else { detectCollision(x, y);}
     }

    void printPosition(){
        System.out.println("Dragon is at position: " + x + ","  + y);
    }
    
    void detectCollision(int x, int y) {
        System.out.println("Game Over, Dragon hit the boundary at position: (" + x + ", " + y + ")");
        System.exit(0);
    }

    public static void main(String[] args) {
        Dragon23 game = new Dragon23(6,6,11,11);
        game.printPosition();
        System.out.println("\n");

        System.out.println("Dragon moves to the Right: ");
        for (int i=0; i < 4; i++ ) {
        game.moveRight();
        game.printPosition();
        }
    
        System.out.println("\n");

        System.out.println("Dragon moves Downward: ");
        for (int i=0; i < 5; i++ ) {
            game.moveDown();
            game.printPosition();
            }

            System.out.println("\n");

            System.out.println("Dragon moves to the Left: ");
            for (int i=0; i < 3; i++ ) {
                game.moveLeft();
                game.printPosition();
                }

            System.out.println("\n");

            System.out.println("Dragon moves Upward: ");
            for (int i=0; i < 16; i++ ) {
                game.moveUp();
                game.printPosition();
                }

    }
}
