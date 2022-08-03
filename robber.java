package day4;

class robber {
    public int rob(int[] nums) {
        // dp array containing the maximum sum that is obtained afterb robbing
        int l = nums.length;
        int dp[] = new int[l];
        if (l == 0)
            return 0;// if there are no houses to rob we get 0 value
        if (l == 1)
            return nums[0];// This shows that l=1 indicates that there is 1 element in array OR one house
                           // to rob
        return Math.max(robWithoutCircle(nums, dp, 1, l - 1), robWithoutCircle(nums, dp, 2, l));
    }

    public int robWithoutCircle(int[] nums, int[] dp, int s, int e) {
        dp[s - 1] = nums[s - 1];
        dp[s] = Math.max(nums[s - 1], nums[s]);
        // This gives the recursion relation as F(n)=max(an+f(n-2) , f(n-1))
        for (int i = s + 2; i < e; i++) {
            dp[i] = Math.max(dp[i - 1], nums[i] + dp[i - 2]);
        }
        return dp[e - 1];

    }

    public static void main(String[] args) {
        robber s = new robber();
        int[] nums = { 1, 2, 3, 1 };
        System.out.println(s.rob(nums));
    }
}