/**
 * Created by DT11ST on 8/18/2018.
 */import java.util.*;
public class OX_Fist {
    public static String xo[][] = new String[3][3];
    static Scanner kb = new Scanner(System.in);
    static   int wx = 0 , wo = 0 ,draw = 0;
    public static void main(String[] args) {
        run();
    }
    private static void run(){
        for (int i = 0; i < 3 ; i++) {
            setstart();
            print();
            int t = 0;
            while(check()==-1){
                if(t % 2 == 0){
                    t = letplay("x",t);
                }else{
                    t = letplay("o",t);
                }
                print();
                t++;
            }
            if (check()==1){
                wx++;
            }else if(check()==0){
                wo++;
            }else {
                draw++;
            }
            score(wx,wo,draw);
        }
    }

    public static void score(int wx , int wo , int draw) {
        System.out.println("_______________________");
        System.out.println("X win " + wx);
        System.out.println("O win " + wo);
        System.out.println("Draw " + draw);
    }

    public static int check(){

        if(xo[0][0]==xo[0][1]&&xo[0][2]==xo[0][1]&&!xo[0][0].equals("-")){ // xxx --- ---
            if(xo[0][0].equals("x")){
                return 1;
            }else {
                return 0;
            }
        }else if(xo[2][0]==xo[2][1]&&xo[2][1]==xo[2][2]&&!xo[2][0].equals("-")){//--- --- xxx
            if(xo[2][0].equals("x")){
                return 1;
            }else {
                return 0;
            }

        }else if(xo[1][0]==xo[1][1]&&xo[1][1]==xo[1][2]&&!xo[1][0].equals("-")){//--- xxx ---
            if(xo[1][0].equals("x")){
                return 1;
            }else {
                return 0;
            }

        }else if(xo[0][1]==xo[1][1]&&xo[1][1]==xo[2][1]&&!xo[0][1].equals("-")){// -x- -x- -x-
            if(xo[0][1].equals("x")){
                return 1;
            }else {
                return 0;
            }

        }else if(xo[0][0]==xo[1][0]&&xo[1][0]==xo[2][0]&&!xo[0][0].equals("-")){// x-- x-- x--
            if(xo[0][0].equals("x")){
                return 1;
            }else {
                return 0;
            }

        }else if(xo[0][2]==xo[1][2]&&xo[1][2]==xo[2][2]&&!xo[0][2].equals("-")){// --x --x --x
            if(xo[0][2].equals("x")){
                return 1;
            }else {
                System.out.println(0);
                return 0;
            }

        }else if(xo[0][0]==xo[1][1]&&xo[1][1]==xo[2][2]&&!xo[2][2].equals("-")){// x-- -x- --x
            if(xo[0][0].equals("x")){
                return 1;
            }else {
                return 0;
            }

        }else if(xo[2][0]==xo[1][1]&&xo[1][1]==xo[0][2]&&!xo[1][1].equals("-")){// --x -x- x--
            if(xo[2][0].equals("x")){
                return 1;
            }else {
                return 0;
            }

        }else {
            boolean draw = true;

            for (int i = 0; i < 3 ; i++) {
                for (int j = 0; j <3 ; j++) {
                    if(  xo[i][j].equals("-")){
                        draw = false;
                        break;
                    }
                }
            }
            if(draw==true){
                return 2;
            }else {
                return -1;
            }
        }
    }
    public static void print(){

        for (int i = -1; i < 3; i++) {
            if(i != -1){

                System.out.print(i + " ");

                for (int j = 0; j <3 ; j++) {

                    System.out.print(xo[i][j] + " ");
                }
                System.out.println();

            }else {
                System.out.println("  0 1 2 ");
            }
        }
        System.out.println();
    }
    public static void setstart(){
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                xo[i][j] = "-";
            }
        }
    }
    public static int letplay(String turn , int t){

        System.out.println(turn+" (col): =");
        int xc = kb.nextInt();
        System.out.println(turn+" (row): =");
        int xr = kb.nextInt();

        try{
            if( xo[xc][xr].equals("-")){
                xo[xc][xr] = turn;
                return t;

            }else {
                System.out.println("กาซ้ำไม่ได้");
                return t-1;
            }
        }catch (Exception e){
            System.out.println("กรุณากาให้ลงช่อง!!");
            return  t-1;
        }
    }
}
