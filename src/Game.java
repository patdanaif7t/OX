import java.util.Scanner;

public class Game {
    public  static OX ox;
    private static int col,row;
    private static Scanner in = new Scanner(System.in);

    public static void input(){
        System.out.println(ox.getCurrentPlayer() + "(Col): ");
        col = in.nextInt();
        System.out.println(ox.getCurrentPlayer() + "(Row): ");
        row = in.nextInt();
    }

    public static void main(String[] args) {
        ox = new OX();
        while (true){
            System.out.println(ox.getTableString());
            input();
            ox.put(col,row);
            ox.switchPlayer();
            if (ox.checkWin(col,row)==true){
                System.out.println(ox.getTableString());
                System.out.println("X win " + ox.countX);
                System.out.println("O win " + ox.countO);
                System.out.println("Draw " + ox.countDraw);
                break;
            }
        }
    }
}
