package String;

public class RemoveStars {
    static void main() {
        String s = "leee**tco*de";
        System.out.println(skip("", s));
    }

    static String skip(String p,String up){
        if (up.isEmpty()){
            return p;
        }
        char ch = up.charAt(0);

        if (ch == '*'){

            return  skip(p.substring(0, p.length() - 1), up.substring(1));
        }
        return skip(  p + ch, up.substring(1));
    }
}
