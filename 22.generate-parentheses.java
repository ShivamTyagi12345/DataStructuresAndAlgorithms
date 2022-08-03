import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=22 lang=java
 *
 * [22] Generate Parentheses
 */

// @lc code=start
class Solution {
    List<String> ans = new ArrayList<>();

    public List<String> generateParenthesis(int n) {

        helper(n, n, "");
        return ans;

    }

    private void helper(int n1, int n2, String string) {
        if (n1 == 0 && n2 == 0) {
            ans.add(string);
            return;
        }
        // String s = string;
        if ((n1 == n2) || (n1 != 0))
            helper(n1 - 1, n2, string + "(");
        if (n2 != 0 && n1 < n2) {
            helper(n1, n2-1, string + ")");
        }

    }
}
// @lc code=end
