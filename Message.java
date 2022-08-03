package day4;

import java.util.HashMap;

import javax.print.attribute.HashAttributeSet;

public class Message {
    public String largestWordCount(String[] messages, String[] senders) {
        int max = Integer.MIN_VALUE;
        String person = "";
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < senders.length; i++) {
            int l = messages[i].split(" ").length + map.getOrDefault(senders[i], 0);
            map.put(senders[i], l);
            if (max < l || l == max && person.compareTo(senders[i]) < 0) {
                max = l;
                person = senders[i];

            }

        }
        return person;

    }

}
