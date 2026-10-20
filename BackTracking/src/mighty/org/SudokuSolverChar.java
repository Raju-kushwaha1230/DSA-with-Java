package mighty.org;

public class SudokuSolverChar {
    static void main() {
        char[][] stringBoard = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println(solve(stringBoard));
        if (solve(stringBoard)){
            display(stringBoard);
        }
    }

    static void display(char[][] board){
        for(char[] row: board){
            for (char element: row){
                System.out.print(element+ " ");
            }
            System.out.println();
        }
    }


    static boolean solve(char[][] board){
        int n = board.length;
        int row = -1;
        int col =-1;

        // iterate the row and put values
        boolean isEmpty = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.'){
                    row = i;
                    col = j;
                    isEmpty = false;
                    break;
                }
            }

            if (!isEmpty){ // is false then got answer
                break;
            }
        }
        if (isEmpty){ // means got answer there is not empoty
            return true;

        }

        // check the safe condition

        for (int num = 1; num <=9; num++) {
            char number = (char)('0' + num);

            if (isSafe(board,row,col,number)){
                board[row][col] = number;
                if (solve(board)){
                    return true;
                }else{
                    board[row][col] = '.';
                }
            }
        }
        return false;
    }

    static boolean isSafe(char[][] board, int row,int col, char number){
        // check for the row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == number){
                return false;
            }
        }

        //check for the col
        for (char[] num : board){
            if (num[col] == number){
                return false;
            }
        }

        // check foe ths box
        int sqrt= (int)(Math.sqrt(board.length));
        int rowstart = row - row % sqrt;
        int colstart = col - col % sqrt;

        for (int r = rowstart; r < rowstart + sqrt; r++) {
            for (int c = colstart; c < colstart + sqrt; c++) {
                if (board[r][c] == number){
                    return false;
                }
            }

        }
        return true;
    }
}
