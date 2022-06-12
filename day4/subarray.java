package day4;

class subarray {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i : nums)
            if (i == k)
                count++;
        int l = nums.length;
        for (int wsize = 2; wsize <= l; wsize++) {
            // 1 indexed
            int s = 0;
            int e = wsize;
            int sum = 0;
            for (int i = 0; i < e; i++) {
                sum += nums[i];
                if (sum == k)
                    count++;
            }
            while (e < l) {
                sum = sum + nums[e] - nums[s];
                if (sum == k)
                    count++;
                e++;
                s++;
            }

        }

        return count;
    }

    public static void main(String[] args) {
        subarray s = new subarray();
        int[] nums = { 1, 1, 1 };
        int k = 2;
        System.out.println(s.subarraySum(nums, k));
    }
}
