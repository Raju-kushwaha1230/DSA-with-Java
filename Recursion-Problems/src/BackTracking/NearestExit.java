package BackTracking;
/*

You are given an m x n matrix maze (0-indexed) with empty cells (represented as '.') and walls
(represented as '+'). You are also given the entrance of the maze, where entrance = [entrancerow, entrancecol]
denotes the row and column of the cell you are initially standing at.


empty cells (represented as '.') and walls (represented as '+')
 */
public class NearestExit {
    static void main() {
        String[][] maze = {{"+","+",".","+"},{".",".",".","+"},{"+","+","+","."}};
        String[][] maze1 = {{"+","+","+"},{".",".","."},{"+","+","+"}};
        int[] en = {1,0};
        int[] entrance = {1,2};
        System.out.println(mazeNewaresExit(maze, entrance[0],entrance[1], 1));
        System.out.println(mazeNewaresExit(maze1,en[0],en[1], 1));

    }

    static int mazeNewaresExit(String[][] maze, int r, int c, int start ){
        if (r== maze.length -1 && c == maze[0].length -1){
            System.out.println(start);
            return start;
        }

        if (!maze[r][c].equals("+")){
            return 1;
        }

        if (r < maze.length - 1) {
            return mazeNewaresExit(  maze, r + 1, c,start +1 );
        }
        if (c < maze[0].length - 1) {
            return mazeNewaresExit(  maze, r, c + 1, start +1 );
        }
        //left
        if (c > 0) {
            return mazeNewaresExit(  maze, r, c - 1, start +1);
        }
        if ( r >0){
            return mazeNewaresExit(  maze, r - 1, c, start +1);
        }

        return start;
    }
}
