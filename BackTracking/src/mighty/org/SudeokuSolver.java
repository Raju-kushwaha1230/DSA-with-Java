package mighty.org;

public class SudeokuSolver {
    static void main() {
        int[][] sudokuBoard = {
                {5, 0, 3, 0, 0, 9, 0, 0, 1},
                {0, 0, 0, 0, 2, 0, 0, 0, 5},
                {0, 8, 4, 0, 6, 0, 0, 9, 0},
                {0, 0, 0, 8, 0, 0, 4, 1, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0},
                {0, 6, 1, 0, 0, 3, 0, 0, 0},
                {0, 3, 0, 0, 5, 0, 2, 8, 0},
                {9, 0, 0, 0, 7, 0, 0, 0, 0},
                {4, 0, 0, 9, 0, 0, 5, 0, 6}
        };

        if (solve(sudokuBoard)){
            display(sudokuBoard);
        }else {
            System.out.println("Not solved");
        }
    }

    static boolean solve(int[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;

        // putvalues at first at every empty place
        boolean isEmpty = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j]==0){
                    row = i;
                    col = j;
                    isEmpty = false;
                    break;
                }
            }
            //backtrack changes you made
            if (isEmpty == false){
                break;
            }
        }

        if (isEmpty){
            return true;
        }
        // checking the safe conditions
        for (int number = 1; number <= 9; number++) {
            if (isSafe(board, row, col, number)){
                board[row][col] = number;
                if (solve(board)){
                    return true;
                }else {
                    board[row][col] = 0;

                }
            }
        }
        return false;

    }

    static void display(int[][] board){
        for (int[] row: board){
            for (int element: row){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(int[][] arr, int row,int col, int number){
        // check for row

        for (int i = 0; i < arr.length; i++) {
            if (arr[row][i] == number){
                return false;
            }
        }

        //checkfor column
        for (int[] nums: arr){
            if (nums[col] == number){
                return false;
            }
        }
        //for box

        int sqrt = (int) (Math.sqrt(arr.length));
        int rowstart = row - row % sqrt;
        int colstart = col - col % sqrt;

        for (int r = rowstart; r < rowstart + sqrt; r++) {
            for (int c = colstart; c< colstart + sqrt; c++) {
                if (arr[r][c] == number){
                    return false;
                }
            }
        }
        return true;
    }
}
