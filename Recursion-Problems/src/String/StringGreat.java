package String;

public class StringGreat {
    static void main() {
        String s = "leEeetcode";
        System.out.println(great(s));
    }

    static String great(String s){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (sb.length() > 0 && Math.abs(sb.charAt(sb.length() - 1) - ch) == 32) {
                sb.deleteCharAt(sb.length() - 1);   // bad pair: pop
            } else {
                sb.append(ch);                       // otherwise: push
            }
        }

        return sb.toString();
    }
}
