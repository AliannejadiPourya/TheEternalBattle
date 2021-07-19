public class Move {// this class handles the important process of moving and checking where the player
    //is allowed to move to

    private int x;
    private int y;
    private int x2;
    private int y2;
    private String name;
    String str;
    int c;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

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

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getX2() {
        return x2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getY2() {
        return y2;
    }


    public Move(String name, Board b) {//creates a Move obj according to the color
        if (name.equalsIgnoreCase("red")) {
            moveR2(x, y, c, b);
        }
        if (name.equalsIgnoreCase("blue")) {
            moveB2(x, y, c, b);
        }
    }

    public void moveR(int x1, int y1, int x2, int y2, Board b) {//simple moving method for moving an red ball from point A
        if (x1 == x2 - 1 || x1 == x2 || x1 == x2 + 1) { //// to point B
            if (y1 == y2 - 1 || y1 == y2 || y1 == y2 + 1) {

                if (b.Board[y1][x1] == 'R' && b.Board[y1][x1] != b.Board[y2][x2]) {

                    b.Board[y2][x2] = b.Board[y1][x1];
                    b.Board[y1][x1] = '_';
                }
            }
        }
    }

    public void moveB(int x1, int y1, int x2, int y2, Board b) {//simple moving method for moving an blue ball from
        if (x1 == x2 - 1 || x1 == x2 || x1 == x2 + 1) { // point A to point B
            if (y1 == y2 - 1 || y1 == y2 || y1 == y2 + 1) {

                if (b.Board[y1][x1] == 'B' && b.Board[y1][x1] != b.Board[y2][x2]) {
                    b.Board[y2][x2] = b.Board[y1][x1];
                    b.Board[y1][x1] = '_';
                }
            }
        }
    }

    public void moveR2(int x1, int y1, int jahat, Board b) {//advanced method for moving an red ball from where it is
        //to where is is given as an input, but this method does not use coordinates as input, instead it receives
        //an number for an specific direction

        if (jahat == 1) {//North
            y2 = y1 - 1;
            x2 = x1;
            if (b.Board[y1][x1] == 'R' && b.Board[y1][x1] != b.Board[y2][x2]) {
                b.Board[y2][x2] = b.Board[y1][x1];
                b.Board[y1][x1] = '_';
            } else {
                System.out.println("You are not allowed to move here!");
            }
        }
        if (jahat == 2) {//North-East
            y2 = y1 - 1;
            x2 = x1 + 1;
            if (b.Board[y1][x1] == 'R' && b.Board[y1][x1] != b.Board[y2][x2]) {
                b.Board[y2][x2] = b.Board[y1][x1];
                b.Board[y1][x1] = '_';
            } else {
                System.out.println("You are not allowed to move here!");
            }
        }
        if (jahat == 3) {//East
            y2 = y1;
            x2 = x1 + 1;
            if (b.Board[y1][x1] == 'R' && b.Board[y1][x1] != b.Board[y2][x2]) {
                b.Board[y2][x2] = b.Board[y1][x1];
                b.Board[y1][x1] = '_';
            } else {
                System.out.println("You are not allowed to move here!");
            }
        }
        if (jahat == 4) {//South-East
            y2 = y1 + 1;
            x2 = x1 + 1;
            if (b.Board[y1][x1] == 'R' && b.Board[y1][x1] != b.Board[y2][x2]) {
                b.Board[y2][x2] = b.Board[y1][x1];
                b.Board[y1][x1] = '_';
            } else {
                System.out.println("You are not allowed to move here!");
            }
        }
        if (jahat == 5) {//South
            y2 = y1 + 1;
            x2 = x1;
            if (b.Board[y1][x1] == 'R' && b.Board[y1][x1] != b.Board[y2][x2]) {
                b.Board[y2][x2] = b.Board[y1][x1];
                b.Board[y1][x1] = '_';
            } else {
                System.out.println("You are not allowed to move here!");
            }
        }
        if (jahat == 6) {//South-West
            y2 = y1 + 1;
            x2 = x1 - 1;
            if (b.Board[y1][x1] == 'R' && b.Board[y1][x1] != b.Board[y2][x2]) {
                b.Board[y2][x2] = b.Board[y1][x1];
                b.Board[y1][x1] = '_';
            } else {
                System.out.println("You are not allowed to move here!");
            }
        }
        if (jahat == 7) {//West
            y2 = y1;
            x2 = x1 - 1;
            if (b.Board[y1][x1] == 'R' && b.Board[y1][x1] != b.Board[y2][x2]) {
                b.Board[y2][x2] = b.Board[y1][x1];
                b.Board[y1][x1] = '_';
            } else {
                System.out.println("You are not allowed to move here!");
            }
        }
        if (jahat == 8) {//North-West
            y2 = y1 - 1;
            x2 = x1 - 1;
            if (b.Board[y1][x1] == 'R' && b.Board[y1][x1] != b.Board[y2][x2]) {
                b.Board[y2][x2] = b.Board[y1][x1];
                b.Board[y1][x1] = '_';
            } else {
                System.out.println("You are not allowed to move here!");
            }
        }


    }


    public void moveB2(int x1, int y1, int jahat, Board b) {//advanced method for moving an red ball from where it is
        //to where is is given as an input, but this method does not use coordinates as input, instead it receives
        //an number for an specific direction

        if (jahat == 1) {//North
            y2 = y1 - 1;
            x2 = x1;
            if (b.Board[y1][x1] == 'B' && b.Board[y1][x1] != b.Board[y2][x2]) {
                b.Board[y2][x2] = b.Board[y1][x1];
                b.Board[y1][x1] = '_';
            }
        }
        if (jahat == 2) {//North-East
            y2 = y1 - 1;
            x2 = x1 + 1;
            if (b.Board[y1][x1] == 'B' && b.Board[y1][x1] != b.Board[y2][x2]) {
                b.Board[y2][x2] = b.Board[y1][x1];
                b.Board[y1][x1] = '_';
            }
        }
        if (jahat == 3) {//East
            y2 = y1;
            x2 = x1 + 1;
            if (b.Board[y1][x1] == 'B' && b.Board[y1][x1] != b.Board[y2][x2]) {
                b.Board[y2][x2] = b.Board[y1][x1];
                b.Board[y1][x1] = '_';
            }
        }
        if (jahat == 4) {//South-East
            y2 = y1 + 1;
            x2 = x1 + 1;
            if (b.Board[y1][x1] == 'B' && b.Board[y1][x1] != b.Board[y2][x2]) {
                b.Board[y2][x2] = b.Board[y1][x1];
                b.Board[y1][x1] = '_';
            }
        }
        if (jahat == 5) {//South
            y2 = y1 + 1;
            x2 = x1;
            if (b.Board[y1][x1] == 'B' && b.Board[y1][x1] != b.Board[y2][x2]) {
                b.Board[y2][x2] = b.Board[y1][x1];
                b.Board[y1][x1] = '_';
            }
        }
        if (jahat == 6) {//South-West
            y2 = y1 + 1;
            x2 = x1 - 1;
            if (b.Board[y1][x1] == 'B' && b.Board[y1][x1] != b.Board[y2][x2]) {
                b.Board[y2][x2] = b.Board[y1][x1];
                b.Board[y1][x1] = '_';
            }
        }
        if (jahat == 7) {//West
            y2 = y1;
            x2 = x1 - 1;
            if (b.Board[y1][x1] == 'B' && b.Board[y1][x1] != b.Board[y2][x2]) {
                b.Board[y2][x2] = b.Board[y1][x1];
                b.Board[y1][x1] = '_';
            }
        }
        if (jahat == 8) {//North-West
            y2 = y1 - 1;
            x2 = x1 - 1;
            if (b.Board[y1][x1] == 'B' && b.Board[y1][x1] != b.Board[y2][x2]) {
                b.Board[y2][x2] = b.Board[y1][x1];
                b.Board[y1][x1] = '_';
            }
        }


    }

    public boolean moveB2Check(int x1, int y1, int jahat, Board b) {//an advanced and semi-Overridden moveB2 method
        //which checks whether the ball is allowed to move to the given direction or not.
        //2 type of restrictions should have been implemented
        //1.the corner balls: the corner balls should not be allowed to move out of the board for in case that happens
        // the board array limits would break and the whole game would break down.
        //2.left side and ride side rows: for example the ball which is located in the right-row should not be
        //allowed to move to the right side anymore because then the ball would go out of the Board.
        //as you can see in this method every minor and major detail has been covered.

        if (jahat == 1) {//North
            if (y1 == 0 && x1 == b.getX() - 1) return false;
            if (x1 == 0 && y1 == 0) return false;
            if (y1 == 0) return false;
            y2 = y1 - 1;
            x2 = x1;
            if (b.Board[y1][x1] == 'B' && b.Board[y1][x1] != b.Board[y2][x2] && b.Board[y2][x2] != '*') {
                return true;
            } else return false;
        } else if (jahat == 2) {//North-East
            if (y1 == 0 && x1 == b.getX() - 1) return false;
            if (x1 == b.getX() - 1 && y1 == b.getY() - 1) return false;
            if (x1 == 0 && y1 == 0) return false;
            if (x1 == b.getX() - 1) return false;
            if (y1 == 0) return false;
            y2 = y1 - 1;
            x2 = x1 + 1;
            if (b.Board[y1][x1] == 'B' && b.Board[y1][x1] != b.Board[y2][x2] && b.Board[y2][x2] != '*') {
                return true;
            } else return false;
        } else if (jahat == 3) {//East
            if (y1 == 0 && x1 == b.getX() - 1) return false;
            if (x1 == b.getX() - 1 && y1 == b.getY() - 1) return false;
            if (x1 == b.getX() - 1) return false;
            if (y1 == 0) return false;
            y2 = y1;
            x2 = x1 + 1;
            if (b.Board[y1][x1] == 'B' && b.Board[y1][x1] != b.Board[y2][x2] && b.Board[y2][x2] != '*') {
                return true;
            } else return false;
        } else if (jahat == 4) {//South-East
            if (y1 == 0 && x1 == b.getX() - 1) return false;
            if (x1 == b.getX() - 1 && y1 == b.getY() - 1) return false;
            if (y1 == b.getY() - 1) return false;
            if (y1 == b.getY() - 1 && x1 == 0) return false;
            if (x1 == b.getX() - 1) return false;
            y2 = y1 + 1;
            x2 = x1 + 1;
            if (b.Board[y1][x1] == 'B' && b.Board[y1][x1] != b.Board[y2][x2] && b.Board[y2][x2] != '*') {
                return true;
            } else {
                return false;
            }
        } else if (jahat == 5) {//South
            if (x1 == b.getX() - 1 && y1 == b.getY() - 1) return false;
            if (y1 == b.getY() - 1) return false;
            if (y1 == b.getY() - 1 && x1 == 0) return false;
            y2 = y1 + 1;
            x2 = x1;
            if (b.Board[y1][x1] == 'B' && b.Board[y1][x1] != b.Board[y2][x2] && b.Board[y2][x2] != '*') {
                return true;
            } else {
                return false;
            }
        } else if (jahat == 6) {//South-West
            if (x1 == b.getX() - 1 && y1 == b.getY() - 1) return false;
            if (y1 == b.getY() - 1) return false;
            if (y1 == b.getY() - 1 && x1 == 0) return false;
            if (x1 == 0 && y1 == 0) return false;
            if (x1 == 0) return false;
            y2 = y1 + 1;
            x2 = x1 - 1;
            if (b.Board[y1][x1] == 'B' && b.Board[y1][x1] != b.Board[y2][x2] && b.Board[y2][x2] != '*') {
                return true;
            } else {
                return false;
            }
        } else if (jahat == 7) {//West
            if (y1 == b.getY() - 1 && x1 == 0) return false;
            if (x1 == 0 && y1 == 0) return false;
            if (x1 == 0) return false;
            y2 = y1;
            x2 = x1 - 1;
            if (b.Board[y1][x1] == 'B' && b.Board[y1][x1] != b.Board[y2][x2] && b.Board[y2][x2] != '*') {
                return true;
            } else {
                return false;
            }
        } else if (jahat == 8) {//North-West
            if (y1 == b.getY() - 1 && x1 == 0) return false;
            if (y1 == 0 && x1 == b.getX() - 1) return false;
            if (x1 == 0 && y1 == 0) return false;
            if (x1 == 0) return false;
            if (y1 == 0) return false;
            y2 = y1 - 1;
            x2 = x1 - 1;
            if (b.Board[y1][x1] == 'B' && b.Board[y1][x1] != b.Board[y2][x2] && b.Board[y2][x2] != '*') {
                return true;
            } else {
                return false;
            }
        } else return false;

    }

    public boolean moveR2Check(int x1, int y1, int jahat, Board b) {//an advanced and semi-Overridden moveR2 method
        //which checks whether the ball is allowed to move to the given direction or not.
        //2 type of restrictions should have been implemented
        //1.the corner balls: the corner balls should not be allowed to move out of the board for in case that happens
        // the board array limits would break and the whole game would break down.
        //2.left side and ride side rows: for example the ball which is located in the right-row should not be
        //allowed to move to the right side anymore because then the ball would go out of the Board.
        //as you can see in this method every minor and major detail has been covered.

        if (jahat == 1) {//North
            if (y1 == 0 && x1 == b.getX() - 1) return false;
            if (x1 == 0 && y1 == 0) return false;
            if (y1 == 0) return false;
            y2 = y1 - 1;
            x2 = x1;
            if (b.Board[y1][x1] == 'R' && b.Board[y1][x1] != b.Board[y2][x2] && b.Board[y2][x2] != '+') {
                return true;
            } else return false;
        } else if (jahat == 2) {//North-East
            if (y1 == 0) return false;
            if (x1 == b.getX() - 1 && y1 == b.getY() - 1) return false;
            if (x1 == b.getX() - 1) return false;
            y2 = y1 - 1;
            x2 = x1 + 1;
            if (b.Board[y1][x1] == 'R' && b.Board[y1][x1] != b.Board[y2][x2] && b.Board[y2][x2] != '+') {
                return true;
            } else return false;
        } else if (jahat == 3) {//East
            if (y1 == 0 && x1 == b.getX() - 1) return false;
            if (x1 == b.getX() - 1 && y1 == b.getY() - 1) return false;
            if (x1 == b.getX() - 1) return false;
            y2 = y1;
            x2 = x1 + 1;
            if (b.Board[y1][x1] == 'R' && b.Board[y1][x1] != b.Board[y2][x2] && b.Board[y2][x2] != '+') {
                return true;
            } else return false;
        } else if (jahat == 4) {//South-East
            if (y1 == 0 && x1 == b.getX() - 1) return false;
            if (x1 == b.getX() - 1 && y1 == b.getY() - 1) return false;
            if (y1 == b.getY() - 1) return false;
            if (y1 == b.getY() - 1 && x1 == 0) return false;
            if (x1 == b.getX() - 1) return false;
            y2 = y1 + 1;
            x2 = x1 + 1;
            if (b.Board[y1][x1] == 'R' && b.Board[y1][x1] != b.Board[y2][x2] && b.Board[y2][x2] != '+') {
                return true;
            } else {
                return false;
            }
        } else if (jahat == 5) {//South
            if (x1 == b.getX() - 1 && y1 == b.getY() - 1) return false;
            if (y1 == b.getY() - 1) return false;
            if (y1 == b.getY() - 1 && x1 == 0) return false;
            y2 = y1 + 1;
            x2 = x1;
            if (b.Board[y1][x1] == 'R' && b.Board[y1][x1] != b.Board[y2][x2] && b.Board[y2][x2] != '+') {
                return true;
            } else {
                return false;
            }
        } else if (jahat == 6) {//South-West
            if (x1 == b.getX() - 1 && y1 == b.getY() - 1) return false;
            if (y1 == b.getY() - 1) return false;
            if (y1 == b.getY() - 1 && x1 == 0) return false;
            if (x1 == 0 && y1 == 0) return false;
            if (x1 == 0) return false;
            y2 = y1 + 1;
            x2 = x1 - 1;
            if (b.Board[y1][x1] == 'R' && b.Board[y1][x1] != b.Board[y2][x2] && b.Board[y2][x2] != '+') {
                return true;
            } else {
                return false;
            }
        } else if (jahat == 7) {//West
            if (y1 == b.getY() - 1 && x1 == 0) return false;
            if (x1 == 0 && y1 == 0) return false;
            if (x1 == 0) return false;
            y2 = y1;
            x2 = x1 - 1;
            if (b.Board[y1][x1] == 'R' && b.Board[y1][x1] != b.Board[y2][x2] && b.Board[y2][x2] != '+') {
                return true;
            } else {
                return false;
            }
        } else if (jahat == 8) {//North-West
            if (y1 == 0) return false;
            if (y1 == b.getY() - 1 && x1 == 0) return false;
            if (x1 == 0) return false;
            y2 = y1 - 1;
            x2 = x1 - 1;
            if (b.Board[y1][x1] == 'R' && b.Board[y1][x1] != b.Board[y2][x2] && b.Board[y2][x2] != '+') {
                return true;
            } else {
                return false;
            }
        } else return false;


    }
}


