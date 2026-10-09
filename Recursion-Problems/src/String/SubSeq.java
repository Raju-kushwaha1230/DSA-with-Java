package String;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class SubSeq {
    static void main() {
        String s = "abc";
//        subset("", s);
        System.out.println(subset1("", s));
    }

    static void subset(String p, String up){

        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subset(p, up.substring(1));
        subset(ch + p, up.substring(1));

    }

    static ArrayList<String> subset1(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> sns = new ArrayList<>();
            sns.add(p);
            return sns;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subset1(p, up.substring(1));
        ArrayList<String> right = subset1(p + ch, up.substring(1));

        left.addAll(right);

        return left;

    }
}
