package BackTracking;

public class Nqueens {
    static void main() {
        int n =9;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board,0));
    }

    static int queens(boolean[][] board, int row){
        if (row == board.length){
            diplay(board);
            System.out.println();
            return 1;
        }

        int count = 0;

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row,col)){
                board[row][col] = true;
                count = count + queens(board, row + 1);
                board[row][col] = false;
            }
        }

        return count;
    }

     private static boolean isSafe(boolean[][] board, int row, int col) {
        // vertically
        for (int i = 0; i < row; i++) {
            if (board[i][col]){
                return false;
            }
        }

        // leftdiagonal
        int leftmax = Math.min(row,col);
        for (int i = 1; i <= leftmax; i++) {
            if (board[row-i][col-i]){
                return false;
            }
        }

        //rightdaigonal

        int rightmax= Math.min(row, board.length- col -1);
        for (int i = 1; i <= rightmax; i++) {
            if (board[row-i][col+i]){
                return false;
            }
        }

        return true;

    }


    private static void diplay(boolean[][] board) {
        for (boolean[] row: board){
            for (boolean element: row){
                if (element){
                    System.out.print("Q ");
                }else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
