import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);//by doing this we can use the scanner in all the methods
    public static Board board;
    public static Player player = new Player();
    public static Move blue;
    public static Move red;
    public static Harekat hr = new Harekat();
    public static int flag = 2;//for checking the players turn
    public static boolean flag2 = false;//for checking if the user entered anything before creating a borad

    public static void main(String[] args) {
        String filepath = "OMORI_OST_005_By_Your_Side._7GIWV__qx4M_140.wav";//filepath for music

        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {//will show the menu until the game is finished
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {//switch case for different choices
                case 0:
                    printInstructions();//prints the instructions for the user
                    break;
                case 1:
                    createBoard();//creates a board with users input
                    flag2 = true;//when the board is created other choices can be selected
                    break;
                case 2:
                    if (flag2) {
                        printBoard();//prints the board
                    } else {
                        System.out.println("Board not found.");
                    }
                    break;
                case 3:
                    if (flag2) {
                        addPlayer();//adds the players to the board
                    } else System.out.println("Board not found.");
                    break;
                case 4:
                    if (flag2) {
                        if (flag != 1) {//if its red's turn, then is it allowed to move
                            moveRed();
                            flag = 1;
                            if (board.Board[board.getX() - 1][(board.getX() / 2)] != '*') {//when the blue king (*) is defeated the red team wins
                                System.out.println("The Red Team Won!");
                                quit = true;
                            }
                        } else System.out.println("It's not your turn!");
                    } else System.out.println("Board not found.");
                    break;
                case 5:
                    if (flag2) {
                        if (flag != 0) {//if its blue's turn, then is it allowed to move
                            moveBlue();
                            flag = 0;
                            if (board.Board[0][(board.getX() / 2)] != '+') {//when the red king (+) is defeated the red team wins
                                System.out.println("The Blue Team Won!");
                                quit = true;
                            }
                        } else System.out.println("It's not your turn!");
                    } else System.out.println("Board not found.");
                    break;
                case 6:
                    if (flag2) {
                        restart();//will restart the board
                    } else System.out.println("Board not found");
                    break;
                case 7:
                    if (flag2) {
                        countBlue();//counts the blue team remaining balls
                    } else System.out.println("Board not found.");
                    break;
                case 8:
                    if (flag2) {
                        countRed();//counts the red team remaining balls
                    } else System.out.println("Board not found");
                    break;

                case 9://quit
                    System.out.println("Thank You for Playing!");
                    quit = true;
                    break;
                default://if user enters invalid choice then the following will be printed
                    System.out.println("This is not a valid choice!");
                    break;

            }
        }
    }

    public static void printInstructions() {//method for printing the instructions
        System.out.println("\t        Welcome!");
        System.out.println("Press ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To create a Board.");
        System.out.println("\t 2 - To print the Board.");
        System.out.println("\t 3 - To add The Players to the Board.");
        System.out.println("\t 4 - To Move The Red Team Players.");
        System.out.println("\t 5 - To Move The Blue Team Players.");
        System.out.println("\t 6 - To Restart the Board.");
        System.out.println("\t 7 - To Count the remaining Blue Balls.");
        System.out.println("\t 8 - To Count the remaining Red Balls.");
        System.out.println("\t 9 - To quit the Game.");

    }


    public static void createBoard() {//creates a board with user's input
        boolean userInputCorrect = false;
        int x;
        do {
            System.out.println("Please enter the length(the minimum is 5):");
            x = scanner.nextInt();
            userInputCorrect = x > 4;
            if (!userInputCorrect) {
                System.out.println("Error Please re-enter.");//will get input until correct
            }
        } while (!userInputCorrect);

        userInputCorrect = false;
        int y;
        do {
            System.out.println("Please enter the width(the minimum is 5):");
            y = scanner.nextInt();
            userInputCorrect = y > 4;
            if (!userInputCorrect) {
                System.out.println("Error Please re-enter.");//will get input until correct
            }
        } while (!userInputCorrect);

        board = new Board(x, y);
        System.out.println("A Board with the length of " + x + " and width of " + y + " was created.");
        System.out.println("The Board: ");
        board.print();

    }

    public static void addPlayer() {//adds the players to the board
        player.setDefault(board);
        System.out.println("Players added to the Board");

    }

    public static void moveRed() {//method for moving the red balls
        printBoard();
        hr.redlist(board);//prints the current red balls locations

        int x1;
        int y1;
        boolean userInputCorrect1 = false;

        do {
            System.out.println("Please enter the current Blue Ball Abscissa(known as the X):");
            x1 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Please enter the current Blue Ball Ordinate(known as the Y):");
            y1 = scanner.nextInt();
            scanner.nextLine();

            userInputCorrect1 = moveRedCheck(x1 - 1, y1 - 1, board);//if the coordinates which user entered are not correct, then user will be asked for the coordinates another time
            if (!userInputCorrect1) {
                System.out.println("Error that's not a valid Red Ball, Please re-enter.");
            }
        } while (!userInputCorrect1);


        hr.barresi(y1 - 1, x1 - 1, board);//prints the available locations for the ball to move to
        board.print();
        hr.bazsazi(board);//will delete the "O"s

        red = new Move("red", board);//creates a move obj

        ArrayList<Integer> check = new ArrayList<>();//an arraylist for saving the valid locations

        for (int i = 1; i <= 8; i++) {
            if (red.moveR2Check(x1 - 1, y1 - 1, i, board)) {
                check.add(i);
            }
        }
        boolean flagTest = false;
        if(check.size() <= 0){
            flagTest = true;
        }
        if(!flagTest){
            boolean userInputCorrect = false;
            int jahat;
            do {
                System.out.println("How would you like to move your ball?");
                System.out.println("1.By Direction.");
                System.out.println("2.By Coordinates.");
                int tasmim = scanner.nextInt();
                scanner.nextLine();

                if (tasmim == 1) {
                    for (int i = 0; i < check.size(); i++) {
                        System.out.println(i + 1 + "." + JahatYab(check.get(i)) + ".");//gives the options in directions
                    }
                    System.out.println("Enter Direction:");
                    jahat = scanner.nextInt();
                    userInputCorrect = jahat <= check.size();
                    if (!userInputCorrect) {
                        System.out.println("Error Please re-enter.");//if not valid, will ask again
                    }
                } else {
                    for (int i = 0; i < check.size(); i++) {
                        System.out.println(i + 1 + "." + JahatYab2(x1, y1, check.get(i)) + ".");//gives the options in coordinates
                    }
                    System.out.println("Enter Direction:");
                    jahat = scanner.nextInt();
                    userInputCorrect = jahat <= check.size();
                    if (!userInputCorrect) {
                        System.out.println("Error Please re-enter.");//if not valid, will ask again
                    }
                }
            } while (!userInputCorrect);
            red.moveR2(x1 - 1, y1 - 1, check.get(jahat - 1), board);//will move the ball

            board.print();//prints the board
        } else {
            System.out.println("No Where To GO!");
        }

    }

    public static void moveBlue() {//method for moving the blue balls
        printBoard();
        hr.bluelist(board);//prints the current red balls locations

        int x1;
        int y1;
        boolean userInputCorrect1 = false;

        do {
            System.out.println("Please enter the current Blue Ball Abscissa(known as the X):");
            x1 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Please enter the current Blue Ball Ordinate(known as the Y):");
            y1 = scanner.nextInt();
            scanner.nextLine();

            userInputCorrect1 = moveBlueCheck(x1 - 1, y1 - 1, board);//if the coordinates which user entered are not correct, then user will be asked for the coordinates another time
            if (!userInputCorrect1) {
                System.out.println("Error that's not a valid Blue Ball, Please re-enter.");
            }
        } while (!userInputCorrect1);


        hr.barresi(y1 - 1, x1 - 1, board);//prints the available locations for the ball to move to
        board.print();
        hr.bazsazi(board);//will delete the "O"s

        blue = new Move("blue", board);//creates a move obj

        ArrayList<Integer> check = new ArrayList<>();//an arraylist for saving the valid locations

        for (int i = 1; i <= 8; i++) {
            if (blue.moveB2Check(x1 - 1, y1 - 1, i, board)) {
                check.add(i);
            }
        }

        boolean flagTest = false;
        if(check.size() <= 0){
            flagTest = true;
        }
        if(!flagTest){
            boolean userInputCorrect = false;
            int jahat;
            do {
                System.out.println("How would you like to move your ball?");
                System.out.println("1.By Direction.");
                System.out.println("2.By Coordinates.");
                int tasmim = scanner.nextInt();
                scanner.nextLine();

                if (tasmim == 1) {
                    for (int i = 0; i < check.size(); i++) {
                        System.out.println(i + 1 + "." + JahatYab(check.get(i)) + ".");//gives the options in directions
                    }
                    System.out.println("Enter Direction:");
                    jahat = scanner.nextInt();
                    userInputCorrect = jahat <= check.size();
                    if (!userInputCorrect) {//if not valid, will ask again
                        System.out.println("Error Please re-enter.");
                    }
                } else {
                    for (int i = 0; i < check.size(); i++) {
                        System.out.println(i + 1 + "." + JahatYab2(x1, y1, check.get(i)) + ".");//gives the options in coordinates
                    }
                    System.out.println("Enter Direction:");
                    jahat = scanner.nextInt();
                    userInputCorrect = jahat <= check.size();
                    if (!userInputCorrect) {//if not valid, will ask again
                        System.out.println("Error Please re-enter.");
                    }
                }
            } while (!userInputCorrect);

            blue.moveB2(x1 - 1, y1 - 1, check.get(jahat - 1), board);//will move the ball

            board.print();//prints the board
        } else {
            System.out.println("NO Where to GO!");
        }
    }


    public static void restart() {//will call the rest method in Board class and restarts the board
        board.rest();
        System.out.println("Board restarted");
    }

    public static void countBlue() {//will search for the blue balls and counts them
        int count = 0;
        for (int i = 0; i < board.getX(); i++) {
            for (int j = 0; j < board.getY(); j++) {
                if (board.Board[i][j] == 'B') {
                    count++;
                }
            }
        }
        System.out.println("The remaining Blue Balls: " + count);
    }

    public static void countRed() {//will search for the red balls and counts them
        int count = 0;
        for (int i = 0; i < board.getX(); i++) {
            for (int j = 0; j < board.getY(); j++) {
                if (board.Board[i][j] == 'R') {
                    count++;
                }
            }
        }
        System.out.println("The remaining Red Balls: " + count);
    }

    public static String JahatYab(int jahat) {//will print the direction according to the input and check functions

        switch (jahat) {
            case 1:
                return "North";

            case 2:
                return "North-East";

            case 3:
                return "East";

            case 4:
                return "South-East";

            case 5:
                return "South";

            case 6:
                return "South-West";

            case 7:
                return "West";

            case 8:
                return "North-West";
            default:
                return "LoL";

        }

    }

    public static String JahatYab2(int x1, int y1, int jahat) {//will print the coordinates according to the input and check functions

        switch (jahat) {
            case 1:
                return "X = " + x1 + ", Y = " + (y1 - 1);

            case 2:
                return "X = " + (x1 + 1) + ", Y = " + (y1 - 1);

            case 3:
                return "X = " + (x1 + 1) + ", Y = " + (y1);

            case 4:
                return "X = " + (x1 + 1) + ", Y = " + (y1 + 1);

            case 5:
                return "X = " + x1 + ", Y = " + (y1 + 1);

            case 6:
                return "X = " + (x1 - 1) + ", Y = " + (y1 + 1);

            case 7:
                return "X = " + (x1 - 1) + ", Y = " + (y1);

            case 8:
                return "X = " + (x1 - 1) + ", Y = " + (y1 - 1);
            default:
                return "LoL";

        }

    }

    public static boolean moveBlueCheck(int x1, int y1, Board b) {//checks if there is a blue ball or not
        if (b.Board[y1][x1] == 'B') {
            return true;
        } else return false;
    }

    public static boolean moveRedCheck(int x1, int y1, Board b) {//checks if there is a blue ball or not
        if (b.Board[y1][x1] == 'R') {
            return true;
        } else return false;
    }


    public static void printBoard() {//prints the board
        board.print();
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
