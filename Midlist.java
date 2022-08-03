package day4;

import parent_class.*;

class Solution {
    public ListNode middleNode(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        Solution s = new Solution();
        ListNode res = s.middleNode(head);
        System.out.println(res.val);

    }

    public ListNode deleteDuplicates(ListNode head) {
        return null;
    }

    public int treeheight(TreeNode root) {
        return 0;
    }
}