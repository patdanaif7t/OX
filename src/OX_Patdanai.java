import java.util.Scanner;
public class OX_Patdanai {

    static int row, col, turn=1, countX=0, countO=0; // กำหนดค่าเริ่มต้นของตัวแปนร
    public static String arr[][] = new String[3][3];


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        //ใส่ - เข้าไปในตาราง
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = "-";
            }
        }
        while(true){   // ลูปนี้เจนเลขหัวแถว
            System.out.println("  0 1 2");
            for(int i=0;i<3;i++){
                System.out.print(i+" ");
                for(int j=0;j<3;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }

            if(turn%2!=0){
                while(true) {
                    while (true) {
                        System.out.println("X (col): ");
                        col = kb.nextInt();
                        if (col > 2 || col < 0) {
                            System.out.println("ใส่ใหม่");  //กำหนดขอบเขตคอลัมไม่ให้มันเกิน...
                        } else {
                            break;
                        }
                    }
                    while (true) {
                        System.out.println("X (row): ");   //ถ้าป้อน col มาแล้วมันไม่เกิน ก็มาป้อน row
                        row = kb.nextInt();
                        if (row > 2 || row < 0) {
                            System.out.println("ใส่ใหม่");
                        } else {
                            break;
                        }
                    } // จบการดัก
                    if (arr[row][col].equals("-")) {  //เช็ค ตำแหน่งที่เราป้อนมาว่าว่างไหม
                        arr[row][col] = "X";  //ถ้าว่างให้เติม x
                        turn++;
                        countX++;
                        break;
                    } else {
                        System.out.println("ซ้ำ ซ้ำ ซ้ำ!!!");
                    }
                }


            }
            else if(turn%2==0){
                while(true){
                    while(true){
                        System.out.println("O (col): ");
                        col = kb.nextInt();
                        if(col >2 || col <0){
                            System.out.println("ใส่ใหม่");
                        }else{
                            break;
                        }
                    }
                    while(true){
                        System.out.println("O (row): ");
                        row = kb.nextInt();
                        if(row>2 || row<0){
                            System.out.println("ใส่ใหม่");
                        }else{
                            break;
                        }
                    }
                    if(arr[row][col].equals("-")){
                        arr[row][col] = "O";
                        turn++;
                        countO++;
                        break;
                    }else{
                        System.out.println("ซ้ำ ซ้ำ ซ้ำ!!!");
                    }
                }
            }
            if(arr[0][0].equals("X")&&arr[1][1].equals("X")&&arr[2][2].equals("X"))
            {
                System.out.println("X win 1");
                System.out.println("O win 0");
                System.out.println("Draw 0");
                break;
            }
            else if(arr[0][2].equals("X")&&arr[1][1].equals("X")&&arr[2][0].equals("X"))
            {
                System.out.println("X win 1");
                System.out.println("O win 0");
                System.out.println("Draw 0");
                break;
            }
            else if(arr[0][0].equals("X")&&arr[1][0].equals("X")&&arr[2][0].equals("X"))
            {
                System.out.println("X win 1");
                System.out.println("O win 0");
                System.out.println("Draw 0");
                break;
            }
            else if(arr[0][1].equals("X")&&arr[1][1].equals("X")&&arr[2][1].equals("X"))
            {
                System.out.println("X win 1");
                System.out.println("O win 0");
                System.out.println("Draw 0");
                break;
            }
            else if(arr[0][2].equals("X")&&arr[1][2].equals("X")&&arr[2][2].equals("X"))
            {
                System.out.println("X win 1");
                System.out.println("O win 0");
                System.out.println("Draw 0");
                break;
            }
            else if(arr[0][0].equals("X")&&arr[0][1].equals("X")&&arr[0][2].equals("X"))
            {
                System.out.println("X win 1");
                System.out.println("O win 0");
                System.out.println("Draw 0");
                break;
            }
            else if(arr[1][0].equals("X")&&arr[1][1].equals("X")&&arr[1][2].equals("X"))
            {
                System.out.println("X win 1");
                System.out.println("O win 0");
                System.out.println("Draw 0");
                break;
            }
            else if(arr[2][0].equals("X")&&arr[2][1].equals("X")&&arr[2][2].equals("X"))
            {
                System.out.println("X win 1");
                System.out.println("O win 0");
                System.out.println("Draw 0");
                break;
            }


            else if(arr[0][0].equals("O")&&arr[1][1].equals("O")&&arr[2][2].equals("O"))
            {
                System.out.println("X win 0");
                System.out.println("O win 1");
                System.out.println("Draw 0");
                break;
            }
            else if(arr[0][2].equals("O")&&arr[1][1].equals("O")&&arr[2][0].equals("O"))
            {
                System.out.println("X win 0");
                System.out.println("O win 1");
                System.out.println("Draw 0");
                break;
            }
            else if(arr[0][0].equals("O")&&arr[1][0].equals("O")&&arr[2][0].equals("O"))
            {
                System.out.println("X win 0");
                System.out.println("O win 1");
                System.out.println("Draw 0");
                break;
            }
            else if(arr[0][1].equals("O")&&arr[1][1].equals("O")&&arr[2][1].equals("O"))
            {
                System.out.println("X win 0");
                System.out.println("O win 1");
                System.out.println("Draw 0");
                break;
            }
            else if(arr[0][2].equals("O")&&arr[1][2].equals("O")&&arr[2][2].equals("O"))
            {
                System.out.println("X win 0");
                System.out.println("O win 1");
                System.out.println("Draw 0");
                break;
            }
            else if(arr[0][0].equals("O")&&arr[0][1].equals("O")&&arr[0][2].equals("O"))
            {
                System.out.println("X win 0");
                System.out.println("O win 1");
                System.out.println("Draw 0");
                break;
            }
            else if(arr[1][0].equals("O")&&arr[1][1].equals("O")&&arr[1][2].equals("O"))
            {
                System.out.println("X win 0");
                System.out.println("O win 1");
                System.out.println("Draw 0");
                break;
            }
            else if(arr[2][0].equals("O")&&arr[2][1].equals("O")&&arr[2][2].equals("O"))
            {
                System.out.println("X win 0");
                System.out.println("O win 1");
                System.out.println("Draw 0");
                break;
            }else if(countX == 5 && countO == 4){  // ตารางมี 9 ถ้าเดินครบแล้วยังไม่มีใครชนะก็เสมอ
                System.out.println("X win 0");
                System.out.println("O win 0");
                System.out.println("Draw 1");
                break;
            }
            else if(countO == 5 && countX == 4){
                System.out.println("X win 0");
                System.out.println("O win 0");
                System.out.println("Draw 1");
                break;
            }
        }
    }
}
