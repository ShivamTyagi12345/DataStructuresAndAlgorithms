import java.util.HashMap;
import java.util.LinkedHashMap;

public class decipher {
    public static String decodeMessage(String key, String message) {
        HashMap<Character, Character> map = new LinkedHashMap<>();
        int k = 0;

        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            if (c != ' ' && !map.containsKey(c)) {

                char value = (char) ('a' + k);
                map.putIfAbsent(c, value);
                k++;

            }

        }
        map.put(' ', ' ');

        String ans = "";
        for (char c : message.toCharArray()) {

            ans += map.get(c);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
    }

}
