package BackTracking;

public class Maze {
    static void main() {
        System.out.println(maze(4,4));
    }

    static int maze(int r,int c){
        if (r == 1 || c == 1){
            return 1;
        }

        int left = maze(r -1,c);
        int right = maze(r, c - 1);

        return left + right;
    }
}
