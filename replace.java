package day4;

public class replace {
    // code to replace characters in a string with a 2d mapping of characters
    public boolean matchReplacement(String s, String sub, char[][] mappings) {
        char[] sArr = sub.toCharArray();
        boolean[] vis = new boolean[sArr.length];
        for (int i = 0; i < mappings.length; i++) {
            char c = mappings[i][0];
            char r = mappings[i][1];
            int index = sub.indexOf(c);

            if (!vis[index]) {
                sArr[index] = r;
                vis[index] = true;
            }

        }
        String s2 = String.valueOf(sArr);
        return s2.indexOf(s) != -1;

    }

    public static void main(String[] args) {
        replace r = new replace();

        String s = "fool3e7bar";
        String sub = "leet";
        char[][] mappings = { { 'e', '3' }, { 't', '7' }, { 't', '8' } };
        System.out.println(r.matchReplacement(s, sub, mappings));

    }

}
