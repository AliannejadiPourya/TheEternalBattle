public class Board {//This class handles the process of making boards, resizing, printing
    private int x;
    private int y;
    char[][] Board;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void rest() {// resets the board to the default mode
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                Board[i][j] = '_';
            }
        }
    }

    public void print() {// prints out the default board without the players
        int h = 0;
        int yh = y;
        for (int i = 0; i < x; i++) {

            while (h < yh) {//printing the X side numbers
                System.out.print(h + 1 + " ");
                h++;
            }
            if (i == 0) {
                System.out.println();
            }
            for (int j = 0; j < y; j++) {
                System.out.print(Board[i][j] + " ");
            }
            System.out.print(i + 1);//Y side numbers
            System.out.println();


        }
    }

    public Board(int x, int y) {//creates a Board object for us
        setX(x);
        setY(y);
        Board = new char[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                Board[i][j] = '_';
            }
        }

    }

}


