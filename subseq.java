import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

class Solution1 {
    public static void main(String[] args) {
        System.out.println(removeDuplicateLetters("ecbacba"));
    }

    // Greedily try to add one missing character. How to check if adding some
    // character will not cause problems ? Use bit-masks to check whether you will
    // be able to complete the sub-sequence if you add the character at some index
    // i.
    public static String removeDuplicateLetters(String s) {
        List<String> list = new ArrayList<>();
        int l = s.length(), lastlength = 0, cutoff = 0;

        for (int i = 0; i < l; i++) {
            cutoff = lastlength;

            String sub = "";
            char ch = s.charAt(i);
            sub += ch;
            for (int j = i + 1; j < l; j++) {
                char c = s.charAt(j);
                if (sub.indexOf(c) < 0) {
                    sub += c;
                }

            }

            lastlength = sub.length();
            if (lastlength >= cutoff)
                list.add(sub);
            else
                break;

        }

        TreeSet<String> set=new TreeSet<>();
        for (String string : list) {
            set.add(string);
        }
        return set.first();

    }
}