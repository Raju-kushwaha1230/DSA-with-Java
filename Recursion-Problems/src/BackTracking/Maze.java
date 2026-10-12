package BackTracking;

import jdk.dynalink.linker.LinkerServices;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Maze {
    static void main() {
        System.out.println(maze(4,4));
        System.out.println(maze1(new ArrayList<>(), 3,3 ));
        System.out.println(maze2("",3,3));
        System.out.println(mazeDiag(3,3));
        System.out.println(mazeDaiStr("",3,3));
    }

    static int maze(int r,int c){
        if (r == 1 || c == 1){
            return 1;
        }

        int left = maze(r -1,c);// move down
        int right = maze(r, c - 1); // move right

        return left + right;
    }

    static List<List<String>> maze1(List<String> p, int r, int c){
        if ( r == 1 && c == 1){
            List<List<String>> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        List<List<String>> ans = new ArrayList<>();
        if (  c >1){
            List<String> right = new ArrayList<>(p);
            right.add("R");
            ans.addAll(maze1(right, r, c -1));
        }
        if (  r >1){
            List<String> down = new ArrayList<>(p);
            down.add("D");
             ans.addAll(maze1(down, r - 1, c ));
        }

         return ans;
    }


    static List<String> maze2(String p,int r, int c){
        if (r == 1 && c == 1){
            List<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        List<String> ans = new ArrayList<>();
        if (r > 1){
            ans.addAll(maze2(p + "D", r- 1, c));
        }
        if (c > 1){
            ans.addAll(maze2(p + "R", r, c-1));
        }
        return ans;
    }

    static int mazeDiag(int r, int c){
        if (r==1 || c ==1){
            return  1;
        }

        int left = mazeDiag( r -1, c);
        int dia = mazeDiag(r-1,c-1);
        int right = mazeDiag(r, c-1);

        return left+ dia + right;
    }

    static List<String> mazeDaiStr(String p, int r, int c){
        if (r == 1 && c ==1){
            List<String> ans = new ArrayList<>();
            ans.add(p);
            return  ans ;
        }

        List<String> ans = new ArrayList<>();
        if (r >1){
            ans.addAll(mazeDaiStr(p + "D", r -1, c));
        }
        if (c > 1){
            ans.addAll(mazeDaiStr(p + "R", r, c -1));
        }
        if ( r> 1 && c> 1){
            ans.addAll(mazeDaiStr(p + "d", r-1, c-1));
        }
        return ans;
    }
}
