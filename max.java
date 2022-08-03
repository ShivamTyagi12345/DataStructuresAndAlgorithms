import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class newmerge {

   static List<int[]> list = new ArrayList<>();
    public static void main(String[] args) {
        int [][] nums=
        {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.toString(merge(nums)));


        
    }

    public  static int[][] merge(int[][] nums) {
        int r = nums.length;
        boolean[] vis = new boolean[r];
      

        for (int i = 0; i < r; i++) {
            int[] local = new int[2];
            if (!vis[i]) {
                local = find(nums, vis, i, local);// for every interval in nums i can get the value of local
                list.add(local);

            }
            

        }
         int[][] ans = new int[list.size()][2];
        int k=0;
        for(int[] it:list){
            ans[k++]=it;
            
            
        }
        return ans;

    }
    // i 0
    // vis T F F F

    private static  int[] find(int[][] nums, boolean[] vis, int i, int[] local) {
        vis[i] = true;
        for (int j = 0; j < local.length; j++) {
            // continuted outside interval or continued inside interval
            if ((nums[i][0] < nums[j][1] && nums[i][1] <= nums[j][0])
                    || (nums[i][0] <= nums[j][0] && nums[i][1] >= nums[j][0])) {
                local[0] = nums[i][0];
                local[1] = nums[j][1];
                vis[j] = true;
            }

            // contained interval
            if (nums[i][0] <= nums[j][0] && nums[i][1] >= nums[j][1]) {
                local[0] = nums[i][0];
                local[1] = nums[i][1];
                vis[j] = true;

            }

        }
        return local;
    }

}