package day4;

import java.util.*;;

public class hash {

    public boolean digitCount(String num) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (char c : num.toCharArray()) {
            int n = c - '0';
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        boolean ans = true;
        for (int i = 0; i < num.length(); i++) {

            if (map.containsKey(i)) {
                if (map.get(i) != num.charAt(i) - '0') {
                    ans = false;
                }
            } else if (!map.containsKey(i)) {
                if (num.charAt(i) - '0' != 0) {
                    ans = false;
                }

            }

        }
        return ans;

    }

    public static void main(String[] args) {
        hash s = new hash();
        String num = "1210";
        System.out.println(s.digitCount(num));
    }
}
