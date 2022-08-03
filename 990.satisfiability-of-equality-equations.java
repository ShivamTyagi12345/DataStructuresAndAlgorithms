/*
 * @lc app=leetcode id=990 lang=java
 *
 * [990] Satisfiability of Equality Equations
 */

// @lc code=start
class Solution6 {
    public static void main(String[] args) {
        Solution6 s = new Solution6();

        System.out.println(s.equationsPossible(new String[]{"c==c","b==d","x!=z"
        }));


    }
    private int[] id, sz;

    public void UnionFind(int n) {
        id = new int[n];
        sz = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
            sz[i] = 1;
        }
    }

    public int find(int p) {
        int root = p;
        while (root != id[root])
            root = id[root];
        while (p != root) { // Do path compression
            int next = id[p];
            id[p] = root;
            p = next;
        }
        return root;
    }

    public void union(int p, int q) {
        int root1 = find(p);
        int root2 = find(q);
        if (root1 == root2)
            return;
        if (sz[root1] < sz[root2]) {
            sz[root2] += sz[root1];
            id[root1] = root2;
        } else {
            sz[root1] += sz[root2];
            id[root2] = root1;
        }
    }

    public boolean equationsPossible(String[] equations) {
        // int n = equations.length;
        UnionFind(26);
        for (String equation : equations) {
            if (equation.charAt(1) == '=') { 
                int p = equation.charAt(0) - 'a';
                int q = equation.charAt(3) - 'a';
                union(p, q);
            }
        }
        for (String equation : equations) {
            if (equation.charAt(1) == '!') {
                int p = equation.charAt(0) - 'a';
                int q = equation.charAt(3) - 'a';
                if (find(p) == find(q))
                    return false;
            }
        }
        return true;
    }
}
// @lc code=end
