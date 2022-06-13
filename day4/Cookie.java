package day4;

import java.util.HashMap;

//child with most cookies
class Cookie {
    public int maximumUniqueSubarray(int[] nums) {
        int p1 = 0;
        int maxSum = Integer.MIN_VALUE;
        int l = nums.length;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int p2 = 0; p2 < l; p2++) {

            map.put(nums[p2], map.getOrDefault(nums[p2], 0) + 1);
            sum += nums[p2];

            if (map.get(nums[p2]) > 1) {
                sum -= nums[p1];
                map.put(nums[p1], map.get(nums[p1] - 1));
                p1++;

            }
            maxSum = Math.max(maxSum, sum);

        }
        return maxSum;
    }

    public static void main(String[] args) {
        Cookie s = new Cookie();
        int[] nums = { 4, 2, 4, 5, 6 };
        System.out.println(s.maximumUniqueSubarray(nums));

    }

}
