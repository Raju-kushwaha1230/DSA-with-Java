package String;

public class SkipApple {
    static void main() {
        String s = "refappappldfv";
        System.out.println(skipAppNotApple(s));
    }

    static String skip(String up){
        if (up.isEmpty()){
            return "";
        }

        if (up.startsWith("apple")){
            return skip(up.substring(5));
        } else {
            return up.charAt(0) + skip(up.substring(1));
        }
    }

    static String skipAppNotApple(String s){
        if (s.isEmpty()){
            return "";
        }

        if (s.startsWith("app") && !s.startsWith("apple")){
            return skipAppNotApple(s.substring(3));
        }
        return s.charAt(0) + skipAppNotApple(s.substring(1));
    }
}
