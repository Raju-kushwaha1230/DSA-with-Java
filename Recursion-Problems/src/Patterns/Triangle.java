package Patterns;

public class Triangle {
    static void main() {
        traingle1(4,0);
    }

    static void triangel(int r, int c){
        if (r == 0){
            return;
        }
        if (c < r){
            System.out.print("*");
            triangel(r, c+1);
        } else {
            System.out.println();
            triangel(r-1, 0);
        }
    }

    static void traingle1(int r, int c){
        if (r == 0){
            return;
        }
        if (c < r){
            traingle1(r, c+ 1);
            System.out.print("*");
        }else{
            traingle1(r -1, 0);
            System.out.println();
        }
    }
}
