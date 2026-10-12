package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class MazeWithObstacle {

    static void main() {
        boolean[][] maze= { {true, true, true},{ true, true, true}, {true, true, true}};

        System.out.println(maze(maze,0, 0));

        System.out.println(mazeRe("", maze, 0,0));

    }

    static int maze(boolean[][] maze, int r, int c){
        if (r >= maze.length || c >= maze[0].length ) {
            return 0;
        }
        if (r == maze.length - 1 && c == maze[0].length -1){
            return 1;
        }
        if (!maze[r][c] ){
            return 0;
        }

        int left = maze(maze, r+1,c);
        int right = maze(maze, r, c + 1);
        return left + right;
    }

    static List<String> mazeRe(String p, boolean[][] maze, int r, int c){

        if (r == maze.length-1 && c == maze[0].length -1){
            List<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        if (!maze[r][c]){
            return new ArrayList<>();
        }
        List<String> ans = new ArrayList<>();
        if (r < maze.length - 1){
            ans.addAll(mazeRe( p + "D", maze, r + 1, c));
        }
        if (c < maze[0].length -1 ){
            ans.addAll(mazeRe(p + "R",maze, r, c+ 1));
        }
        return ans;
    }
}
