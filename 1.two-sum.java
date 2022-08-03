/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution8 {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] res = twoSum(nums, target);
        System.out.println(res[0] + " " + res[1]);

    }

    public static int[] twoSum(int[] nums, int target) {
        // i might not be able to solve i may solve the important thibng is tgat i try
        // my best

        // if i sort the array
        // 2 7 11 15
        // target =nums[i]+ nums[j]
        // make two pointers
        // p1 p2
        // while(pi<p2)
        // if i dont mind target - nums[p1] , i will increase p1 and then move p2 to
        // last for new itteration

        int p1 = 0;
        int l = nums.length;
        while (p1 < l) {
            int dif = target - nums[p1];
            int p2 = l - 1;

            while (p2 > p1) {

                if (nums[p2] == dif) {
                    return new int[] {
                            p1, p2
                    };

                } else
                    p2--;
            }

            p1++;

        }
        return null;

    }
}
// @lc code=end
