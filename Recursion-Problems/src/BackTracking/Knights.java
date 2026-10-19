package BackTracking;

public class Knights {
    static void main() {
        int n =4;
            boolean[][] board = new boolean[n][n];
            knight(board,0,0,4);
    }
    static void knight(boolean[][] boards,int row,int col,int knights ){
        if (knights == 0){
            display(boards);
            System.out.println();
            return;
        }



        if (row == boards.length - 1 && col == boards.length){
            return;
        }

        if (col == boards.length){
            knight(boards, row + 1, 0, knights);
            return;
        }
        if (isSafe(boards, row,col)){
            boards[row][col] = true;
            knight(boards,row ,col + 1 , knights - 1);
            boards[row][col] = false;
        }
        knight(boards, row, col + 1, knights);
    }

    static boolean isSafe(boolean[][] board, int row, int col){

        if (isVal(board, row -2, col -1)){
            if (board[row -2][col -1]){
                return false;
            }
        }

        if (isVal(board, row -1, col -2)){
            if (board[row -1][col-2]){
                return false;
            }
        }

        if (isVal(board, row-2, col + 1)){
            if (board[row-2][col + 1]){
                return false;
            }
        }

        if (isVal(board, row -1, col + 2)){
            if (board[row-1][col+ 2]){
                return false;
            }
        }


        return true;

    }

    static boolean isVal(boolean[][] board, int row, int col){
        if (row >= 0 && row < board.length && col >= 0 && col < board.length){
            return true;
        }
        return false;
    }

    static void display(boolean[][] board){
        for (boolean[] row: board){
            for (boolean element: row){
                if (element){
                    System.out.print("K ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}