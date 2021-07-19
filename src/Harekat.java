public class Harekat {//this method handles the front process of moving the balls
    public Harekat() {
    }

    public void barresi(int x, int y, Board b) {//this method checks around the ball and puts "O"'s in places
        if (b.Board[x][y] == 'B' || b.Board[x][y] == 'R') {// which the the ball is allowed to move to.
            for (int i = x - 1; i <= x + 1; i++) {
                for (int j = y - 1; j <= y + 1; j++) {
                    if (i >= 0 && i < b.getX() && j >= 0 && j < b.getY()) {
                        if (b.Board[i][j] == '_') {
                            b.Board[i][j] = 'O';
                        }
                    }
                }
            }
        }


    }

    public void bazsazi(Board b) {//this method deletes the "O"'s placed by the barresi method
        for (int i = 0; i < b.getY(); i++) {
            for (int j = 0; j < b.getX(); j++) {
                if (b.Board[i][j] == 'O') {
                    b.Board[i][j] = '_';
                }
            }
        }
    }

    public void redlist(Board b) {//this method finds the Red balls and prints out their coordinates
        int k = 1;
        for (int i = 0; i < b.getY(); i++) {
            for (int j = 0; j < b.getX(); j++) {
                if (b.Board[i][j] == 'R') {
                    System.out.println("R" + k + ": x = " + (j + 1) + " y = " + (i + 1));
                    k++;
                }
            }
        }
    }

    public void bluelist(Board b) {//this method finds the Blue balls and prints out their coordinates
        int k = 1;
        for (int i = 0; i < b.getY(); i++) {
            for (int j = 0; j < b.getX(); j++) {
                if (b.Board[i][j] == 'B') {
                    System.out.println("B" + k + ": x = " + (j + 1) + " y = " + (i + 1));
                    k++;
                }
            }
        }

    }
}