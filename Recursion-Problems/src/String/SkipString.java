package String;

public class SkipString {
    static void main() {
        System.out.println(skip("qrafacva"));
    }

    static void skip(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        if (ch == 'a'){
            skip(p,up.substring(1));
//            System.out.println(up.substring(1));
        }else {
            skip( ch + p, up.substring(1));
//            System.out.println(up.substring(1));
        }
    }

    static String skip(String up){
        if (up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);
        if (ch == 'a'){
            return skip(up.substring(1));
        }else{
            return  ch + skip(up.substring(1));
        }
    }
}
