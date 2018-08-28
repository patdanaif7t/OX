import java.util.Scanner;

public class OX {
    private  String[][] table = {
            {" ","0","1","2"},
            {"0","-","-","-"},
            {"1","-","-","-"},
            {"2","-","-","-"},
    } ;

    private String player;
    public   int countX;
    public int countO;
    public   int countDraw;

    public  OX(){
        player = "X";
        countX = 0;
        countO  = 0;
        countDraw = 0;
    }
    public String getTableString() {
        String result="";
        for (int row = 0; row <table.length ; row++) {
            for (int col = 0; col <table[row].length;col++) {
                result =  result+table[row][col];
            }
            result = result+"\n";
        }
        return result;
    }

    public String getCurrentPlayer() {
        return  player;
    }

    public int getCountO() {
        return countO;
    }

    public int getCountX() {
        return countX;
    }

    public int getCountDraw() {
        return countDraw;
    }
    public boolean put(int col, int row) {
        if (!table[row+1][col+1].equals("-")){
            return false;
        }
        table[row+1][col+1] = getCurrentPlayer(); // เพราะตอนสร้าง Table มันมีช่องเพิ่มขึ้นมาอย่างละหนึ่ง คือช่องหัวตาราง
        return true;
    }

    public void switchPlayer() {
        if (player.equals("X")){
            player="O";
        }
        else player="X";
    }

    public boolean checkWin(int col, int row) {
        for (int i = 0; i <3 ; i++) {
            if (table[i+1][col+1].equals(getCurrentPlayer())){
                if (getCurrentPlayer().equals("X")){
                    countX++;
                }else if (getCurrentPlayer().equals("O")){
                    countO++;
                }
            }
        }return false;
    }


    public static void main(String[] args) {
    }

}
