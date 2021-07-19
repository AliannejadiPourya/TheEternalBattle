public class Player {//this class handles the process of making players on board
    int x;
    int y;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }


    public void setDefault(Board b) {//places the players on the middle of the board according to the inputs
        b.Board[0][(b.getX() / 2) - 1] = 'R';
        b.Board[b.getX() - 1][(b.getX() / 2) + 1] = 'B';
        b.Board[1][(b.getX() / 2) - 1] = 'R';
        b.Board[b.getX() - 2][(b.getX() / 2) + 1] = 'B';
        b.Board[1][(b.getX() / 2)] = 'R';
        b.Board[b.getX() - 2][(b.getX() / 2)] = 'B';
        b.Board[1][(b.getX() / 2) + 1] = 'R';
        b.Board[b.getX() - 2][(b.getX() / 2) - 1] = 'B';
        b.Board[0][(b.getX() / 2) + 1] = 'R';
        b.Board[b.getX() - 1][(b.getX() / 2) - 1] = 'B';
        b.Board[0][(b.getX() / 2)] = '+';
        b.Board[b.getX() - 1][(b.getX() / 2)] = '*';
    }

    public Player() {
    }


}
