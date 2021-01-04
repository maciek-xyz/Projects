package Projectstictac;

public class Grid {

    public Grid() {
    }

    public static void drawBoard(){

        char[][] board = new char[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                board[i][j] = '-';
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
