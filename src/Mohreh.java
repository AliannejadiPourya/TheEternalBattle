public class Mohreh {//unfinished and incomplete ideas and maybe a future development
    private int x;
    private int y;
    char ch;
    int countb[] = {1, 1, 1, 1, 1, 1};
    int countr[] = {1, 1, 1, 1, 1, 1};

    public void setCh(char ch) {
        this.ch = ch;
    }

    public char getCh() {
        return ch;
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


    /*public void setBR(Board b){
         if(countb[0]<(b.getY()/2)-1){
           setX(b.getX()-1);
           setY((b.getY()/2)+1+countb[0]);
            if (b.Board[getX()][getY()]=='+') {
               System.out.println("you win");
        }
            b.Board[getX()][getY()-1]='_';
           b.Board[getX()][getY()]='>';
           countb[0]++;}

      }
    public void setBRU(Board b){
           if(countb[1]<=(b.getY()/2)-1){
           setX(b.getX()-2-countb[1]);
           setY(((b.getY()/2)-1)+2+countb[1]);
           if (b.Board[getX()][getY()]=='+') {
               System.out.println("you win");
        }
           b.Board[getX()][getY()]='/';
           b.Board[getX()+1][getY()-1]='_';
           countb[1]++;
           }

      }
    public void setBU(Board b){
           if(countb[2]<(b.getX())){
           setX(b.getX()-2-countb[2]);
           setY(b.getY()/2);
           if (b.Board[getX()][getY()]=='+') {
               System.out.println("you win");
        }
           b.Board[getX()][getY()]='^';

           b.Board[getX()+1][getY()]='_';
           countb[2]++;
           }

      }
    public void setBLU(Board b){
        if(countb[3]<(b.getY()/2)){
            setX(b.getX()-2-countb[3]);
           setY(b.getY()/2-1-countb[3]);
           if (b.Board[getX()][getY()]=='+') {
               System.out.println("you win");
        }
           b.Board[getX()][getY()]='\\';

           b.Board[getX()+1][getY()+1]='_';
           countb[3]++;
        }
      }
    public void setBL(Board b){
         if(countb[4]<(b.getY()/2)){
           setX(b.getX()-1);
           setY((b.getY()/2)-1-countb[4]);
            if (b.Board[getX()][getY()]=='+') {
               System.out.println("you win");
        }
            b.Board[getX()][getY()+1]='_';
           b.Board[getX()][getY()]='<';
           countb[4]++;}
      }


    public void setRR(Board b){
         if(countr[0]<(b.getY()/2)){
           setX(0);
           setY((b.getY()/2)-1-countb[0]);
            if (b.Board[getX()][getY()]=='*') {
               System.out.println("you win");
        }
            b.Board[getX()][getY()+1]='_';
           b.Board[getX()][getY()]='<';
           countr[0]++;}
    }
    public void setRRU(Board b){
        if(countr[1]<(b.getY()/2)){
           setX(1+countr[1]);
           setY(b.getY()/2-1-countr[1]);
           if (b.Board[getX()][getY()]=='*') {
               System.out.println("you win");
        }
           b.Board[getX()][getY()]='/';

           b.Board[getX()-1][getY()+1]='_';
           countr[1]++;
        }
    }
    public void setRU(Board b){
        if(countr[2]<(b.getX())){
           setX(1+countr[2]);
           setY(b.getY()/2);
           if (b.Board[getX()][getY()]=='*') {
               System.out.println("you win");
        }
           b.Board[getX()][getY()]='|';

           b.Board[getX()-1][getY()]='_';
           countr[2]++;
           }

    }
    public void setRLU(Board b){
        if(countr[3]<=(b.getY()/2)-1){
           setX(1+countr[3]);
           setY(((b.getY()/2)+1)+countr[3]);
           if (b.Board[getX()][getY()]=='*') {
               System.out.println("you win");
        }
           b.Board[getX()][getY()]='\\';
           b.Board[getX()-1][getY()-1]='_';
           countr[3]++;
           }
    }
    public void setRL(Board b){
        if(countr[4]<(b.getY()/2)-1){
           setX(0);
           setY((b.getY()/2)+1+countr[4]);
            if (b.Board[getX()][getY()]=='*') {
               System.out.println("you win");
        }
            b.Board[getX()][getY()-1]='_';
           b.Board[getX()][getY()]='>';
           countr[4]++;}}
    */

      /*  public void setPlayer(String kind,String color,Board b){
         if(kind.equalsIgnoreCase("R")){
            if(color.equalsIgnoreCase("Red")){
                setX(0);
                setY((b.getX()/2)+1);
                b.Board[getX()][(getY())]='<';
            }
            if(color.equalsIgnoreCase("Blue")){
                b.Board[b.getX()-1][(b.getX()/2)+1]='>';
            }
        }
        if(kind.equalsIgnoreCase("RU")){
            if(color.equalsIgnoreCase("Red")){
              b.Board[1][(b.getX()/2)-1]='/';
            }
            if(color.equalsIgnoreCase("Blue")){
                b.Board[b.getX()-2][(b.getX()/2)+1]='/';
            }
        }
      if(kind.equalsIgnoreCase("U")){
            if(color.equalsIgnoreCase("Red")){
              b.Board[1][(b.getX()/2)]='|';
            }
            if(color.equalsIgnoreCase("Blue")){
                b.Board[b.getX()-2][(b.getX()/2)]='^';
            }
        }
        if(kind.equalsIgnoreCase("LU")){
            if(color.equalsIgnoreCase("Red")){
            b.Board[1][(b.getX()/2)+1]='\\';
            }
            if(color.equalsIgnoreCase("Blue")){
                b.Board[b.getX()-2][(b.getX()/2)-1]='\\';
            }
        }
        if(kind.equalsIgnoreCase("L")){
             if(color.equalsIgnoreCase("Red")){
                b.Board[0][(b.getX()/2)+1]='>';
            }
            if(color.equalsIgnoreCase("Blue")){
                b.Board[b.getX()-1][(b.getX()/2)-1]='<';
            }
        }
        if(kind.equalsIgnoreCase("C")){
             if(color.equalsIgnoreCase("Red")){
                b.Board[0][(b.getX()/2)]='+';
            }
            if(color.equalsIgnoreCase("Blue")){
                b.Board[b.getX()-1][(b.getX()/2)]='*';
            }
        }
    }*/

        /*public void MoveBRU(String name,Mohreh m,Board b){
       if(name.equalsIgnoreCase("bru")){
            m.setBRU(b);
       }

    }
    public void MoveBR(String name,Mohreh m,Board b){
       if(name.equalsIgnoreCase("br")){
            m.setBR(b);
       }

    }
    public void MoveBU(String name,Mohreh m,Board b){
       if(name.equalsIgnoreCase("bu")){
            m.setBU(b);
       }

    }
    public void MoveBLU(String name,Mohreh m,Board b){
       if(name.equalsIgnoreCase("blu")){
            m.setBLU(b);
       }

    }
    public void MoveBL(String name,Mohreh m,Board b){
       if(name.equalsIgnoreCase("bl")){
            m.setBL(b);
       }

    }*/
}












