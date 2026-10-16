package BackTracking;

import java.util.Arrays;

public class MazeWithAllDire {
    static void main() {

        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] arr = new int[maze.length][maze[0].length];
//         maze("",maze,0,0);
//         mazeAllPAth("", maze, 0,0,arr, 1);
        String[][] m = {{"+","+",".","+"},{".",".",".","+"},{"+","+","+","."}};
        int[][] apth = new int[m.length][m[0].length];
        int[] entrance = {1,2};

    }

    static void maze(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }
        maze[r][c] = false;

        if (r < maze.length - 1) {
            maze(p + "D", maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            maze(p + "R", maze, r, c + 1);
        }
        //left
        if (c > 0) {
            maze(p + "L", maze, r, c - 1);
        }
        if ( r >0){
            maze(p+ 'U', maze, r - 1, c);
        }

        maze[r][c] = true;
    }

    static void mazeAllPAth(String p , boolean[][] maze, int r, int c, int[][] path, int start ){
        if (r == maze.length -1&& c == maze[0].length -1){
            path[r][c] = start;
            System.out.println(start);
            for (int[] x:path){
                System.out.println(Arrays.toString(x));

            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[r][c]){
            return;
        }

        maze[r][c] = false;
        path[r][c] = start;

        if (r < maze.length - 1) {
            mazeAllPAth(p + "D", maze, r + 1, c, path,start +1 );
        }
        if (c < maze[0].length - 1) {
            mazeAllPAth(p + "R", maze, r, c + 1, path, start +1 );
        }
        //left
        if (c > 0) {
            mazeAllPAth(p + "L", maze, r, c - 1, path, start +1);
        }
        if ( r >0){
            mazeAllPAth(p+ 'U', maze, r - 1, c, path,start +1);
        }

        maze[r][c] = true;
        path[r][c] = 0;

    }

}
