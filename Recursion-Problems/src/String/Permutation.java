package String;

public class Permutation {
    static void main() {
        permutatuon("","abc");
    }

    static void permutatuon(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0,i);
            String second = p.substring(i, p.length());

            permutatuon( first + ch + second, up.substring(1));
        }
    }
}
