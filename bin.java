package day4;

import java.util.*;

class bin {
    public int[] arrayChange(int[] nums, int[][] operations) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < operations.length; i++) {
            int index = map.get(operations[i][0]);
            nums[index] = operations[i][1];
            // modify the map
            map.remove(operations[i][0]);
            map.put(nums[index], index);

        }
        return nums;

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        int[][] operations = { { 1, 5 }, { 2, 6 } };
        bin b = new bin();
        System.out.println(Arrays.toString(b.arrayChange(nums, operations)));

    }
}