package day4;

/**
 * password
 */
public class password {

    // code for Successful Pairs of Spells and Potions
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] result = new int[spells.length];
        for (int i = 0; i < spells.length; i++) {
            int count = 0;
            for (int j : potions) {
                if (spells[i] * j >= success) {
                    count++;
                }

            }
            result[i] = count;
        }
        return result;
    }

    public static void main(String[] args) {
        password p = new password();
        int[] spells = { 1, 2, 3, 4, 5 };
        int[] potions = { 1, 2, 3, 4, 5 };
        long success = 10;
        int[] result = p.successfulPairs(spells, potions, success);
        for (int i : result) {
            System.out.println(i);
        }
    }
}