package Projectstictac;

import java.util.Scanner;

public class Move {

    public static void getMove(int row, int col){

        boolean playing = true;

        while(playing) {
            if(row < 0 || col < 0 || row > 2 || col > 2) {
                System.out.println("Row and col are out of bounds");
            } else if (board[row][col] != '-') {
                System.out.println("Someone has already made amove there");
            } else {
                break;
            }
        }

    }

}
