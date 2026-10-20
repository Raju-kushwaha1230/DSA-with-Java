package mighty.org;

public class SudokuSolverString {
    static void main() {
        String[][] stringBoard = {
                {"5", "3", ".", ".", "7", ".", ".", ".", "."},
                {"6", ".", ".", "1", "9", "5", ".", ".", "."},
                {".", "9", "8", ".", ".", ".", ".", "6", "."},
                {"8", ".", ".", ".", "6", ".", ".", ".", "3"},
                {"4", ".", ".", "8", ".", "3", ".", ".", "1"},
                {"7", ".", ".", ".", "2", ".", ".", ".", "6"},
                {".", "6", ".", ".", ".", ".", "2", "8", "."},
                {".", ".", ".", "4", "1", "9", ".", ".", "5"},
                {".", ".", ".", ".", "8", ".", ".", "7", "9"}
        };
        if (solve(stringBoard)){
            display(stringBoard);
        }else{
            System.out.println("Notsolved");
        }
    }

    static void display(String[][] board){

        for (String[] row: board){
            for (String element: row){
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }

    static boolean solve(String[][] board){
        //
        int n = board.length;
        int row = -1;
        int col = -1;

        // put values in empty splace
        boolean isEmpty = true;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j].equals(".")){
                    row = i;
                    col = j;
                    isEmpty = false;
                    break;
                }

                //

            }
            if (!isEmpty){
                break;
            }

        }
        if (isEmpty){
            return true;
            // found the enser
        }

        // checking the safe condition

        for (int number = 1; number <= 9; number++) {
            String num = String.valueOf(number);
            if (isSafe(board, row, col, num)){
                board[row][col] = num;
                if (solve(board)){
                    return true;
                }else{
                    board[row][col] = ".";
                }

            }
        }
        return false;
    }
    
    static boolean isSafe(String[][] board, int row, int col,String num){
        // check for row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i].equals(num)){
                return false;
            }
        }

        //check for column
        for (String[] nums: board){
            if (nums[col].equals(num)){
                return false;
            }
        }

        // check for box
        int sqrt = (int) ( Math.sqrt(board.length));
        int rowstart = row - row % sqrt;
        int colstart = col - col % sqrt;

        for (int r = rowstart; r <  rowstart + sqrt; r++) {
            for (int c = colstart; c < colstart + sqrt; c++) {
                if (board[r][c].equals(num)){
                    return false;
                }
            }
        }
        return true;
    }
    
}
