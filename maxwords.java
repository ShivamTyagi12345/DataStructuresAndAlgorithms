public class maxwords {
    public int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;
        for (String string : sentences)
            max = Math.max(string.trim().split(" ").length, max);

        return max;

    }
}
