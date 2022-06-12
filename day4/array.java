package day4;

import java.util.*;

class array {
    public int minOperations(int[] nums, int x) {
        int n = nums.length, sum = 0, maxLen = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        int target = sum - x;
        if (target < 0)
            return -1;
        if (target == 0)
            return n;

        sum = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (sum == target) {
                maxLen = i + 1;
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
            int t = sum - target;
            if (map.containsKey(t)) {
                if (maxLen < (i - map.get(t))) {
                    maxLen = i - map.get(t);
                }
            }
        }
        return maxLen == 0 ? -1 : n - maxLen;
    }

    public static void main(String[] args) {
        array a = new array();
        int[] nums = { 3, 2, 20, 1, 1, 3 };
        int x = 10;
        System.out.println(a.minOperations(nums, x));

    }
}
