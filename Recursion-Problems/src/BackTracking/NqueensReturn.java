package BackTracking;

import jdk.dynalink.linker.LinkerServices;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class NqueensReturn {
    static void main() {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        List<List<String>> ans = queens(board,0);
        System.out.println(ans);
        }

    static List<List<String>>  queens(boolean[][] board, int row){
        List<List<String>> ans = new ArrayList<>();

        if (row == board.length){
            ans.add(helper(board));
            return ans;
        }


        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)){
                board[row][col] = true;
                ans.addAll(queens(board, row +1));
                board[row][col]  = false;
            }
        }
        return ans;
    }

    static List<String> helper(boolean[][] board){
        List<String> ans = new ArrayList<>();

        for (boolean[] row : board){
            StringBuilder ss = new StringBuilder();
            for (boolean element : row){
                if (element){
                    ss.append('Q');
                }else{
                    ss.append('.');
                }

            }
            ans.add(ss.toString());
        }
        return ans;
    }

    static boolean isSafe(boolean[][] board,int row,int col){

        // vertivcally
        for (int i = 0; i < row; i++) {
            if (board[i][col]){
                return false;
            }
        }

        // leftdia
        int leftdia= Math.min(row,col);
        for (int i = 1; i <= leftdia ; i++) {
            if (board[row - i][col - i]){
                return false;
            }
        }

        int righdia  = Math.min(row, board.length - col -1);
        for (int i = 1; i <= righdia ; i++) {
            if (board[row - i][col + i]){
                return false;
            }
        }
        return true;
    }

}
