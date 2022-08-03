import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode id=1202 lang=java
 *
 * [1202] Smallest String With Swaps
 */

// @lc code=start
class Solution7 {
    public static void main(String[] args) {
        Solution7 s = new Solution7();
        String s1 = "dcab";
        List<List<Integer>> pairs = new ArrayList<>();
        pairs.add(new ArrayList<>(Arrays.asList(0, 3)));
        pairs.add(new ArrayList<>(Arrays.asList(1, 2)));
        System.out.println(s.smallestStringWithSwaps(s1, pairs));
        
    }
    static int[] id, sz;

    public static void UnionFind(int n) {
        id = new int[n];
        sz = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
            sz[i] = 1;
        }
    }

    public static int find(int p) {
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

    public static void union(int p, int q) {
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

    public static String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        int n = s.length();
        UnionFind(n);
        for (List<Integer> pair : pairs) {
            int p = pair.get(0);
            int q = pair.get(1);
            union(p, q);
        }
        int[] count = new int[n];
        for (int i = 0; i < n; i++)
            count[find(i)]++;
        char[] ans = s.toCharArray();
        for (int i = 0; i < n; i++) {
            int root = find(i);
            for (int j = 0; j < count[root]; j++)
                ans[root] = s.charAt(i);
        }
        return new String(ans);
    }

    // i dont know the hell what to do and idgaf

    // s=string + pair array of indices
    // using that pair i have to swap elements in the original string to make it
    // lex. smallest

    // i am supposed to use HashMAP
    // This is a graph question

    // s= dcab 0:d 1:c 2:a 3:b
    // ideal
    // (res)=abcd
    // Map 0:a 1:b 2:c 3:d

    // 1st swap 0-3: bcad
    // 1st swap for top sort: b d
    // 2nd swap 1-2: bacd
    // 2nd swap for top sort: a c
    // 3rd swap 0-2: cabd
    // 3rd swap for top sort:

    // Imp: These swapping orders can be rearranged too

    // since we have to arrange n this is graphs: Top sort

    // But this problem is of Union Find since we have edges in pairs
    // so we have to use Union Find to find the connected components
    // and then we can use top sort to arrange the string
    // and then we can use Union Find to find the connected components

}

// @lc code=end
